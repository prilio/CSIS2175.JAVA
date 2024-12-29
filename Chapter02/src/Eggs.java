import java.util.Scanner;

/* Meadowdale Dairy Farm sells organic brown eggs to local customers. It charges
$3.25 for a dozen eggs, or 45 cents for individual eggs that are not part of a
dozen. Write a program that prompts a user for the number of eggs in the
order and then display the amount owed with a full explanation. For example,
typical output might be, You ordered 27 eggs. That’s 2 dozen at $3.25 per
dozen and 3 loose eggs at 45 cents each for a total of $7.85.*/

public class Eggs {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double dozen = 3.25;
		double egg = 0.45;
		
		int order;
		System.out.println("Enter the number of Eggs for ordered >> ");
		order = input.nextInt();
		
		int ordered = order / 12;
		int loose = order % 12;
		
		double totalBill = (ordered * dozen) + (loose * egg);
		
		System.out.println("You ordered " + order + " eggs.");
		System.out.println("That's " + ordered + " dozen at $" + dozen +
							" per dozen and " + loose + " loose eggs at $" +
							egg + " each for a total of $" + totalBill); 
		
	}

}
