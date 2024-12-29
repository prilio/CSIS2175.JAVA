import java.util.Scanner;

/* The Harrison Group Life Insurance company computes annual policy premiums
based on the age the customer turns in the current calendar year. The premium
is computed by taking the decade of the customer’s age, adding 15 to it, and
multiplying by 20. For example, a 34-year-old would pay $360, which is calculated
by adding the decades (3) to 15, and then multiplying by 20. Write an application
that prompts a user for the current year and a birth year. Pass both to a method
that calculates and returns the premium amount, and then display the returned
amount.*/

public class Insurance {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter the current year >> ");
		int currentYear = input.nextInt();
		System.out.print("Enter your birth year >> ");
		int birthYear = input.nextInt();
		
		int premium = calculatePremiumAmount(currentYear, birthYear);
		
		System.out.println("Your insurance premium is $" + premium);
	}
	
	public static int calculatePremiumAmount (int yearC, int yearB) {
		
//		int yearDiff = yearC - yearB;
//		return (((yearDiff - (yearDiff % 10)) / 10) + 15) * 20;
		return (((yearC - yearB) / 10) + 15) * 20;
	}

}
