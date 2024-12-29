/*Computer games often contain different characters or creatures. For example,
you might design a game in which alien beings possess specific characteristics
such as color, number of eyes, or number of lives. Design a character for a game,
creating a class to hold at least three attributes for the character. Include methods
to get and set each of the character’s attributes. */

public class MyCharacter {
	
	private String color;
	private int numberEyes;
	private int numberLifes;
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNumberEyes() {
		return numberEyes;
	}
	public void setNumberEyes(int numberEyes) {
		this.numberEyes = numberEyes;
	}
	public int getNumberLifes() {
		return numberLifes;
	}
	public void setNumberLifes(int numberLifes) {
		this.numberLifes = numberLifes;
	}
	
	@Override
	public String toString() {
		return "The attributes are: \nColor: " + color + 
				"\nNumber of Eyes: " + numberEyes + 
				"\nNumber of Lifes: " + numberLifes;
	}
	
	

}
