import java.time.LocalDate;

/*Create a class named Person that holds the following fields: two String objects
for the person’s first and last name and a LocalDate object for the person’s
birthdate. Create a class named Couple that contains two Person objects. Create
a class named Wedding for a wedding planner that includes the date of the wedding,
the names of the Couple being married, and a String for the location.
Provide constructors for each class that accept parameters for each field, and provide
get methods for each field. Then write a program that creates two Wedding
objects and in turn passes each to a method that displays all the details.*/

public class TestWedding {

	public static void main(String[] args) {


		//PERSON OBJECTS
		Person person1 = new Person("Priscila", "Lio", LocalDate.of(1984, 12, 19));
		Person person2 = new Person("Rafael", "Crudi", LocalDate.of(1980, 6, 24));
		Person person3 = new Person("Maria José", "da Silva", LocalDate.of(1960, 8, 25));
		Person person4 = new Person("José Ferreira", "Lio", LocalDate.of(1943, 3, 13));
		
		//COUPLE OBJECT
		Couple couple1 = new Couple(person1, person2);
		Couple couple2 = new Couple(person3, person4);
		
		//WEDDING OBJECT
		Wedding wedding1 = new Wedding(couple1, LocalDate.of(2013, 6, 1), "Campinas-SP");
		Wedding wedding2 = new Wedding(couple2, LocalDate.of(1984, 1, 14), "Belo Horizonte-MG");
		
		displayWedding(wedding1);
		System.out.println("------------------------------------------------------");
		displayWedding(wedding2);
		
	}
	public static void displayWedding(Wedding event) {
		
		System.out.println("Wedding date: " + event.getDate());
        System.out.println("Location: " + event.getLocation());
        
        Couple couple = event.getCouple();
        System.out.println("Couple 1: " + couple.getPerson1().getFirstName() + 
        		" " + couple.getPerson1().getLastName() +
                " (birthdate: " + couple.getPerson1().getBirthdate() + ")");
        System.out.println("Couple 2: " + couple.getPerson2().getFirstName() + 
        		" " + couple.getPerson2().getLastName() +
                " (birthdate: " + couple.getPerson2().getBirthdate() + ")");
	}

}
