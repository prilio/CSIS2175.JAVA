package week05;

import javax.swing.JOptionPane;

public class Payroll {

	public static void main(String[] args) {
		double rate;
		double hoursWorked;
		double regularPay;
		double overtimePay;
		final int FULL_WEEK = 40;
		final double OT_RATE = 1.5;
		
		hoursWorked = Double.parseDouble(JOptionPane.showInputDialog(null, "How many hours did you work this week? "));
		rate = Double.parseDouble(JOptionPane.showInputDialog(null, "What is your regular pay rate? "));
		if(hoursWorked > FULL_WEEK) {
			regularPay = FULL_WEEK * rate;
			overtimePay = (hoursWorked - FULL_WEEK) * OT_RATE * rate;
		}
		else {
			regularPay = hoursWorked * rate;
			overtimePay=0.0;
		}
		JOptionPane.showMessageDialog(null, "Regular pay is " + regularPay + "\nOvertime pay is " + overtimePay);

	}

}
