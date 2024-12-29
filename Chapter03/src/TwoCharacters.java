/*Then write an application in which you create at least two characters.
In turn, pass each character to a display method that displays the character’s
attributes.*/

public class TwoCharacters {

	public static void main(String[] args) {

		MyCharacter chair1 = new MyCharacter();
		MyCharacter chair2 = new MyCharacter();
		
		System.out.println("This application create two characters.");
		
		String color1 = "blue";
		String color2 = "red";
		int eyes1 = 3;
		int eyes2 = 5;
		int life1 = 300;
		int life2 = 120;
		
		chair1.setColor(color1);
		chair1.setNumberEyes(eyes1);
		chair1.setNumberLifes(life1);
		
		chair2.setColor(color2);
		chair2.setNumberEyes(eyes2);
		chair2.setNumberLifes(life2);
		
		System.out.println("First: " + chair1);
		System.out.println();
		System.out.println("Second: " + chair2);
		

	}

}
