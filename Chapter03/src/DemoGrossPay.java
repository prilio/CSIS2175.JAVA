
public class DemoGrossPay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double hours = 25;
		double yourHoursWorked = 37.5;
		calculateGross(10);
		calculateGross(hours);
		calculateGross(yourHoursWorked);
	}
	
	public static void calculateGross(double hours) {
		
		final double STD_RATE = 13.75;
		double gross;
		gross = hours * STD_RATE;
		
		System.out.println(hours + " hours at $" + STD_RATE + " per hour is $" + gross);
		
	}
	
	public static void calculateGross1(double hours, double rate) {
		double gross1;
		gross1 = hours * rate;
		System.out.println(hours + " hours at $" + rate + " per hour is $" + gross1);
	}
	
	public static double calculateGross2(double hours, double rate) {
		double gross2;
		gross2 = hours * rate;
		return gross2;
	}

}
