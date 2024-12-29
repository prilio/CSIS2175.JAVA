package week04;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class DeliverDate {

	public static void main(String[] args) {
		
		LocalDate orderDate;
		int mo;
		int day;
		int year;
		final int WEEKS_FOR_DELIVERY = 2;
		mo = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter order month: "));
		day = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter order day: "));
		year = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter order year: "));
		orderDate = LocalDate.of(year, mo, day);
		JOptionPane.showMessageDialog(null, "Order date is " + orderDate);
		JOptionPane.showMessageDialog(null, "Delivery date is " + orderDate.plusWeeks(WEEKS_FOR_DELIVERY));

	}

}
