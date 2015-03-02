from MDSplus import *
from numpy import *
from threading import *
from ctypes import *
import datetime
import time

class CYGNET4K(Device):
    print 'Cygnet4K'
    Int32(1).setTdiVar('_PyReleaseThreadLock')
    """Cygnet 4K sCMOS Camera"""
    parts=[
      {'path':':CONF_FILE', 'type':'text'},
      {'path':':COMMENT', 'type':'text'},
      {'path':':ID', 'type':'numeric'},
      {'path':':EXP_TIME', 'type':'numeric', 'value':20E-3},
      {'path':':BINNING', 'type':'text', 'value':'1x1'},
      {'path':':ROI_X', 'type':'numeric', 'value':0},
      {'path':':ROI_Y', 'type':'numeric', 'value':0},
      {'path':':ROI_WIDTH', 'type':'numeric', 'value':2048},
      {'path':':ROI_HEIGHT', 'type':'numeric', 'value':2048},
      {'path':':FRAME_SYNC', 'type':'text', 'value':'EXTERNAL'},
      {'path':':FRAME_FREQ', 'type':'numeric', 'value':100E-3},
      {'path':':FRAME_CLOCK', 'type':'numeric'},
      {'path':':TRIG_TIME', 'type':'numeric', 'value':0.},
      {'path':':DURATION', 'type':'numeric', 'value':1.},
      {'path':':SENSOR_TEMP', 'type':'numeric'},
      {'path':':PCB_TEMP', 'type':'numeric'},
      {'path':':FRAMES', 'type':'signal','options':('no_write_model', 'no_compress_on_put')}]
    parts.append({'path':':INIT_ACT','type':'action',
	  'valueExpr':"Action(Dispatch('CAMERA_SERVER','PULSE_PREP',50,None),Method(None,'init',head))",
	  'options':('no_write_shot',)})
    parts.append({'path':':START_ACT','type':'action',
	  'valueExpr':"Action(Dispatch('CPCI_SERVER','INIT',50,None),Method(None,'start_store',head))",
	  'options':('no_write_shot',)})
    parts.append({'path':':STOP_ACT','type':'action',
	  'valueExpr':"Action(Dispatch('CPCI_SERVER','STORE',50,None),Method(None,'stop_store',head))",
	  'options':('no_write_shot')})
    print 'Cygnet4K added'
    
 
