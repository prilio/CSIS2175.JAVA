import java.util.Scanner;

/*Using the Die class, write an application that randomly “throws” five dice for the
computer and five dice for the player. Display the values and then, by observing
the results, decide who wins based on the following hierarchy of Die values.
(The computer will not decide the winner; the player will determine the winner
based on observation.) Any higher combination beats a lower one; for example,
five of a kind beats four of a kind.
•• Five of a kind
•• Four of a kind
•• Three of a kind
•• A pair
*/
public class FiveDice {

	public static void main(String[] args) {


		Die throw1 = new Die();
		Die throw2 = new Die();
		Die throw3 = new Die();
		Die throw4 = new Die();
		Die throw5 = new Die();
		
		throw1.roll();
		throw2.roll();
		throw3.roll();
		throw4.roll();
		throw5.roll();
		
		System.out.println("The order of the values from the throws are: ");
		System.out.println(throw1.getRandomValue() + " | " + throw2.getRandomValue()+
							" | " + throw3.getRandomValue() + " | " +
							throw4.getRandomValue() + " | " + throw5.getRandomValue());
		
		Scanner input = new Scanner(System.in);
		System.out.println("Which conclusion that you got? Five of a kind, "
							+ "Four of a kind, Three of a kind, or A pair? ");
		String output = input.nextLine();
		System.out.println("Your conclusion is: " + output);

	}

}
