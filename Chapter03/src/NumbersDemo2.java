import java.util.Scanner;

/*Modify the NumbersDemo class to accept the values of the two integers from a
user at the keyboard.*/

public class NumbersDemo2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number >> ");
		double x = input.nextDouble();
		
		System.out.print("Enter another number >> ");
		double y = input.nextDouble();
		
		displayTwiceTheNumber(x);
		displayTwiceTheNumber(y);
		
		displayNumberPlusFive(x);
		displayNumberPlusFive(y);
		
		displayNumberSquared(x);
		displayNumberSquared(y);

	}
	
	public static void displayTwiceTheNumber(double num) {
		
		System.out.println("The number is " + num + ", twice is " + (num * 2));	
	}
	
	public static void displayNumberPlusFive(double num) {
		
		System.out.println("The number is " + num + ", plus five is " + (num + 5));
	}
	
	public static void displayNumberSquared(double num) {
		
		System.out.println("The number is " + num + ", squared is " + (Math.pow(num, 2)));
	}
	
	
}
