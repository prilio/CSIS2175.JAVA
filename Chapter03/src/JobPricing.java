import java.util.Scanner;

/* Herbert’s Home Repair estimates each job cost as the cost of materials plus $35
per hour while on the job, plus $12 per hour for travel time to the job site. Create
a class that contains a main() method that prompts the user for the name of a
job (for example, Smith bathroom remodel), the cost of materials, the number of
hours of work required, and the number of hours travel time. Pass the numeric
data to a method that computes estimate for the job and returns the computed
value to the main() method where the job name and estimated price are
displayed.*/

public class JobPricing {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the name of a job >> ");
		String jobName = input.nextLine();
		System.out.print("Enter the cost of materials >> ");
		double jobMaterial = input.nextDouble();
		System.out.print("Enter the number of hours of work required >> ");
		int jobHours = input.nextInt();
		System.out.print("Enter the number of hours travel time >> ");
		int travelHours = input.nextInt();
		
		System.out.println();
			
		System.out.println("Herbet's Home Repair estimate job value:");
		System.out.println("To do the " + jobName + ", the price is $" 
							+ calculateValue(jobMaterial, jobHours, travelHours));

	}

	public static double calculateValue (double jobMaterial, int jobHours, int travelHours) {
		
		final int PRICE_HOURS_WORKED = 35;
		final int PRICE_HOURS_TRAVEL = 12;
		
		return (jobMaterial + (jobHours * PRICE_HOURS_WORKED) + (travelHours * PRICE_HOURS_TRAVEL));
		
	}
}
