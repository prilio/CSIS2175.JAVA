import java.util.Scanner;

/* Write a program that accepts a number of minutes and converts it both to hours
and days. For example, 6,000 minutes equals 100 hours and equals 4.167 days. */

public class MinutesConversion {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
				
		int minutes;
		System.out.print("Enter the number of minutes >> ");
		minutes = input.nextInt();
		
		int hours = minutes / 60;
		double days = (double) minutes / 1440;
		
		System.out.println(minutes + " minutes equals " + hours + " hours and equals " + Math.round(days) + " days.");
		
		

	}

}
