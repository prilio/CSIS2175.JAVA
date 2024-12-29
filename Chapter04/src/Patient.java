
public class Patient {
	
	//FIELDS
	private String blood;
	private char rhFactor;
	private int ID;
	private int age;
	
	//DEFAULT CONSTRUCTOR
	public Patient() {
		this.blood = "O";
		this.rhFactor = '+';
		this.ID = 0;
		this.age = 0;
	}

	//CONSTRUCTOR
	public Patient(String blood, char rhFactor, int iD, int age) {
		this.blood = blood;
		this.rhFactor = rhFactor;
		ID = iD;
		this.age = age;
	}

	//GET METHODS
	public String getBlood() {
		return blood;
	}

	public char getRhFactor() {
		return rhFactor;
	}

	public int getID() {
		return ID;
	}

	public int getAge() {
		return age;
	}

	
}
