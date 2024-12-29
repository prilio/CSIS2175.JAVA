package week03;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DemoRaise {

	public static void main(String[] args) {
		double salary = 200.00;
		double startingWage = 800.00;
		System.out.println("Demonstrating some raises");
		
		predictRaise(400.00);
		predictRaise(salary);
		predictRaise(startingWage);
		String rateString;
		double rate;
		Scanner input = new Scanner (System.in);
		rateString = JOptionPane.showInputDialog(null, "Please enter the new rate>> ", "Salary Dialog", 
				JOptionPane.QUESTION_MESSAGE);
		rate = Double.parseDouble(rateString);
		predictRaseUsingRate(salary, rate);
		
		

	}
	public static void predictRaise(double salary) {
		double newSalary;
		final double RAISE_RATE = 1.10;
		
		newSalary = salary * RAISE_RATE;
		
		System.out.println("Current salary: " + salary + "\nAfter raise: " + newSalary);
	}

	public static void predictRaseUsingRate(double salary, double rate) {
		double newAmount;
		newAmount = salary * (1 + rate);
		JOptionPane.showMessageDialog(null, "With raise, new salary is " + newAmount);

	}
}
