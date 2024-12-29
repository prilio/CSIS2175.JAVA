import java.util.Scanner;

/* Convert the MileConversions program to an interactive application. Instead of
assigning a value to the miles variable, accept it from the user as input. */

public class MileConversionsInteractive {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		
		final int INCH_MILE = 63360;
		final int FEET_MILE = 5280;
		final int YARD_MILE = 1760;

		double numberMiles;
		System.out.println("Please, enter the number of miles to make a convertion >> ");
		numberMiles = input.nextDouble();
		
		System.out.println("The value of " + numberMiles + 
							" miles is equivalent to " + (numberMiles * INCH_MILE)+ " inches.");
		System.out.println("The value of " + numberMiles + 
							" miles is equivalent to " + (numberMiles * FEET_MILE) + " feet.");
		System.out.println("The value of " + numberMiles + 
							" miles is equivalent to " + (numberMiles * YARD_MILE) + " yards.");


	}

}
