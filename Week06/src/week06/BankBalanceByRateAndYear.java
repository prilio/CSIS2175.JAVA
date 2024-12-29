package week06;

import javax.swing.JOptionPane;

public class BankBalanceByRateAndYear {

	public static void main(String[] args) {
		
		double initialBalance;
		double balance;
		int year = 1;
		double interest;
		final double LOW = 0.02;
		final double HIGH = 0.05;
		final double INCREMENT = 0.01;
		final int MAX_YEAR = 4;
		
		initialBalance = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter initial bank balance >> "));
		
		for(interest = LOW; interest <= HIGH; interest += INCREMENT) {
			balance = initialBalance;
			JOptionPane.showMessageDialog(null, "With an initial balance of $"
					+ balance + " at an interest rate of " + interest);
			for(year = 1; year <= MAX_YEAR; ++year) {
				balance = balance + balance * interest;
				JOptionPane.showMessageDialog(null, "After year "+year + " at " 
						+ " balance is $" + balance);
			}
		}

	}

}
