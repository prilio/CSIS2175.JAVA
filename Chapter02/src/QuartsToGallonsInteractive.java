import java.util.Scanner;

public class QuartsToGallonsInteractive {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		final int QUARTS_PER_GALLON = 4;
		int quartsNeeded;
		System.out.println("Please, enter the quantity needed in quarts for completed the job >> ");
		quartsNeeded = input.nextInt();
		int quartsPerJob = quartsNeeded / QUARTS_PER_GALLON;
		int quartsRemain = quartsNeeded % QUARTS_PER_GALLON;
		
		System.out.println("A job that needs " + quartsNeeded + " quarts requires "
							+ quartsPerJob + " gallons plus " + quartsRemain + " quarts.");

	}

}
