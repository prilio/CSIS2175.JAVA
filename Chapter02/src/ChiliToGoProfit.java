import java.util.Scanner;

/* In the ChiliToGo program in Exercise 12, the costs to produce an adult meal and
a child’s meal are $4.35 and $3.10, respectively. Modify the ChiliToGo program to
display the total profit for each type of meal as well as the grand total profit.*/

public class ChiliToGoProfit {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		double adultMealPrice = 4.35;
		double childMealPrice = 3.10;
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
