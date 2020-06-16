/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author manduchi
 */
public class REDPYTADCSetup extends DeviceSetup
{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Creates new form REDPYTADCSetup
	 */
	public REDPYTADCSetup()
	{
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents()
	{
		deviceButtons1 = new DeviceButtons();
		jPanel1 = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();
		deviceField1 = new DeviceField();
		jPanel5 = new javax.swing.JPanel();
		deviceDispatch1 = new DeviceDispatch();
		deviceField5 = new DeviceField();
		jPanel3 = new javax.swing.JPanel();
		deviceChoice1 = new DeviceChoice();
		deviceChoice2 = new DeviceChoice();
		deviceChoice3 = new DeviceChoice();
		jPanel4 = new javax.swing.JPanel();
		deviceField4 = new DeviceField();
		deviceChoice4 = new DeviceChoice();
		setDeviceProvider("localhost");
		setDeviceTitle("Red Pitaya ADC");
		setDeviceType("REDPYTADC");
		setHeight(300);
		setWidth(700);
		getContentPane().add(deviceButtons1, java.awt.BorderLayout.SOUTH);
		jPanel1.setLayout(new java.awt.GridLayout(4, 1));
		deviceField1.setIdentifier("");
		deviceField1.setLabelString("Comment:");
		deviceField1.setNumCols(30);
		deviceField1.setOffsetNid(2);
		deviceField1.setTextOnly(true);
		jPanel2.add(deviceField1);
		jPanel1.add(jPanel2);
		jPanel5.add(deviceDispatch1);
		deviceField5.setIdentifier("");
		deviceField5.setLabelString("IP Address:");
		deviceField5.setNumCols(25);
		deviceField5.setOffsetNid(1);
		jPanel5.add(deviceField5);
		jPanel1.add(jPanel5);
		deviceChoice1.setChoiceIntValues(new int[]
		{ 0, 1, 2 });
		deviceChoice1.setChoiceItems(new String[]
		{ "CHAN_A", "CHAN_B", "EXTERNAL" });
		deviceChoice1.setConvert(true);
		deviceChoice1.setIdentifier("");
		deviceChoice1.setLabelString("Trig. Origin: ");
		deviceChoice1.setOffsetNid(3);
		deviceChoice1.setUpdateIdentifier("");
		jPanel3.add(deviceChoice1);
		deviceChoice2.setChoiceIntValues(new int[]
		{ 1, 0 });
		deviceChoice2.setChoiceItems(new String[]
		{ "12V", "5V" });
		deviceChoice2.setConvert(true);
		deviceChoice2.setIdentifier("");
		deviceChoice2.setLabelString("Full Scale Ch1: ");
		deviceChoice2.setOffsetNid(5);
		deviceChoice2.setUpdateIdentifier("");
		jPanel3.add(deviceChoice2);
		deviceChoice3.setChoiceIntValues(new int[]
		{ 1, 0 });
		deviceChoice3.setChoiceItems(new String[]
		{ "12V", "5V" });
		deviceChoice3.setConvert(true);
		deviceChoice3.setIdentifier("");
		deviceChoice3.setLabelString("Full Scale Ch2: ");
		deviceChoice3.setOffsetNid(6);
		deviceChoice3.setUpdateIdentifier("");
		jPanel3.add(deviceChoice3);
		jPanel1.add(jPanel3);
		deviceField4.setIdentifier("");
		deviceField4.setLabelString("Trig. Time: ");
		deviceField4.setNumCols(25);
		deviceField4.setOffsetNid(7);
		jPanel4.add(deviceField4);
		deviceChoice4.setChoiceIntValues(new int[]
		{ 0, 1 });
		deviceChoice4.setChoiceItems(new String[]
		{ "RISING", "FALLING" });
		deviceChoice4.setConvert(true);
		deviceChoice4.setIdentifier("");
		deviceChoice4.setLabelString("Trig. Edge");
		deviceChoice4.setOffsetNid(4);
		deviceChoice4.setUpdateIdentifier("");
		jPanel4.add(deviceChoice4);
		jPanel1.add(jPanel4);
		getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);
		getAccessibleContext().setAccessibleDescription("");
	}// </editor-fold>//GEN-END:initComponents

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private DeviceButtons deviceButtons1;
	private DeviceChoice deviceChoice1;
	private DeviceChoice deviceChoice2;
	private DeviceChoice deviceChoice3;
	private DeviceChoice deviceChoice4;
	private DeviceDispatch deviceDispatch1;
	private DeviceField deviceField1;
	private DeviceField deviceField4;
	private DeviceField deviceField5;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	// End of variables declaration//GEN-END:variables
}
