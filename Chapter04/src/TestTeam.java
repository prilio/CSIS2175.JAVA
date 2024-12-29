/* Write an application named TestTeam to instantiate three Team objects with different values, and
then display all the data, including the motto, for each object.*/


public class TestTeam {

	public static void main(String[] args) {

		Team team1 = new Team("Roosevelt High", "Girl's Basketball", "Dolphins");
		Team team2 = new Team("Queen Elizabeth High", "Boy's Soccer", "Walles");
		Team team3 = new Team("Vancouver High", "Girl's Softball", "Ravens");
		
		System.out.println("Team 01: ");
		System.out.println("School: " + team1.getSchoolName());
		System.out.println("Sport: " + team1.getSportName());
		System.out.println("Team name: " + team1.getTeamName());
		System.out.println(team1.MOTTO);
		System.out.println();
		System.out.println("Team 02: ");
		System.out.println("School: " + team2.getSchoolName());
		System.out.println("Sport: " + team2.getSportName());
		System.out.println("Team name: " + team2.getTeamName());
		System.out.println(team2.MOTTO);
		System.out.println();
		System.out.println("Team 03: ");
		System.out.println("School: " + team3.getSchoolName());
		System.out.println("Sport: " + team3.getSportName());
		System.out.println("Team name: " + team3.getTeamName());
		System.out.println(team3.MOTTO);
		

		
	}

}
