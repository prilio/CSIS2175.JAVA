import java.util.Scanner;

/*There are 12 inches in a foot and 3 feet in a yard. Create a class named
InchConversion. Its main() method accepts a value in inches from a user at the
keyboard, and in turn passes the entered value to two methods. One converts the
value from inches to feet, and the other converts the same value from inches to
yards. Each method displays the results with appropriate explanation.*/

public class InchConversion {

	public static void main(String[] args) {
		 
		Scanner keyboard = new Scanner (System.in);
		
		System.out.print("Enter a value in inches >> ");
		double inches = keyboard.nextDouble();
		
		displayInchToFeet(inches);
		displayInchToYard(inches);
	}

	public static void displayInchToFeet(double value) {
		
		final double FOOT = value / 12;
		
		System.out.println("Converting inches to feet >> " + value + " inches = " + FOOT + " feets.");		
	}
	
	public static void displayInchToYard(double value) {
		
		final double YARD = value / 36;
		
		System.out.println("Converting inches to feet >> " + value + " inches = " + YARD + " yards.");
	}
}
