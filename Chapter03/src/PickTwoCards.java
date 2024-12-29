/* Write an application that randomly selects two playing cards and displays their
values. Simply assign a suit to each of the cards, but generate a random number
for each card’s value. For now, just observe how the card values change as you
execute the program multiple times.*/

public class PickTwoCards {

	public static void main(String[] args) {
		
		final int CARDS_IN_SUIT = 13;
		
		Card suit1 = new Card('S', ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1));
		Card suit2 = new Card('H', ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1));
		
		
		
		System.out.println(suit1);
		System.out.println(suit2);
		
	}

}
