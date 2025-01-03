/*Create a class named BloodData that includes fields that hold a blood type
(the four blood types are O, A, B, and AB) and an Rh factor (the factors are
+ and –). Create a default constructor that sets the fields to O and +, and
an overloaded constructor that requires values for both fields. Include get
and set methods for each field.*/

public class BloodData {

	//FIELDS
	private String blood;
	private char rhFactor;
	
	//DEFAULT CONSTRUCTOR
	public BloodData() {
		this.blood = "O";
		this.rhFactor = '+';
	}
	
	//CONSTRUCTOR
	public BloodData(String blood,  char rhFactor) {
		this.blood = blood;
		this.rhFactor = rhFactor;
	}

	//GET AND SET METHODS
	public String getBlood() {
		return blood;
	}

	public void setBlood(String blood) {
		this.blood = blood;
	}

	public char getRhFactor() {
		return rhFactor;
	}

	public void setRhFactor(char rhFactor) {
		this.rhFactor = rhFactor;
	}
	
	
	
}
