/*Write an application that randomly “throws” two dice and displays
their values. */

public class TwoDice {

	public static void main(String[] args) {


		Die die1 = new Die();
		Die die2 = new Die();
		
		die1.roll();
		die2.roll();
		
		System.out.println("The value of die 1: " + die1.getRandomValue());
		System.out.println("The value of die 2: " + die2.getRandomValue());
		
		

	}

}
