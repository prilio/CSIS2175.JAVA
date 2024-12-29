/* Create a class named Person that holds the following fields: two String objects
for the person’s first and last name and a LocalDate object for the person’s
birthdate. Provide constructors for each class that accept parameters for each field, and provide
get methods for each field.*/

import java.time.LocalDate;

public class Person {

	//FIELDS
	private String firstName;
	private String lastName;
	private LocalDate birthdate;
	
	
	//CONSTRUCTOR
	public Person(String firstName, String lastName, LocalDate birthdate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthdate = birthdate;
	}

	//GET METHODS
	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public LocalDate getBirthdate() {
		return birthdate;
	}
	
	
	
	
}
