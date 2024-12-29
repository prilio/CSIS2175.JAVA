
public class TestGame {
    public static void main(String[] args) {

    	// Creating teams
        Game team1 = new Game("Team A", "Coach A", "7 pm");
        Game team2 = new Game("Team B", "Coach B", "7 pm");

        // Displaying game details
        System.out.println("Information about the Team 1: ");
        displayGameDetails(team1);
        System.out.println();
        System.out.println("Information about the Team 2: ");
        displayGameDetails(team2);
    }

    public static String displayGameDetails(Game game) {
    	
    	  	
        return 	"Name: " + game.getTeamName()+ 
        		"\nCoach: " + game.getCoachName()+ 
        		"\nTime: " +game.getGameStartTime();
    }
}

