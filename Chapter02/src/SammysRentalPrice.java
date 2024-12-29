import java.util.Scanner;

/* Sammy’s Seashore Supplies rents beach equipment such as kayaks, canoes, beach
chairs, and umbrellas to tourists. Write a program that prompts the user for the
number of minutes he rented a piece of sports equipment. Compute the rental
cost as $40 per hour plus $1 per additional minute. 
Display Sammy’s motto with the border that you created in the SammysMotto2
class in Chapter 1. Then display the hours, minutes, and total price.*/

public class SammysRentalPrice {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int time;
		System.out.print("Enter the time (in min) that you would like to rent a sport equipment >> ");
		time = input.nextInt();
		
		System.out.println();
		
		int rentalHour = 40;
		int rentalMin = 1;
	    int hours = time / 60;
	    int min = time % 60;
	    // double hours = (time - min) / 60;
	    int totalPrice = (hours * rentalHour) + (rentalMin * min);
		
		System.out.println("SssssssssssssssssssssssssssssssssssssssS");
		System.out.println("S                                      S");
		System.out.println("S   Sammy's makes it fun in the sun.   S");
		System.out.println("S                                      S");
		System.out.println("SssssssssssssssssssssssssssssssssssssssS");
		System.out.println("S                                      S");
		System.out.println("S  The equipment was rented for:       S");
		System.out.println("S  "+ hours + " hours, " + min + " min.                    S");
		System.out.println("S  The total price is $" + totalPrice + ".00           S");
		System.out.println("S                                      S");
		System.out.println("SssssssssssssssssssssssssssssssssssssssS");		
		
	}

}
