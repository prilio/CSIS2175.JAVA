import java.util.Scanner;

/*Write an interactive version of the InchesToFeet class that accepts the inches
value from a user.*/

public class InchesToFeetInteractive {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int inches;
		System.out.println("Please enter a number of Inches to convert to Feet >> ");
		inches = input.nextInt();

		final int FEET = 12;
		int remainInch = (inches % FEET);
		int inchFeet = (inches - remainInch) / FEET;
		
		System.out.println("The value of " + inches + " inches becomes "
							+ inchFeet + " feet and " + remainInch + " inches");


	}

}
