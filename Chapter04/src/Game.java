/*Create a class named Game. Include two Team fields that hold data about
the teams participating in the game. Also include a field for game time (for
example, 7 PM). Include a constructor that takes parameters for two Team
objects and a time.*/

public class Game {
	

	//FIELDS
	private String teamName;
	private String coachName;
	private String gameStartTime;

	//CONSTRUCTOR
	public Game(String teamName, String coachName, String gameStartTime) {
		this.teamName = teamName;
		this.coachName = coachName;
		this.gameStartTime = gameStartTime;
	}

	public Game() {
		
	}

	//GET METHODS
	public String getTeamName() {
		return teamName;
	}


	public String getCoachName() {
		return coachName;
	}


	public String getGameStartTime() {
		return gameStartTime;
	}


}