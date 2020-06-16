import java.awt.*;
import javax.swing.*;

/**
 * <p>
 * Title:
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Copyright: Copyright (c) 2003
 * </p>
 * <p>
 * Company:
 * </p>
 *
 * @author not attributable
 * @version 1.0
 */
public class DIO2EncoderSetup extends DeviceSetup
{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	BorderLayout borderLayout1 = new BorderLayout();
	DeviceButtons deviceButtons1 = new DeviceButtons();
	JPanel jPanel1 = new JPanel();
	JPanel jPanel2 = new JPanel();
	GridLayout gridLayout1 = new GridLayout();
	JPanel jPanel3 = new JPanel();
	JPanel jPanel4 = new JPanel();
	DeviceField deviceField1 = new DeviceField();
	DeviceChoice deviceChoice2 = new DeviceChoice();
	DeviceField deviceField2 = new DeviceField();
	DeviceChoice deviceChoice3 = new DeviceChoice();
	DeviceField deviceField3 = new DeviceField();
	BorderLayout borderLayout2 = new BorderLayout();
	JScrollPane jScrollPane1 = new JScrollPane();
	JPanel jPanel5 = new JPanel();
	GridLayout gridLayout2 = new GridLayout();
	DeviceChannel deviceChannel1 = new DeviceChannel();
	JPanel jPanel6 = new JPanel();
	DeviceChoice deviceChoice4 = new DeviceChoice();
	DeviceField deviceField4 = new DeviceField();
	DeviceField deviceField5 = new DeviceField();
	DeviceField deviceField6 = new DeviceField();
	DeviceDispatch deviceDispatch1 = new DeviceDispatch();
	DeviceField deviceField7 = new DeviceField();
	JPanel jPanel7 = new JPanel();
	DeviceChannel deviceChannel2 = new DeviceChannel();
	DeviceField deviceField8 = new DeviceField();
	DeviceField deviceField9 = new DeviceField();
	DeviceField deviceField10 = new DeviceField();
	DeviceChoice deviceChoice6 = new DeviceChoice();
	JPanel jPanel8 = new JPanel();
	DeviceChannel deviceChannel3 = new DeviceChannel();
	DeviceField deviceField11 = new DeviceField();
	DeviceField deviceField12 = new DeviceField();
	DeviceField deviceField13 = new DeviceField();
	DeviceChoice deviceChoice7 = new DeviceChoice();
	JPanel jPanel9 = new JPanel();
	DeviceChannel deviceChannel4 = new DeviceChannel();
	DeviceField deviceField14 = new DeviceField();
	DeviceField deviceField15 = new DeviceField();
	DeviceField deviceField16 = new DeviceField();
	DeviceChoice deviceChoice8 = new DeviceChoice();
	JPanel jPanel10 = new JPanel();
	DeviceChannel deviceChannel5 = new DeviceChannel();
	DeviceField deviceField17 = new DeviceField();
	DeviceField deviceField18 = new DeviceField();
	DeviceField deviceField19 = new DeviceField();
	DeviceChoice deviceChoice9 = new DeviceChoice();
	JPanel jPanel11 = new JPanel();
	DeviceChannel deviceChannel6 = new DeviceChannel();
	DeviceField deviceField110 = new DeviceField();
	DeviceField deviceField111 = new DeviceField();
	DeviceField deviceField112 = new DeviceField();
	DeviceChoice deviceChoice10 = new DeviceChoice();
	JPanel jPanel12 = new JPanel();
	DeviceChannel deviceChannel7 = new DeviceChannel();
	DeviceField deviceField113 = new DeviceField();
	DeviceField deviceField114 = new DeviceField();
	DeviceField deviceField115 = new DeviceField();
	DeviceChoice deviceChoice11 = new DeviceChoice();
	JPanel jPanel13 = new JPanel();
	DeviceChannel deviceChannel8 = new DeviceChannel();
	DeviceField deviceField116 = new DeviceField();
	DeviceField deviceField117 = new DeviceField();
	DeviceField deviceField118 = new DeviceField();
	DeviceChoice deviceChoice12 = new DeviceChoice();
	JPanel jPanel14 = new JPanel();
	DeviceChannel deviceChannel9 = new DeviceChannel();
	DeviceField deviceField119 = new DeviceField();
	DeviceField deviceField1110 = new DeviceField();
	DeviceField deviceField1111 = new DeviceField();
	DeviceChoice deviceChoice13 = new DeviceChoice();
	JPanel jPanel15 = new JPanel();
	DeviceChannel deviceChannel10 = new DeviceChannel();
	DeviceField deviceField1112 = new DeviceField();
	DeviceField deviceField1113 = new DeviceField();
	DeviceField deviceField1114 = new DeviceField();
	DeviceChoice deviceChoice14 = new DeviceChoice();
	JPanel jPanel16 = new JPanel();
	DeviceChannel deviceChannel11 = new DeviceChannel();
	DeviceField deviceField1115 = new DeviceField();
	DeviceField deviceField1116 = new DeviceField();
	DeviceField deviceField1117 = new DeviceField();
	DeviceChoice deviceChoice15 = new DeviceChoice();
	JPanel jPanel17 = new JPanel();
	DeviceChannel deviceChannel12 = new DeviceChannel();
	DeviceField deviceField1118 = new DeviceField();
	DeviceField deviceField1119 = new DeviceField();
	DeviceField deviceField11110 = new DeviceField();
	DeviceChoice deviceChoice16 = new DeviceChoice();
	JPanel jPanel18 = new JPanel();
	DeviceChannel deviceChannel13 = new DeviceChannel();
	DeviceField deviceField11111 = new DeviceField();
	DeviceField deviceField11112 = new DeviceField();
	DeviceField deviceField11113 = new DeviceField();
	DeviceChoice deviceChoice17 = new DeviceChoice();
	JPanel jPanel19 = new JPanel();
	DeviceChannel deviceChannel14 = new DeviceChannel();
	DeviceField deviceField11114 = new DeviceField();
	DeviceField deviceField11115 = new DeviceField();
	DeviceField deviceField11116 = new DeviceField();
	DeviceChoice deviceChoice18 = new DeviceChoice();
	JPanel jPanel110 = new JPanel();
	DeviceChannel deviceChannel15 = new DeviceChannel();
	DeviceField deviceField11117 = new DeviceField();
	DeviceField deviceField11118 = new DeviceField();
	DeviceField deviceField11119 = new DeviceField();
	DeviceChoice deviceChoice19 = new DeviceChoice();
	JPanel jPanel111 = new JPanel();
	DeviceChannel deviceChannel16 = new DeviceChannel();
	DeviceField deviceField111110 = new DeviceField();
	DeviceField deviceField111111 = new DeviceField();
	DeviceField deviceField111112 = new DeviceField();
	DeviceChoice deviceChoice110 = new DeviceChoice();
	JPanel jPanel112 = new JPanel();
	DeviceChannel deviceChannel17 = new DeviceChannel();
	DeviceField deviceField111113 = new DeviceField();
	DeviceField deviceField111114 = new DeviceField();

	public DIO2EncoderSetup()
	{
		try
		{
			jbInit();
		}
		catch (final Exception e)
		{
			e.printStackTrace();
		}
	}

	private void jbInit() throws Exception
	{
		this.setWidth(770);
		this.setHeight(640);
		this.setDeviceType("DIO2Encoder");
		this.setDeviceProvider("localhost");
		this.setDeviceTitle("DIO2 Timing Encoder");
		this.getContentPane().setLayout(borderLayout1);
		jPanel1.setLayout(gridLayout1);
		gridLayout1.setColumns(1);
		gridLayout1.setRows(2);
		deviceField1.setOffsetNid(4);
		deviceField1.setTextOnly(true);
		deviceField1.setLabelString("Comment: ");
		deviceField1.setNumCols(30);
		deviceField1.setIdentifier("");
		deviceField3.setOffsetNid(1);
		deviceField3.setLabelString("Board ID:");
		deviceField3.setNumCols(4);
		deviceField3.setIdentifier("");
		deviceChoice3.setChoiceIntValues(null);
		deviceChoice3.setChoiceFloatValues(null);
		deviceChoice3.setOffsetNid(2);
		deviceChoice3.setLabelString("Mode: ");
		deviceChoice3.setChoiceItems(new String[]
		{ "LOCAL", "REMOTE" });
		deviceChoice3.setUpdateIdentifier("");
		deviceChoice3.setIdentifier("");
		deviceField2.setOffsetNid(3);
		deviceField2.setTextOnly(true);
		deviceField2.setLabelString("Crate IP Addr.: ");
		deviceField2.setNumCols(15);
		deviceField2.setIdentifier("");
		jPanel2.setLayout(borderLayout2);
		jPanel5.setLayout(gridLayout2);
		gridLayout2.setColumns(1);
		gridLayout2.setRows(17);
		deviceChannel1.setLabelString("Ch 1: ");
		deviceChannel1.setOffsetNid(6);
		deviceChannel1.setBorderVisible(true);
		deviceChannel1.setInSameLine(true);
		deviceChannel1.setUpdateIdentifier("");
		deviceChannel1.setShowVal("");
		deviceChoice4.setChoiceIntValues(null);
		deviceChoice4.setChoiceFloatValues(null);
		deviceChoice4.setOffsetNid(10);
		deviceChoice4.setLabelString("Termination: ");
		deviceChoice4.setChoiceItems(new String[]
		{ "ON", "OFF" });
		deviceChoice4.setUpdateIdentifier("");
		deviceChoice4.setIdentifier("");
		deviceField4.setOffsetNid(9);
		deviceField4.setLabelString("Time: ");
		deviceField4.setNumCols(15);
		deviceField4.setIdentifier("");
		deviceField5.setOffsetNid(8);
		deviceField5.setLabelString("Event code");
		deviceField5.setNumCols(4);
		deviceField5.setIdentifier("");
		deviceField6.setOffsetNid(7);
		deviceField6.setTextOnly(true);
		deviceField6.setLabelString("Event name: ");
		deviceField6.setIdentifier("");
		deviceChoice2.setChoiceIntValues(null);
		deviceChoice2.setChoiceFloatValues(null);
		deviceChoice2.setOffsetNid(5);
		deviceChoice2.setLabelString("Clock source: ");
		deviceChoice2.setChoiceItems(new String[]
		{ "INTERNAL", "HIGHWAY" });
		deviceChoice2.setUpdateIdentifier("");
		deviceChoice2.setIdentifier("");
		deviceField7.setIdentifier("");
		deviceField7.setNumCols(4);
		deviceField7.setLabelString("Event code");
		deviceField7.setOffsetNid(88);
		deviceChannel2.setLabelString("Ch Software: ");
		deviceChannel2.setOffsetNid(86);
		deviceChannel2.setBorderVisible(true);
		deviceChannel2.setInSameLine(true);
		deviceChannel2.setUpdateIdentifier("");
		deviceChannel2.setShowVal("");
		deviceField8.setOffsetNid(87);
		deviceField8.setTextOnly(true);
		deviceField8.setLabelString("Event name: ");
		deviceField8.setIdentifier("");
		deviceField9.setOffsetNid(89);
		deviceField9.setLabelString("Time: ");
		deviceField9.setNumCols(15);
		deviceField9.setIdentifier("");
		deviceField10.setIdentifier("");
		deviceField10.setNumCols(4);
		deviceField10.setLabelString("Event code");
		deviceField10.setOffsetNid(83);
		deviceChoice6.setIdentifier("");
		deviceChoice6.setUpdateIdentifier("");
		deviceChoice6.setChoiceItems(new String[]
		{ "ON", "OFF" });
		deviceChoice6.setLabelString("Termination: ");
		deviceChoice6.setOffsetNid(85);
		deviceChoice6.setChoiceFloatValues(null);
		deviceChoice6.setChoiceIntValues(null);
		deviceChannel3.setLabelString("Ch 16: ");
		deviceChannel3.setOffsetNid(81);
		deviceChannel3.setBorderVisible(true);
		deviceChannel3.setInSameLine(true);
		deviceChannel3.setUpdateIdentifier("");
		deviceChannel3.setShowVal("");
		deviceField11.setOffsetNid(82);
		deviceField11.setTextOnly(true);
		deviceField11.setLabelString("Event name: ");
		deviceField11.setIdentifier("");
		deviceField12.setOffsetNid(84);
		deviceField12.setLabelString("Time: ");
		deviceField12.setNumCols(15);
		deviceField12.setIdentifier("");
		deviceField13.setIdentifier("");
		deviceField13.setNumCols(4);
		deviceField13.setLabelString("Event code");
		deviceField13.setOffsetNid(78);
		deviceChoice7.setIdentifier("");
		deviceChoice7.setUpdateIdentifier("");
		deviceChoice7.setChoiceItems(new String[]
		{ "ON", "OFF" });
		deviceChoice7.setLabelString("Termination: ");
		deviceChoice7.setOffsetNid(80);
		deviceChoice7.setChoiceFloatValues(null);
		deviceChoice7.setChoiceIntValues(null);
		deviceChannel4.setLabelString("Ch 15: ");
		deviceChannel4.setOffsetNid(76);
		deviceChannel4.setBorderVisible(true);
		deviceChannel4.setInSameLine(true);
		deviceChannel4.setUpdateIdentifier("");
		deviceChannel4.setShowVal("");
		deviceField14.setOffsetNid(77);
		deviceField14.setTextOnly(true);
		deviceField14.setLabelString("Event name: ");
		deviceField14.setIdentifier("");
		deviceField15.setOffsetNid(79);
		deviceField15.setLabelString("Time: ");
		deviceField15.setNumCols(15);
		deviceField15.setIdentifier("");
		deviceField16.setIdentifier("");
		deviceField16.setNumCols(4);
		deviceField16.setLabelString("Event code");
		deviceField16.setOffsetNid(73);
		deviceChoice8.setIdentifier("");
		deviceChoice8.setUpdateIdentifier("");
		deviceChoice8.setChoiceItems(new String[]
		{ "ON", "OFF" });
		deviceChoice8.setLabelString("Termination: ");
		deviceChoice8.setOffsetNid(75);
		deviceChoice8.setChoiceFloatValues(null);
		deviceChoice8.setChoiceIntValues(null);
		deviceChannel5.setLabelString("Ch 14: ");
		deviceChannel5.setOffsetNid(71);
		deviceChannel5.setBorderVisible(true);
		deviceChannel5.setInSameLine(true);
		deviceChannel5.setUpdateIdentifier("");
		deviceChannel5.setShowVal("");
		deviceField17.setOffsetNid(72);
		deviceField17.setTextOnly(true);
		deviceField17.setLabelString("Event name: ");
		deviceField17.setIdentifier("");
		deviceField18.setOffsetNid(74);
		deviceField18.setLabelString("Time: ");
		deviceField18.setNumCols(15);
		deviceField18.setIdentifier("");
		deviceField19.setIdentifier("");
		deviceField19.setNumCols(4);
		deviceField19.setLabelString("Event code");
		deviceField19.setOffsetNid(68);
		deviceChoice9.setIdentifier("");
		deviceChoice9.setUpdateIdentifier("");
		deviceChoice9.setChoiceItems(new String[]
		{ "ON", "OFF" });
		deviceChoice9.setLabelString("Termination: ");
		deviceChoice9.setOffsetNid(70);
		deviceChoice9.setChoiceFloatValues(null);
		deviceChoice9.setChoiceIntValues(null);
		deviceChannel6.setLabelString("Ch 13: ");
		deviceChannel6.setOffsetNid(66);
		deviceChannel6.setBorderVisible(true);
		deviceChannel6.setInSameLine(true);
		deviceChannel6.setUpdateIdentifier("");
		deviceChannel6.setShowVal("");
		deviceField110.setOffsetNid(67);
		deviceField110.setTextOnly(true);
		deviceField110.setLabelString("Event name: ");
		deviceField110.setIdentifier("");
		deviceField111.setOffsetNid(69);
		deviceField111.setLabelString("Time: ");
		deviceField111.setNumCols(15);
		deviceField111.setIdentifier("");
		deviceField112.setIdentifier("");
		deviceField112.setNumCols(4);
		deviceField112.setLabelString("Event code");
		deviceField112.setOffsetNid(63);
		deviceChoice10.setIdentifier("");
		deviceChoice10.setUpdateIdentifier("");
		deviceChoice10.setChoiceItems(new String[]
		{ "ON", "OFF" });
		deviceChoice10.setLabelString("Termination: ");
		deviceChoice10.setOffsetNid(65);
		deviceChoice10.setChoiceFloatValues(null);
		deviceChoice10.setChoiceIntValues(null);
		deviceChannel7.setLabelString("Ch 12: ");
		deviceChannel7.setOffsetNid(61);
		deviceChannel7.setBorderVisible(true);
		deviceChannel7.setInSameLine(true);
		deviceChannel7.setUpdateIdentifier("");
		deviceChannel7.setShowVal("");
		deviceField113.setOffsetNid(62);
		deviceField113.setTextOnly(true);
		deviceField113.setLabelString("Event name: ");
		deviceField113.setIdentifier("");
		deviceField114.setOffsetNid(64);
		deviceField114.setLabelString("Time: ");
		deviceField114.setNumCols(15);
		deviceField114.setIdentifier("");
		deviceField115.setIdentifier("");
		deviceField115.setNumCols(4);
		deviceField115.setLabelString("Event code");
		deviceField115.setOffsetNid(58);
		deviceChoice11.setIdentifier("");
		deviceChoice11.setUpdateIdentifier("");
		deviceChoice11.setChoiceItems(new String[]
		{ "ON", "OFF" });
		deviceChoice11.setLabelString("Termination: ");
		deviceChoice11.setOffsetNid(60);
		deviceChoice11.setChoiceFloatValues(null);
		deviceChoice11.setChoiceIntValues(null);
		deviceChannel8.setLabelString("Ch 11: ");
		deviceChannel8.setOffsetNid(56);
		deviceChannel8.setBorderVisible(true);
		deviceChannel8.setInSameLine(true);
		deviceChannel8.setUpdateIdentifier("");
		deviceChannel8.setShowVal("");
		deviceField116.setOffsetNid(57);
		deviceField116.setTextOnly(true);
		deviceField116.setLabelString("Event name: ");
		deviceField116.setIdentifier("");
		deviceField117.setOffsetNid(59);
		deviceField117.setLabelString("Time: ");
		deviceField117.setNumCols(15);
		deviceField117.setIdentifier("");
		deviceField118.setIdentifier("");
		deviceField118.setNumCols(4);
		deviceField118.setLabelString("Event code");
		deviceField118.setOffsetNid(53);
		deviceChoice12.setIdentifier("");
		deviceChoice12.setUpdateIdentifier("");
		deviceChoice12.setChoiceItems(new String[]
		{ "ON", "OFF" });
		deviceChoice12.setLabelString("Termination: ");
		deviceChoice12.setOffsetNid(55);
		deviceChoice12.setChoiceFloatValues(null);
		deviceChoice12.setChoiceIntValues(null);
		deviceChannel9.setLabelString("Ch 10: ");
		deviceChannel9.setOffsetNid(51);
		deviceChannel9.setBorderVisible(true);
		deviceChannel9.setInSameLine(true);
		deviceChannel9.setUpdateIdentifier("");
		deviceChannel9.setShowVal("");
		deviceField119.setOffsetNid(52);
		deviceField119.setTextOnly(true);
		deviceField119.setLabelString("Event name: ");
		deviceField119.setIdentifier("");
		deviceField1110.setOffsetNid(54);
		deviceField1110.setLabelString("Time: ");
		deviceField1110.setNumCols(15);
		deviceField1110.setIdentifier("");
		deviceField1111.setIdentifier("");
		deviceField1111.setNumCols(4);
		deviceField1111.setLabelString("Event code");
		deviceField1111.setOffsetNid(48);
		deviceChoice13.setIdentifier("");
		deviceChoice13.setUpdateIdentifier("");
		deviceChoice13.setChoiceItems(new String[]
		{ "ON", "OFF" });
		deviceChoice13.setLabelString("Termination: ");
		deviceChoice13.setOffsetNid(50);
		deviceChoice13.setChoiceFloatValues(null);
		deviceChoice13.setChoiceIntValues(null);
		deviceChannel10.setLabelString("Ch 9: ");
		deviceChannel10.setOffsetNid(46);
		deviceChannel10.setBorderVisible(true);
		deviceChannel10.setInSameLine(true);
		deviceChannel10.setUpdateIdentifier("");
		deviceChannel10.setShowVal("");
		deviceField1112.setOffsetNid(47);
		deviceField1112.setTextOnly(true);
		deviceField1112.setLabelString("Event name: ");
		deviceField1112.setIdentifier("");
		deviceField1113.setOffsetNid(49);
		deviceField1113.setLabelString("Time: ");
		deviceField1113.setNumCols(15);
		deviceField1113.setIdentifier("");
		deviceField1114.setIdentifier("");
		deviceField1114.setNumCols(4);
		deviceField1114.setLabelString("Event code");
		deviceField1114.setOffsetNid(43);
		deviceChoice14.setIdentifier("");
		deviceChoice14.setUpdateIdentifier("");
		deviceChoice14.setChoiceItems(new String[]
		{ "ON", "OFF" });
		deviceChoice14.setLabelString("Termination: ");
		deviceChoice14.setOffsetNid(45);
		deviceChoice14.setChoiceFloatValues(null);
		deviceChoice14.setChoiceIntValues(null);
		deviceChannel11.setLabelString("Ch 8: ");
		deviceChannel11.setOffsetNid(41);
		deviceChannel11.setBorderVisible(true);
		deviceChannel11.setInSameLine(true);
		deviceChannel11.setUpdateIdentifier("");
		deviceChannel11.setShowVal("");
		deviceField1115.setOffsetNid(42);
		deviceField1115.setTextOnly(true);
		deviceField1115.setLabelString("Event name: ");
		deviceField1115.setIdentifier("");
		deviceField1116.setOffsetNid(44);
		deviceField1116.setLabelString("Time: ");
		deviceField1116.setNumCols(15);
		deviceField1116.setIdentifier("");
		deviceField1117.setIdentifier("");
		deviceField1117.setNumCols(4);
		deviceField1117.setLabelString("Event code");
		deviceField1117.setOffsetNid(38);
		deviceChoice15.setIdentifier("");
		deviceChoice15.setUpdateIdentifier("");
		deviceChoice15.setChoiceItems(new String[]
		{ "ON", "OFF" });
		deviceChoice15.setLabelString("Termination: ");
		deviceChoice15.setOffsetNid(40);
		deviceChoice15.setChoiceFloatValues(null);
		deviceChoice15.setChoiceIntValues(null);
		deviceChannel12.setLabelString("Ch 7: ");
		deviceChannel12.setOffsetNid(36);
		deviceChannel12.setBorderVisible(true);
		deviceChannel12.setInSameLine(true);
		deviceChannel12.setUpdateIdentifier("");
		deviceChannel12.setShowVal("");
		deviceField1118.setOffsetNid(37);
		deviceField1118.setTextOnly(true);
		deviceField1118.setLabelString("Event name: ");
		deviceField1118.setIdentifier("");
		deviceField1119.setOffsetNid(39);
		deviceField1119.setLabelString("Time: ");
		deviceField1119.setNumCols(15);
		deviceField1119.setIdentifier("");
		deviceField11110.setIdentifier("");
		deviceField11110.setNumCols(4);
		deviceField11110.setLabelString("Event code");
		deviceField11110.setOffsetNid(33);
		deviceChoice16.setIdentifier("");
		deviceChoice16.setUpdateIdentifier("");
		deviceChoice16.setChoiceItems(new String[]
		{ "ON", "OFF" });
		deviceChoice16.setLabelString("Termination: ");
		deviceChoice16.setOffsetNid(35);
		deviceChoice16.setChoiceFloatValues(null);
		deviceChoice16.setChoiceIntValues(null);
		deviceChannel13.setLabelString("Ch 6: ");
		deviceChannel13.setOffsetNid(31);
		deviceChannel13.setBorderVisible(true);
		deviceChannel13.setInSameLine(true);
		deviceChannel13.setUpdateIdentifier("");
		deviceChannel13.setShowVal("");
		deviceField11111.setOffsetNid(32);
		deviceField11111.setTextOnly(true);
		deviceField11111.setLabelString("Event name: ");
		deviceField11111.setIdentifier("");
		deviceField11112.setOffsetNid(34);
		deviceField11112.setLabelString("Time: ");
		deviceField11112.setNumCols(15);
		deviceField11112.setIdentifier("");
		deviceField11113.setIdentifier("");
		deviceField11113.setNumCols(4);
		deviceField11113.setLabelString("Event code");
		deviceField11113.setOffsetNid(28);
		deviceChoice17.setIdentifier("25");
		deviceChoice17.setUpdateIdentifier("");
		deviceChoice17.setChoiceItems(new String[]
		{ "ON", "OFF" });
		deviceChoice17.setLabelString("Termination: ");
		deviceChoice17.setOffsetNid(30);
		deviceChoice17.setChoiceFloatValues(null);
		deviceChoice17.setChoiceIntValues(null);
		deviceChannel14.setLabelString("Ch 5: ");
		deviceChannel14.setOffsetNid(26);
		deviceChannel14.setBorderVisible(true);
		deviceChannel14.setInSameLine(true);
		deviceChannel14.setUpdateIdentifier("");
		deviceChannel14.setShowVal("");
		deviceField11114.setOffsetNid(27);
		deviceField11114.setTextOnly(true);
		deviceField11114.setLabelString("Event name: ");
		deviceField11114.setNumCols(10);
		deviceField11114.setIdentifier("");
		deviceField11115.setOffsetNid(29);
		deviceField11115.setLabelString("Time: ");
		deviceField11115.setNumCols(15);
		deviceField11115.setIdentifier("");
		deviceField11116.setIdentifier("");
		deviceField11116.setNumCols(4);
		deviceField11116.setLabelString("Event code");
		deviceField11116.setOffsetNid(23);
		deviceChoice18.setIdentifier("");
		deviceChoice18.setUpdateIdentifier("");
		deviceChoice18.setChoiceItems(new String[]
		{ "ON", "OFF" });
		deviceChoice18.setLabelString("Termination: ");
		deviceChoice18.setOffsetNid(25);
		deviceChoice18.setChoiceFloatValues(null);
		deviceChoice18.setChoiceIntValues(null);
		deviceChannel15.setLabelString("Ch 4: ");
		deviceChannel15.setOffsetNid(21);
		deviceChannel15.setBorderVisible(true);
		deviceChannel15.setInSameLine(true);
		deviceChannel15.setUpdateIdentifier("");
		deviceChannel15.setShowVal("");
		deviceField11117.setOffsetNid(22);
		deviceField11117.setTextOnly(true);
		deviceField11117.setLabelString("Event name: ");
		deviceField11117.setIdentifier("");
		deviceField11118.setOffsetNid(24);
		deviceField11118.setLabelString("Time: ");
		deviceField11118.setNumCols(15);
		deviceField11118.setIdentifier("");
		deviceField11119.setIdentifier("");
		deviceField11119.setNumCols(4);
		deviceField11119.setLabelString("Event code");
		deviceField11119.setOffsetNid(18);
		deviceChoice19.setIdentifier("");
		deviceChoice19.setUpdateIdentifier("");
		deviceChoice19.setChoiceItems(new String[]
		{ "ON", "OFF" });
		deviceChoice19.setLabelString("Termination: ");
		deviceChoice19.setOffsetNid(20);
		deviceChoice19.setChoiceFloatValues(null);
		deviceChoice19.setChoiceIntValues(null);
		deviceChannel16.setLabelString("Ch 3: ");
		deviceChannel16.setOffsetNid(16);
		deviceChannel16.setBorderVisible(true);
		deviceChannel16.setInSameLine(true);
		deviceChannel16.setUpdateIdentifier("");
		deviceChannel16.setShowVal("");
		deviceField111110.setOffsetNid(17);
		deviceField111110.setTextOnly(true);
		deviceField111110.setLabelString("Event name: ");
		deviceField111110.setIdentifier("");
		deviceField111111.setOffsetNid(19);
		deviceField111111.setLabelString("Time: ");
		deviceField111111.setNumCols(15);
		deviceField111111.setIdentifier("");
		deviceField111112.setIdentifier("");
		deviceField111112.setNumCols(4);
		deviceField111112.setLabelString("Event code");
		deviceField111112.setOffsetNid(13);
		deviceChoice110.setIdentifier("");
		deviceChoice110.setUpdateIdentifier("");
		deviceChoice110.setChoiceItems(new String[]
		{ "ON", "OFF" });
		deviceChoice110.setLabelString("Termination: ");
		deviceChoice110.setOffsetNid(15);
		deviceChoice110.setChoiceFloatValues(null);
		deviceChoice110.setChoiceIntValues(null);
		deviceChannel17.setLabelString("Ch 2: ");
		deviceChannel17.setOffsetNid(11);
		deviceChannel17.setBorderVisible(true);
		deviceChannel17.setInSameLine(true);
		deviceChannel17.setUpdateIdentifier("");
		deviceChannel17.setShowVal("");
		deviceField111113.setOffsetNid(12);
		deviceField111113.setTextOnly(true);
		deviceField111113.setLabelString("Event name: ");
		deviceField111113.setIdentifier("");
		deviceField111114.setOffsetNid(14);
		deviceField111114.setLabelString("Time: ");
		deviceField111114.setNumCols(15);
		deviceField111114.setIdentifier("");
		this.getContentPane().add(deviceButtons1, BorderLayout.SOUTH);
		this.getContentPane().add(jPanel1, BorderLayout.NORTH);
		jPanel1.add(jPanel3, null);
		jPanel3.add(deviceField1, null);
		jPanel3.add(deviceDispatch1, null);
		jPanel1.add(jPanel4, null);
		jPanel4.add(deviceField3, null);
		jPanel4.add(deviceChoice3, null);
		jPanel4.add(deviceField2, null);
		jPanel4.add(deviceChoice2, null);
		this.getContentPane().add(jPanel2, BorderLayout.CENTER);
		jPanel2.add(jScrollPane1, BorderLayout.CENTER);
		jScrollPane1.getViewport().add(jPanel5, null);
		jPanel5.add(deviceChannel1, null);
		deviceChannel1.add(jPanel6, BorderLayout.CENTER);
		jPanel6.add(deviceField6, null);
		jPanel6.add(deviceField5, null);
		jPanel6.add(deviceField4, null);
		jPanel6.add(deviceChoice4, null);
		jPanel5.add(deviceChannel17, null);
		deviceChannel17.add(jPanel112, BorderLayout.CENTER);
		jPanel112.add(deviceField111113, null);
		jPanel112.add(deviceField111112, null);
		jPanel112.add(deviceField111114, null);
		jPanel112.add(deviceChoice110, null);
		jPanel5.add(deviceChannel16, null);
		deviceChannel16.add(jPanel111, BorderLayout.CENTER);
		jPanel111.add(deviceField111110, null);
		jPanel111.add(deviceField11119, null);
		jPanel111.add(deviceField111111, null);
		jPanel111.add(deviceChoice19, null);
		jPanel5.add(deviceChannel15, null);
		deviceChannel15.add(jPanel110, BorderLayout.CENTER);
		jPanel110.add(deviceField11117, null);
		jPanel110.add(deviceField11116, null);
		jPanel110.add(deviceField11118, null);
		jPanel110.add(deviceChoice18, null);
		jPanel5.add(deviceChannel14, null);
		deviceChannel14.add(jPanel19, BorderLayout.CENTER);
		jPanel19.add(deviceField11114, null);
		jPanel19.add(deviceField11113, null);
		jPanel19.add(deviceField11115, null);
		jPanel19.add(deviceChoice17, null);
		jPanel5.add(deviceChannel13, null);
		deviceChannel13.add(jPanel18, BorderLayout.CENTER);
		jPanel18.add(deviceField11111, null);
		jPanel18.add(deviceField11110, null);
		jPanel18.add(deviceField11112, null);
		jPanel18.add(deviceChoice16, null);
		jPanel5.add(deviceChannel12, null);
		deviceChannel12.add(jPanel17, BorderLayout.CENTER);
		jPanel17.add(deviceField1118, null);
		jPanel17.add(deviceField1117, null);
		jPanel17.add(deviceField1119, null);
		jPanel17.add(deviceChoice15, null);
		jPanel5.add(deviceChannel11, null);
		deviceChannel11.add(jPanel16, BorderLayout.CENTER);
		jPanel16.add(deviceField1115, null);
		jPanel16.add(deviceField1114, null);
		jPanel16.add(deviceField1116, null);
		jPanel16.add(deviceChoice14, null);
		jPanel5.add(deviceChannel10, null);
		deviceChannel10.add(jPanel15, BorderLayout.CENTER);
		jPanel15.add(deviceField1112, null);
		jPanel15.add(deviceField1111, null);
		jPanel15.add(deviceField1113, null);
		jPanel15.add(deviceChoice13, null);
		jPanel5.add(deviceChannel9, null);
		deviceChannel9.add(jPanel14, BorderLayout.CENTER);
		jPanel14.add(deviceField119, null);
		jPanel14.add(deviceField118, null);
		jPanel14.add(deviceField1110, null);
		jPanel14.add(deviceChoice12, null);
		jPanel5.add(deviceChannel8, null);
		deviceChannel8.add(jPanel13, BorderLayout.CENTER);
		jPanel13.add(deviceField116, null);
		jPanel13.add(deviceField115, null);
		jPanel13.add(deviceField117, null);
		jPanel13.add(deviceChoice11, null);
		jPanel5.add(deviceChannel7, null);
		deviceChannel7.add(jPanel12, BorderLayout.CENTER);
		jPanel12.add(deviceField113, null);
		jPanel12.add(deviceField112, null);
		jPanel12.add(deviceField114, null);
		jPanel12.add(deviceChoice10, null);
		jPanel5.add(deviceChannel6, null);
		deviceChannel6.add(jPanel11, BorderLayout.CENTER);
		jPanel11.add(deviceField110, null);
		jPanel11.add(deviceField19, null);
		jPanel11.add(deviceField111, null);
		jPanel11.add(deviceChoice9, null);
		jPanel5.add(deviceChannel5, null);
		deviceChannel5.add(jPanel10, BorderLayout.CENTER);
		jPanel10.add(deviceField17, null);
		jPanel10.add(deviceField16, null);
		jPanel10.add(deviceField18, null);
		jPanel10.add(deviceChoice8, null);
		jPanel5.add(deviceChannel4, null);
		deviceChannel4.add(jPanel9, BorderLayout.CENTER);
		jPanel9.add(deviceField14, null);
		jPanel9.add(deviceField13, null);
		jPanel9.add(deviceField15, null);
		jPanel9.add(deviceChoice7, null);
		jPanel5.add(deviceChannel3, null);
		deviceChannel3.add(jPanel8, BorderLayout.CENTER);
		jPanel8.add(deviceField11, null);
		jPanel8.add(deviceField10, null);
		jPanel8.add(deviceField12, null);
		jPanel8.add(deviceChoice6, null);
		jPanel5.add(deviceChannel2, null);
		deviceChannel2.add(jPanel7, BorderLayout.CENTER);
		jPanel7.add(deviceField8, null);
		jPanel7.add(deviceField7, null);
		jPanel7.add(deviceField9, null);
	}
}
