import java.util.Scanner;

/*Write a program that accepts the names of three political parties and the number
of votes each received in the last mayoral election. Display the percentage of the
vote each party received.*/

public class ElectionStatistics {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		String party1, party2, party3;
		int votes1, votes2, votes3;
		
		System.out.print("Enter a name of one Political Party >> ");
		party1 = input.nextLine();
		System.out.print("Enter the number of votes received from this party in the last mayoral election >> ");
		votes1 = input.nextInt();
		input.nextLine();
		System.out.print("Enter a name of another Political Party >> ");
		party2 = input.nextLine();
		System.out.print("Enter the number of votes received from this party in the last mayoral election >> ");
		votes2 = input.nextInt();
		input.nextLine();
		System.out.print("Enter a name of another Political Party >> ");
		party3 = input.nextLine();
		System.out.print("Enter the number of votes received from this party in the last mayoral election >> ");
		votes3 = input.nextInt();
		input.nextLine();
		
		double totalVotes = votes1 + votes2 + votes3;
		double percent1 = (votes1 / totalVotes) * 100;
		double percent2 = (votes2 / totalVotes) * 100;
		double percent3 = (votes3 / totalVotes) * 100;
		
		System.out.println("The total votes of the last mayoral election was " + totalVotes);
		System.out.println("The " + party1 + " party received " + votes1 + " in total or " + percent1 + "% of votes.");
		System.out.println("The " + party2 + " party received " + votes2 + " in total or " + percent2 + "% of votes.");
		System.out.println("The " + party3 + " party received " + votes3 + " in total or " + percent3 + "% of votes.");

	}

}
