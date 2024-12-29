/*Write a class named ShowStudent that instantiates a Student object from the
class you created and assign values to its fields. Compute the Student grade
point average, and then display all the values associated with the Student.*/

public class ShowStudent {

	public static void main(String[] args) {
		
		Student student = new Student();
		
		String id = "300358805";
		student.setStudentID(id);
		System.out.print("ID: " + id);
		
		int credit = 4;
		student.setCreditHours(credit);
		System.out.print("Credit hours earned: " + credit);
		
		double points = 12;
		student.setPointsEarned(points);
		System.out.print("Points earned:  " + points);
				
		student.calculateAverageGrade();
		student.displayStudent();

	}

}
