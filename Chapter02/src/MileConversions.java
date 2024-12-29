/*Write a program that declares named constants to represent the number of
inches, feet, and yards in a mile. Also declare a variable to represent a number
of miles and assign a value to it. Compute and display, with explanatory text, the
value in inches, feet, and yards.*/

public class MileConversions {

	public static void main(String[] args) {


		final int INCH_MILE = 63360;
		final int FEET_MILE = 5280;
		final int YARD_MILE = 1760;

		double numberMiles = 20;
		
		System.out.println("The value of " + numberMiles + 
							" miles is equivalent to " + (numberMiles * INCH_MILE)+ " inches.");
		System.out.println("The value of " + numberMiles + 
							" miles is equivalent to " + (numberMiles * FEET_MILE) + " feet.");
		System.out.println("The value of " + numberMiles + 
							" miles is equivalent to " + (numberMiles * YARD_MILE) + " yards.");

	}

}
