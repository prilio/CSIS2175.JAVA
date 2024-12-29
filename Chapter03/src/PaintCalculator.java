import java.util.Scanner;

/*Assume that a gallon of paint covers about 350 square feet of wall space. Create
an application with a main() method that prompts the user for the length, width,
and height of a rectangular room. Pass these three values to a method that does
the following:
•• Calculates the wall area for a room
•• Passes the calculated wall area to another method that calculates and returns
the number of gallons of paint needed
•• Displays the number of gallons needed
•• Computes the price based on a paint price of $32 per gallon, assuming that
the painter can buy any fraction of a gallon of paint at the same price as a
whole gallon
•• Returns the price to the main() method
The main() method displays the final price. For example, the cost to paint
a 15-by-20-foot room with 10-foot ceilings is $64. 
Save the application as PaintCalculator.java.
 * */

public class PaintCalculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("This program will calculate the cost of paint for your room and ceiling");
		System.out.print("Enter the room length in feet >> ");
		double length = input.nextDouble();
		System.out.print("Enter the room width in feet >> ");
		double width = input.nextDouble();
		System.out.print("Enter the room height in feet >> ");
		double height = input.nextDouble();
		
		double wallArea = calculateWallArea(length, width, height);
		double gallons = calculateGallons(wallArea);
		double price = calculatePrice(gallons);

		System.out.println("The number of gallons that is needed to paint this room is: " + gallons);
		System.out.println("The cost to paint a " + length + "-by-" + width + "-foot room with "
							+ height + "-foot ceilings is $" + price);
	}
	
	public static double calculateWallArea (double roomLength, double roomWidth, double roomHeight) {
		
//		return 2*(roomLength * roomHeight + roomWidth * roomHeight);
		return (roomHeight * (2* (roomLength + roomWidth)));
	}

	public static double calculateGallons(double roomArea) {
		
		
		return roomArea / 350;
	}
	
	public static double calculatePrice (double roomGallons) {
		
		final int PRICE_PER_GALLON = 32;
		return roomGallons * PRICE_PER_GALLON;
	}
}
