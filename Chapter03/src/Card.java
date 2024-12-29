/* Design a Card class that contains a
character data field to hold a suit (s for spades, h for hearts, d for diamonds,
or c for clubs) and an integer data field for a value from 1 to 13.
Include get and set methods for each field. Save the class as Card.java.*/

public class Card {
	

	private char suit;
	private int value;
	
	public Card(char suit, int value) {
		super();
		this.suit = suit;
		this.value = value;
	}
	
	public char getSuit() {
		return suit;
	}
	public void setSuit(char suit) {
		this.suit = suit;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "The card is " + value + " of the suit " +  suit;
	}
		
	
//	public Card() {
//		
//		this.spades = 's';
//		this.hearts = 'h';
//		this.diamonds = 'd';
//		this.clubs = 'c';
//	}

	
	
	
	
	

}