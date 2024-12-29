import java.util.Scanner;

/*Carly’s Catering provides meals for parties and special events. Write a program
that prompts the user for the number of guests attending an event and then computes
the total price, which is $35 per person. Display the company motto
with the border that you created in the CarlysMotto2 class in Chapter 1,
and then display the number of guests, price per guest, and total price. Also
display a message that indicates true or false depending on whether the job
is classified as a large event—an event with 50 or more guests.*/


public class CarlysEventPrice {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int guests;
		System.out.print("Enter the number of guests attending the event>> ");
		guests = input.nextInt();
		System.out.println();
		
		final int PRICE = 35;
		int totalPrice = guests * PRICE;
		boolean largeEvent = (guests >= 50);
		
		System.out.println("*****************************************************");
		System.out.println("*                                                   *");
		System.out.println("*  Carly's makes the food that makes it a party.    *");
		System.out.println("*                                                   *");
		System.out.println("*  ***********************************************  *");
		System.out.println("*                                                   *");
		System.out.println("*  The number of guests is: " + guests + "                      *");
		System.out.println("*  The price per guest is: $" + PRICE + ".00                   *");
		System.out.println("*  The total price is: $" + totalPrice + ".00                     *");
		System.out.println("*  The event has 50 or more guests: " + largeEvent + "            *");
		System.out.println("*                                                   *");
		System.out.println("*****************************************************");
		
		

	}

}
