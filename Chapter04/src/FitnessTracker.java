import java.time.LocalDate;

/*Create a FitnessTracker class that includes data fields for a fitness activity,
the number of minutes spent participating, and the date. The class includes
methods to get each field. In addition, create a default constructor that
automatically sets the activity to running, the minutes to 0, and the date to
January 1 of the current year.*/

public class FitnessTracker {

	//FIELDS
	private String activity;
	private int timeParticipating;
	private LocalDate date;
	
	//DEFAULT CONSTRUCTOR
	public FitnessTracker() {
		this.activity = "running";
		this.timeParticipating = 0;
		//LocalDate pega a data de hoje, no caso o primeiro paramentro é o ano corrente
		// o segundo argumento é o mês e o último é o dia.
		this.date = LocalDate.of(LocalDate.now().getYear(), 1,  1);
	}
	
	//CONSTRUCTOR
	public FitnessTracker(String activity, int timeParticipating, LocalDate date) {
		this.activity = activity;
		this.timeParticipating = timeParticipating;
		this.date = date;
	}

	//GET METHODS
	public String getActivity() {
		return activity;
	}
	public int getTimeParticipating() {
		return timeParticipating;
	}
	public LocalDate getDate() {
		return date;
	}
	
	
}
