/*Write a program that declares a named constant to hold the number of quarts in
a gallon (4). Also declare a variable to represent the number of quarts needed for
a painting job, and assign an appropriate value—for example, 18. Compute and
display the number of gallons and quarts needed for the job. Display explanatory
text with the values—for example, A job that needs 18 quarts requires 4 gallons
plus 2 quarts.*/

public class QuartsToGallons {

	public static void main(String[] args) {
		
		final int QUARTS_PER_GALLON = 4;
		int quartsNeeded = 18;
		int quartsPerJob = quartsNeeded / QUARTS_PER_GALLON;
		int quartsRemain = quartsNeeded % QUARTS_PER_GALLON;
		
		System.out.println("A job that needs " + quartsNeeded + " quarts requires "
							+ quartsPerJob + " gallons plus " + quartsRemain + " quarts.");

	}

}
