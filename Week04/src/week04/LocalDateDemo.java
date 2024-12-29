package week04;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class LocalDateDemo {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		LocalDate graduationDate = LocalDate.of(2024, 2, 22);
		JOptionPane.showMessageDialog(null, "Today is " + today);
		JOptionPane.showMessageDialog(null, "Graduation will be " + graduationDate);

	}

}
