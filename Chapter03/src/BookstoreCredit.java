import java.util.Scanner;

/*To encourage good grades, Hermosa High School has decided to award each
student a bookstore credit that is 10 times the student’s grade point average. In
other words, a student with a 3.2 grade point average receives a $32 credit. Create
a class that prompts a student for a name and grade point average, and then
passes the values to a method that displays a descriptive message. The message
uses the student’s name, echoes the grade point average, and computes and
displays the credit.*/

public class BookstoreCredit {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter the student name >> ");
		String name = input.next();
		
		System.out.print("Enther the student grade point average >> ");
		double grade = input.nextDouble();
		
		displayDescription(name, grade);

	}
	
	public static void displayDescription(String stdName, double stdGrade) {
		
		double credit = stdGrade * 10;
		
		System.out.println(stdName + " has a " + stdGrade + " grade point average.");
		System.out.println(stdName + " will receive a bookstore credit of $" + credit + ".");
		
	}

}
