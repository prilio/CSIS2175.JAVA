/*Create a class named Couple that contains two Person objects.
 * Provide constructors for each class that accept parameters for each field, and provide
get methods for each field.*/

public class Couple {

	//FIELDS
	private Person person1;
	private Person person2;
	
	
	//CONSTRUCTOR
	public Couple(Person person1, Person person2) {
		this.person1 = person1;
		this.person2 = person2;
	}


	//GET METHODS
	public Person getPerson1() {
		return person1;
	}


	public Person getPerson2() {
		return person2;
	}
	

	
	
}
