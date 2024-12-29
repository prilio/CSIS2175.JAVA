package week04;

import javax.swing.JOptionPane;

public class Employee {

	private int empNum;
	private double empPayRate;
	
	public void setValues() {
		empNum = 111;
		empPayRate = 22.22;
	}
	
	public void methodThatUsesInstanceAttributes() {
		JOptionPane.showMessageDialog(null, "Employee number is " + empNum);
		JOptionPane.showMessageDialog(null, "Pay rate is " + empPayRate);
	}
	
	public void methodThatUsesLocalVariables() {
		int empNum = 33333;
		double empPayRate = 555.55;
		JOptionPane.showMessageDialog(null, "Employee number is " + empNum);
		JOptionPane.showMessageDialog(null, "Pay rate is " + empPayRate);
	}
}
