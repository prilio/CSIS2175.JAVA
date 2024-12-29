/*Dice are used in many games. One die can be thrown to randomly show a
value from 1 through 6. Design a Die class that can hold an integer data field
for a value (from 1 to 6). Include a constructor that randomly assigns a value
to a die object.*/

public class Die {
	
	//FIELD
	private int value;
	private final int HIGHEST_DIE_VALUE = 6;
	private final int LOWEST_DIE_VALUE = 1;
	
	
	//CONSTRUCTOR
	public Die() {
		roll();
	}	
	
	//GET METHOD
	public int getRandomValue() {
		return value;
	}
	
	//ROLL THE DICES
	public void roll() {
		value = ((int) ((Math.random()*100)%HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE));
	}


	

	
	

}
