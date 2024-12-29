import java.time.LocalDate;

/*Create a class named Wedding for a wedding planner that includes the date of the wedding,
the names of the Couple being married, and a String for the location.Provide
constructors for each class that accept parameters for each field, and provide
get methods for each field.*/

public class Wedding {
	
	//FIELDS
	private Couple couple;
	private LocalDate date;
	private String location;
	
	//CONSTRUCTOR
	public Wedding(Couple couple, LocalDate date, String location) {
		this.couple = couple;
		this.date = date;
		this.location = location;
	}

	//GET METHODS
	public Couple getCouple() {
		return couple;
	}

	public LocalDate getDate() {
		return date;
	}

	public String getLocation() {
		return location;
	}
	
	
	
	

	
}
