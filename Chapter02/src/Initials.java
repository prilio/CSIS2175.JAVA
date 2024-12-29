import java.util.Scanner;

/*Write a program that declares variables to hold your three initials. Display the
three initials with a period following each one, as in J.M.F.*/

public class Initials {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String firstNameInitial;
		String midleNameInitial;
		String lastNameInitial;
		
		System.out.println("Please, enter your First Name initial >> ");
		firstNameInitial = input.nextLine();
		System.out.println("Please, enter your Middle Name initial >> ");
		midleNameInitial = input.nextLine();
		System.out.println("Please, enter your Last Name initial >> ");
		lastNameInitial = input.nextLine();
		
		System.out.println("Your Initials are: " + firstNameInitial + "." 
		+ midleNameInitial + "." + lastNameInitial + ".");

	}

}
