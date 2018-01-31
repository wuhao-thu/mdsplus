/*
Copyright (c) 2017, Massachusetts Institute of Technology All rights reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions are met:

Redistributions of source code must retain the above copyright notice, this
list of conditions and the following disclaimer.

Redistributions in binary form must reproduce the above copyright notice, this
list of conditions and the following disclaimer in the documentation and/or
other materials provided with the distribution.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/
#include <fstream>
#include <string>
#include <mdsobjects.h>
#include "testing.h"
#include "testutils/unique_ptr.h"
#ifdef _WIN32
#include <windows.h>
#define setenv(name,val,extra) _putenv_s(name,val)
#endif


using namespace MDSplus;
using namespace testing;

#define NUM_THREADS 8
#define NUM_REPEATS 8
#define MEM_ALLOC 1024

static char** cmds;
static int    ncmd;

void loadCmds(const char* filename){
    std::ifstream file(filename);
    if (!file.is_open()) {
      std::cerr << "File not found: " << filename << "\n";
      exit(1);
    }
    std::string str;
    int memlen = sizeof(char*)+MEM_ALLOC;
    cmds = (char**)malloc(memlen);
    ncmd = 0;
    while (std::getline(file, str)){
      if ((ncmd+1) > MEM_ALLOC) {
        char** ocmds = cmds;
        int omemlen = memlen;
        memlen += sizeof(char*)+MEM_ALLOC;
        cmds = (char**)malloc(memlen);
        memcpy(cmds,ocmds,omemlen);
        free(ocmds);
      }
      cmds[ncmd] = (char*)malloc(str.length()+1);
      strcpy(cmds[ncmd++],str.c_str());
    }
}

void* Test(void* args){
  int idx = (int)*(int64_t*)&args;
  int ii = 0,ic = 0;
  setenv("t_tdi_path",".",1);
  delete MDSplus::execute("TreeShr->TreeUsePrivateCtx(1)");
  MDSplus::Int32* shot = new MDSplus::Int32(10*idx+1);
  delete MDSplus::executeWithArgs("_SHOT=$",1,shot);
  delete shot;
  delete MDSplus::execute("_EXPT='T_TDI'");
  try {
    for (; ii<NUM_REPEATS ; ii++)
      for (;ic<ncmd; ic++) {
        if (strlen(cmds[ic])==0 || *cmds[ic] == '#') continue;
        int status = AutoPointer<Data>(MDSplus::execute(cmds[ic]))->getInt();
        if (!status) throw std::exception();
        if (!(status&1)) throw MDSplus::MdsException(status);
      }
  } catch (MDSplus::MdsException) {
    std::cerr << "ERROR in cycle " << ii << " >> " << cmds[ic] << "\n";
    throw;
  } catch (...) {
    std::cerr << "FAILED in cycle " << ii << " >> " << cmds[ic] << "\n";
    throw;
  }
  return NULL;
}

void MultiThreadTest() {
    pthread_t threads[NUM_THREADS];
    pthread_attr_t attr, *attrp;
    if (pthread_attr_init(&attr))
      attrp = NULL;
    else {
      attrp = &attr;
      pthread_attr_setstacksize(&attr, 0x100000);
    }
    int64_t nt;
    for (nt = 0 ; nt<NUM_THREADS ; nt++){
      if (pthread_create(&threads[nt], attrp, Test, *(void**)&nt))
        break;
    }
    if (attrp) pthread_attr_destroy(attrp);
    if (nt<NUM_THREADS) fprintf(stderr,"Could not create all %d threads\n", NUM_THREADS);
    for (; nt-->0;)
      pthread_join(threads[nt],NULL);
}


int main(int argc, char *argv[]){
    if (argc>1)
      loadCmds(argv[1]);
    else {
      char* srcdir = std::getenv("srcdir");
      if (!srcdir) loadCmds("./MdsTdiTest.tdi");
      else {
        char* filename = (char*)malloc(strlen(srcdir)+16);
        memcpy(filename,srcdir,strlen(srcdir));
        strcpy(filename+strlen(srcdir),"/MdsTdiTest.tdi");
        loadCmds(filename);
        free(filename);
      }
    }
    BEGIN_TESTING(SingleThread);
    setenv("t_tdi_path",".",1);
    Test(NULL);
    END_TESTING;
    BEGIN_TESTING(MultiThread);
    MultiThreadTest();
    END_TESTING;
    for (;ncmd-->0;) free(cmds[ncmd]);
    free(cmds);
}
