package week06;

import javax.swing.JOptionPane;

public class BankBalance2 {

	public static void main(String[] args) {
		
		double balance;
		int response;
		int year = 1;
		final double INT_RATE = 0.03;
		
		balance = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter initial bank balance >> "));
		response = Integer.parseInt(JOptionPane.showInputDialog(null, "Do you want to see next year's balance? "
				+ "\nEnter 1 for YES or any other number for NO >>"));
		do {
			
			balance = balance + balance * INT_RATE;
			JOptionPane.showMessageDialog(null, "After year "+year + " at " 
			+ INT_RATE + " interest rate, balance is $" + balance);
			year = year + 1;
			response = Integer.parseInt(JOptionPane.showInputDialog(null, "Do you want to see the balance"
					+ " at the end of another year? "
					+ "\nEnter 1 for YES or any other number for NO >>"));
		}while (response == 1 );

	}

}
