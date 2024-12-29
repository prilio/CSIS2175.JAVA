import java.util.Scanner;

/* The Huntington Boys and Girls Club is conducting a fundraiser by selling chili
dinners to go. The price is $7 for an adult meal and $4 for a child’s meal. Write a
program that accepts the number of each type of meal ordered and display the
total money collected for adult meals, children’s meals, and all meals.*/

public class ChiliToGo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int adultMealPrice = 7;
		int childMealPrice = 4;
		int adultMealQty;
		int childMealQty;
		
		System.out.println("Welcome to The Huntington Boys and Girls Club!\n"
				+ "Would you like to make an order to buy chili dinner?");
		System.out.println("Enter the number of adult meals >> ");
		adultMealQty = input.nextInt();
		System.out.println("Enter the number of child meals >> ");
		childMealQty = input.nextInt();
		
		int totalOrdered = adultMealQty + childMealQty;
		double totalAdultMeals = adultMealQty * adultMealPrice;
		double totalChildMeals = childMealQty * childMealPrice;
		double totalMeals = totalAdultMeals + totalChildMeals;
		
		System.out.println("The total of meals ordered is " + totalOrdered + ".");
		System.out.println("The total money collect for adult meals is $" + totalAdultMeals + ".");
		System.out.println("The total money collect for child meals is $" + totalChildMeals + ".");
		System.out.println("The total money collect for all meals is $" + totalMeals + ".");

	}

}
