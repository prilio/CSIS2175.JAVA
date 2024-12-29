package week01;

import java.util.Scanner;

public class EnterSmallValue {

	public static void main(String[] args) {
		int UserEntry;
		final int LIMIT = 3;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an integer no higher than " + LIMIT + " >>");
		UserEntry = input.nextInt();
		
		while(UserEntry > LIMIT) {
			System.out.println("The number you entered is too high.");
			System.out.println("Please enter an integer no higher than " + LIMIT + " >>");
			UserEntry = input.nextInt();
			
		}
		System.out.println("You correctly entered " + UserEntry);

	}

}
