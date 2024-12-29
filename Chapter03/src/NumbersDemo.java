/*Create an application named NumbersDemo whose main() method holds two
integer variables. Assign values to the variables. In turn, pass each value to
methods named displayTwiceTheNumber(), displayNumberPlusFive(), and
displayNumberSquared(). Create each method to perform the task its name
implies.*/

public class NumbersDemo {

	public static void main(String[] args) {
	
		int x = 10;
		int y = 20;
		
		displayTwiceTheNumber(x);
		displayTwiceTheNumber(y);
		
		displayNumberPlusFive(x);
		displayNumberPlusFive(y);
		
		displayNumberSquared(x);
		displayNumberSquared(y);

	}
	
	public static void displayTwiceTheNumber(int num) {
		
		System.out.println("The number is " + num + ", twice is " + (num * 2));	
	}
	
	public static void displayNumberPlusFive(int num) {
		
		System.out.println("The number is " + num + ", plus five is " + (num + 5));
	}
	
	public static void displayNumberSquared(int num) {
		
		System.out.println("The number is " + num + ", squared is " + (Math.pow(num, 2)));
	}
	
	
}
