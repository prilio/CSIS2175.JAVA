import java.util.Scanner;

/* Modify the Percentages class to accept the values of the two doubles from a
user at the keyboard.*/

public class Percentages2 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a number >> ");
		double x = keyboard.nextDouble();
		
		System.out.print("Enter another number >> ");
		double y = keyboard.nextDouble();
		
		computePercent(x, y);
		computePercent(y, x);
		
		
	}

	public static void computePercent(double a, double b) {
		
		double percent = (a * 100) / b;
		System.out.println(a + " is " + percent + " percent of " + b);
	}

}
