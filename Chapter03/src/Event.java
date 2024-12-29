/*Create a class to hold Event data for Carly’s Catering. The class contains:
•• Two public final static fields that hold the price per guest ($35) and
the cutoff value for a large event (50 guests)
•• Three private fields that hold an event number, number of guests for
the event, and the price. The event number is stored as a String because
Carly plans to assign event numbers such as M312.
•• Two public set methods that set the event number (setEventNumber())
and the number of guests (setGuests()). The price does not have a set
method because the setGuests() method will calculate the price as the
number of guests multiplied by the price per guest every time the number
of guests is set.
•• Three public get methods that return the values in the three nonstatic
fields.*/

public class Event {
	
	private String eventNumber;
	private int numberGuests;
	private double eventPrice;
	

	public static final double PRICE_PER_GUEST = 35;
	public  final static int CUT_OFF = 50;
	
	
	public void setEventNumber(String eventNumber) {
		this.eventNumber = eventNumber;
	}
	public void setNumberGuests(int numberGuests) {
		this.numberGuests = numberGuests;
	}

	
	
	
	public String getEventNumber() {
		return eventNumber;
	}
	public int getNumberGuests() {
		return numberGuests;
	}
	public double getEventPrice() {
		return eventPrice;
	}




	

}
