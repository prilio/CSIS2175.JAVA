/* Create a constructor for the Student class you created. The constructor should
initialize each Student’s ID number to 9999, his or her points earned to 12, and
credit hours to 3 (resulting in a grade point average of 4.0). Write a program
that demonstrates that the constructor works by instantiating an object and
displaying the initial values. */


public class ShowStudent2 {

	public static void main(String[] args) {

		Student student = new Student("9999", 3, 12);
		
		student.calculateAverageGrade();
		student.displayStudent();

	}

}
