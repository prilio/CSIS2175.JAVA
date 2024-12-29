/*Use the CarlysEventPriceWithMethods class you created in Step 1a as a
starting point for a program that demonstrates the Event class you created in
Step 1b, but make the following changes:
•• You already have a method that gets a number of guests from a user; now
add a method that gets an event number. The main() method should
declare an Event object, call the two data entry methods, and use their
returned values to set the fields in the Event object.
•• Call the method from the CarlysEventPriceWithMethods class that
displays the company motto with the border. The method is accessible
because it is public, but you must fully qualify the name because it is in
another class.
•• Revise the method that displays the event details so that it accepts
the newly created Event object. The method should display the event
number, and it should still display the number of guests, the price per
guest, the total price, and whether the event is a large event.*/

import java.util.Scanner;

public class EventDemo {

	public static void main(String[] args) {

		Event event = new Event();
		
		System.out.print("Enter the number of guests attending the event>> ");
		event.setNumberGuests(numberOfGuests());
		System.out.print("Enter the event number>> ");
		event.setEventNumber(eventNumber());
		
		
		mottoBanner();
		
		priceOfEvent(event);
		
		
	}
	
	public static int numberOfGuests() {
		
		Scanner input = new Scanner(System.in);
		
		int guests = input.nextInt();
		System.out.println();
		return guests;
				
	}
	public static String eventNumber() {
		
		Scanner input = new Scanner(System.in);
		
		String numberOfEvent = input.nextLine();
		System.out.println();
		return numberOfEvent;
	}
	
	public static void mottoBanner() {
		System.out.println("*****************************************************");
		System.out.println("*                                                   *");
		System.out.println("*  Carly's makes the food that makes it a party.    *");
		System.out.println("*                                                   *");
		System.out.println("*  ***********************************************  *");
	}

	public static void priceOfEvent(Event event) {
		
		double totalPrice = numberOfGuests() * event.PRICE_PER_GUEST;
		boolean largeEvent = numberOfGuests() >= event.CUT_OFF;
		
		
		System.out.println("*  The event number is is: " + event.getEventNumber() + "                     *");
		System.out.println("*  The number of guests is: " + event.getNumberGuests() + "                      *");
		System.out.println("*  The price per guest is: $" + event.PRICE_PER_GUEST + ".00                   *");
		System.out.println("*  The total price is: $" + totalPrice + ".00                     *");
		System.out.println("*  The event has 50 or more guests: " + largeEvent + "            *");
		System.out.println("*                                                   *");
		System.out.println("*****************************************************");
	}
}
