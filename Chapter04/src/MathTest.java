import java.util.Random;

/*Write a Java application that uses the Math class to determine the answers for
each of the following:
a. The square root of 37
b. The sine and cosine of 300
c. The value of the floor, ceiling, and round of 22.8
d. The larger and the smaller of the character ‘D’ and the integer 71
e. A random number between 0 and 20 (Hint: The random() method returns a
value between 0 and 1; you want a number that is 20 times larger.)*/

public class MathTest {

	public static void main(String[] args) {
		
		System.out.println("The square root of 37: " + Math.sqrt(37));
		System.out.println("The sine of 300: " + Math.sin(300));
		System.out.println("The cosine of 300: " + Math.cos(300));
		System.out.println("The value of the floor of 22.8: " + Math.floor(22.8));
		System.out.println("The value of the ceiling of 22.8: " + Math.ceil(22.8));
		System.out.println("The value of the round of 22.8: " + Math.round(22.8));
		System.out.println("A random number between 0 and 20: " + ((int)(Math.random()*20)) 
							+ " -> using the Math.random");
		
		Random randomNumber = new Random();
		final int LIMIT = 20;
		System.out.println("A random number between 0 and 20: " + randomNumber.nextInt(LIMIT) 
		                    + " -> using the RANDOM CLASS");
		

	}

}
