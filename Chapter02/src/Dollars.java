import java.util.Scanner;

/* Write a program that calculates and displays the conversion of an entered number
of dollars into currency denominations—20s, 10s, 5s, and 1s. */

public class Dollars {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		
		int dollars;
		System.out.print("Enter the amount of dollars >> ");
		dollars = input.nextInt();
		
		int vinte = dollars / 20;
		int remainDollars = dollars % 20;
		int dez = dollars / 10 ;
		remainDollars = dollars % 10;
		int cinco = dollars / 5;
		remainDollars = dollars % 5;

		System.out.println("$" + dollars + " can be converted as: ");
		System.out.println("\t" + vinte + " tweenties, ");
		System.out.println("\t" + dez + " tens, ");
		System.out.println("\t" + cinco + " fives,");
		System.out.println("\t" + remainDollars + " ones.");
		
		
		

	}

}
