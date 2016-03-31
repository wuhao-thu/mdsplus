import MDSplus

class RASPI(MDSplus.Device):
    """
    Device class to support raspberry pi cameras.

    methods:
      init
      store
    """

    parts = [
        {'path':':COMMENT','type':'text'},
        {'path':':COMPRESSED','type':'numeric','value':0,'options':('no_write_shot',)},
        {'path':':KEEP','type':'numeric','value':0,'options':('no_write_shot',)},
        {'path':':DIRECTORY','type':'text','value':'/usr/local/cmod/codes/raspicam/','options':('no_write_shot',)},
        {'path':':TRIGGER','type':'numeric','options':('no_write_shot',)},
        {'path':':WIDTH','type':'numeric','value':640,'options':('no_write_shot',)},
        {'path':':HEIGHT','type':'numeric','value':480,'options':('no_write_shot',)},
        {'path':':FPS','type':'numeric','value':30,'options':('no_write_shot',)},
        {'path':':EXPOSURE','type':'numeric','value':15,'options':('no_write_shot',)},
        {'path':':BRIGHTNESS','type':'numeric','value':10,'options':('no_write_shot',)},
        {'path':':CONTRAST','type':'numeric','value':3,'options':('no_write_shot',)},
        {'path':':NUM_FRAMES','type':'numeric','value':60,'options':('no_write_model','write_once',)},
        {'path':':TIMES','type':'axis', 'options':('write_once',)},
        {'path':':FRAMES','type':'signal','options':('no_write_model','write_once',)},
        {'path':':COEFFS','type':'numeric','value':MDSplus.Float32Array([.3,.3,.3]),'options':('no_write_shot',)},
        {'path':':FRAMES_SIG','type':'signal','options':('write_once',)},
        {'path':':INTENSITY','type':'signal','options':('write_once',)},
        {'path':':INTENS_SIG','type':'signal','options':('write_once',)},
        {'path':':INIT_ACTION','type':'action',
         'valueExpr':"Action(Dispatch('CAMAC_SERVER','INIT',50,None),Method(None,'INIT',head,'auto'))",
         'options':('no_write_shot',)},
        {'path':':STORE_ACTION','type':'action',
         'valueExpr':"Action(Dispatch('DATA_SERVER','STORE',50,None),Method(None,'STORE',head))",
         'options':('no_write_shot',)}]

    subproc = None

    def fileName(self):
        dir = str(self.directory.record)
        if dir[-1] == '/':
            dir = dir[:-1]
        if self.debugging:
            print "raspi:  dir is %s"%dir
        return "%s/%s_%d_%s"%(dir,self.local_tree,self.tree.shot,self.local_path.replace('.', '_').replace(':', '_').replace('\\', '_'),)

    def init(self):
        """
        Init method for the raspberry pi camera device.

        Start by deleting any running subrocesses that may be left
        over from previous inits, note the subprocess is stored in a 
        class variable (ONLY one of these per server !)

        Read all of the settings and create a script to take the data.

        Note:  This device supports at most 1 camera per server.  Which is 
        OK since the raspberry pis only have one camera port.
        """

        import os
        import subprocess

        if RASPI.subproc :
            try:
                RASPI.subproc.terminate()
            except:
                pass

        compressed=int(self.compressed)
        num_frames=int(self.num_frames)
        exposure=int(self.exposure)
        brightness=int(self.brightness)
        contrast=int(self.contrast)
        width=int(self.width)
        height=int(self.height)
        fps=int(self.fps)
        self.debugging = os.getenv("DEBUG_DEVICES")
        cmds = []
        if compressed:
            cmds = [
                "/usr/local/bin/trig.py\n", 
                "raspivid -w %d -h %d -fps %d -t %d -ss %d -br %d -co %d -o %s.h264\n" % (width, height, fps, int(float(num_frames)/fps*1000), exposure, brightness, contrast, self.fileName())]
            print cmds
        else:
            cmds = [
                "v4l2-ctl --set-fmt-video=width=%d,height=%d,pixelformat=2 --set-ctrl=exposure_time_absolute=%d,brightness=%d,contrast=%d,auto_exposure=1,white_balance_auto_preset=3\n"%(width, height, exposure, brightness, contrast,),
                "/usr/local/bin/trig.py\n", 
                "v4l2-ctl --stream-mmap=%d --stream-count=%d --stream-to=%s.rgb\n" % (num_frames, num_frames, self.fileName())]

	RASPI.subproc = subprocess.Popen(['/bin/sh'], stdout=subprocess.PIPE, stdin=subprocess.PIPE, stderr=subprocess.PIPE,shell=False)
        for cmd in cmds:
            if self.debugging:
                print cmd
            RASPI.subproc.stdin.write(cmd)
        RASPI.subproc.stdin.flush()
        return 1

    INIT=init


    def store(self):
        import os
        import numpy as np
        import MDSplus
        import imageio

        self.debugging = os.getenv("DEBUG_DEVICES")

        num_frames=int(self.num_frames)
        width=int(self.width)
        height=int(self.height)

        compressed=int(self.compressed)
        filename = "%s.%s"%(self.fileName(), ('h264' if compressed else 'rgb'), )
        if self.debugging:
            print "raspicam: reading %s"%filename
        self.times.record = MDSplus.Data.compile('$1 : $1+($2-1)/$3 : $3', self.trigger, self.num_frames, self.fps)
        self.intensity.record = MDSplus.Data.compile("$1['r',*,*,*]*$2[0]+$1['g',*,*,*]*$2[2]+$1['b',*,*,*]*$2[2]", self.frames, self.coeffs)
        if not compressed:
            img = np.fromfile(filename, dtype=np.uint8)
            img=img.reshape(num_frames, height, width, 3)
            self.frames.record = MDSplus.Signal(img, None, [ 'r' ,'g' , 'b' ], MDSplus.Range(0, width-1), MDSplus.Range(0, height-1), self.times)
        else:
            ans = None
            count = 0
            vid = imageio.get_reader(filename, 'ffmpeg')
            meta = vid.get_meta_data()
            ans = np.empty((num_frames, height, width, 3),dtype=np.uint8)
            try:
                for i in range(num_frames):
                    im = vid.get_data(i)
                    ans[i,:,:,:] = im
            except Exception, e:
                print e
            ans = ans[0:i-1,:,:,:]
            ans=ans.reshape(i-1, height, width, 3)
            self.frames.record = MDSplus.Signal(ans, None, [ 'r' ,'g' , 'b' ], MDSplus.Range(0, width-1), MDSplus.Range(0, height-1), self.times)
        if self.keep.record == 0:
            os.remove(filename)
        return 1
    STORE=store

