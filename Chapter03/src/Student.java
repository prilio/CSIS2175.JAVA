/*Create a class named Student that has fields for an ID number, number
of credit hours earned, and number of points earned. (For example,
many schools compute grade point averages based on a scale of 4, so a
three-credit-hour class in which a student earns an A is worth 12 points.)
Include methods to assign values to all fields. A Student also has a field for
grade point average. Include a method to compute the grade point average
field by dividing points by credit hours earned. Write methods to display the
values in each Student field.*/

public class Student {

	private String studentID;
	private int creditHours;
	private double pointsEarned;
	private double averageGrade;
	
	public Student() {
		
	}
	
	
	public Student(String studentID, int creditHours, double pointsEarned) {
		this.studentID = studentID;
		this.creditHours = creditHours;
		this.pointsEarned = pointsEarned;
	}

	public String getStudentID() {
		return studentID;
	}
	
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	
	public int getCreditHours() {
		return creditHours;
	}
	
	public void setCreditHours(int creditHours) {
		this.creditHours = creditHours;
	}
	
	public double getPointsEarned() {
		return pointsEarned;
	}
	
	public void setPointsEarned(double pointsEarned) {
		this.pointsEarned = pointsEarned;
	}
	

	public double getAverageGrade() {
		return averageGrade;
	}
	
	public void calculateAverageGrade() {
		
		averageGrade = pointsEarned / creditHours;
	}
	

	
	public void displayStudent() {
		
		System.out.println(" Student Information ");
		System.out.println("ID: " + studentID);
		System.out.println("Credit hours earned: " + creditHours);
		System.out.println("Points earned: " + pointsEarned);
		System.out.println("Grade point average: " + averageGrade);
	}
}
