/*Create a class named FormLetterWriter that includes two overloaded methods
named displaySalutation(). The first method takes one String parameter that
represents a customer’s last name, and it displays the salutation Dear Mr. or Ms.
followed by the last name. The second method accepts two String parameters
that represent a first and last name, and it displays the greeting Dear followed by
the first name, a space, and the last name. After each salutation, display the rest of
a short business letter: Thank you for your recent order. Write a main() method
that tests each overloaded method.  */

public class FormLetterWriter {

	public static void main(String[] args) {

		String lastNameMain = "Crudi"; 
		String firstNameMain = "Priscila"; 

		displaySalutation(lastNameMain);
		System.out.println();
		displaySalutation(lastNameMain, firstNameMain);

	}
	
	public static void displaySalutation(String name) {
		
		System.out.println("Dear Mr(s). " + name);
		System.out.println("Thank you for your recent order.");
	}
	
	public static void displaySalutation(String lName, String fName) {
		
		System.out.println("Dear " + fName + " " + lName);
		System.out.println("Thank you for your recent order.");
	}

}
