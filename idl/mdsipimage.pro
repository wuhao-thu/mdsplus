function mds$socket,quiet=quiet,status=status,socket=socket
  status = 1
  sockmin=1l-(!version.os eq 'MacOS')
  sock=sockmin-1
  if (keyword_set(socket)) then $
      if (socket ge sockmin) then $
          return, socket
  defsysv,'!MDS_SOCKET',exists=old_sock
  if not old_sock then defsysv,'!MDS_SOCKET',sock else tmp = execute('sock=!MDS_SOCKET')
  if sock lt sockmin then begin
    status = 0
    if not keyword_set(quiet) then message,'Use MDS$CONNECT to connect to a host.',/continue
    return,0
  endif
  status = 1 
  return,sock
end

function MdsRoutinePrefix
;Descriptors or argc/argv convention?
;Shouldn't need to be changed for macos
;By the way, probably didn't need to port routines beginning with "Idl"
  if !version.os eq 'vms' then return,'' else return,'Idl'
end

Function MdsIPImage
;Path to shared library
  case !version.os of
    'vms' : if float(strmid(!version.release,0,3)) ge 5.2 then return,'mdsipshr_ieee' else return,'mdsipshr'
    'windows' : return,'mdsipshr'
	'Win32'	: return,'mdsipshr'
    'AIX' : return,'libMdsIpShr.lib'
    'IRIX' : return,'libMdsIpShr.so'
    'OSF' : return,'libMdsIpShr.so'
    'sunos' : return,'libMdsIpShr.so'
    'hp-ux' : begin
              if getenv('MDS_SHLIB_PATH') eq '' then setenv_,'MDS_SHLIB_PATH=/usr/local/lib'
              return,getenv('MDS_SHLIB_PATH')+'/libMdsIpShr.sl'
              end
    'MacOS': return,!dir+'libMdsIpShr.lib'
    'linux': return,'libMdsIpShr.so'
    else  : message,'MDS is not supported on this platform',/IOERROR 
  endcase
end
