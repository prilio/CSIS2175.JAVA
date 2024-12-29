/*Create a class to hold data about a high school sports team. The Team
class holds data fields for high school name (such as Roosevelt High), sport
(such as Girls’ Basketball), and team name (such as Dolphins). Include a
constructor that takes parameters for each field, and include get methods
that return the values of the fields. Also include a public final static
String named MOTTO and initialize it to Sportsmanship!.*/


public class Team {

	//FIELDS
	private String schoolName;
	private String sportName;
	private String teamName;
	
	//CONSTRUCTOR
	public Team(String schoolName, String sportName, String teamName) {
		this.schoolName = schoolName;
		this.sportName = sportName;
		this.teamName = teamName;
	}
	
	//GET METHODS
	public String getSchoolName() {
		return schoolName;
	}

	public String getSportName() {
		return sportName;
	}

	public String getTeamName() {
		return teamName;
	}
	
	//STRING FIELD
	public final static String MOTTO = "Sportsmanship!";
		
}
