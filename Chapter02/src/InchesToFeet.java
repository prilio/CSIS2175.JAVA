/* Write a program that declares a variable named inches, which holds a length
in inches, and assign a value. Display the value in feet and inches; for example,
86 inches becomes 7 feet and 2 inches. Be sure to use a named constant where
appropriate. */

public class InchesToFeet {

	public static void main(String[] args) {
		
		int inches = 100;
		final int FEET = 12;
		int remainInch = (inches % FEET);
		int inchFeet = (inches - remainInch) / FEET;
		
		System.out.println("The value of " + inches + " inches becomes "
							+ inchFeet + " feet and " + remainInch + " inches");

	}

}
