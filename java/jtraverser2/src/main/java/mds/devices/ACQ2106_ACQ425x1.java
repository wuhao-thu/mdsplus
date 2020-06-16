package mds.devices;

import java.awt.Frame;

import mds.data.descriptor_s.NODE;
import mds.devices.acq4xx.ACQ2106;
import mds.devices.acq4xx.ACQ425;

public class ACQ2106_ACQ425x1 extends ACQ2106
{
	public ACQ2106_ACQ425x1(final Frame frame, final NODE<?> head, final boolean editable)
	{
		super(frame, head, editable, 1, ACQ425.ACQ425_16CH.class);
	}
}
