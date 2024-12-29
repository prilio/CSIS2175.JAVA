package week04;

import javax.swing.JOptionPane;

public class Student {

	private int stuNum;
	private double gpa;
	
	public Student(int stuNum, double gpa) {
		super();
		this.stuNum = stuNum;
		this.gpa = gpa;
	}
	public void showStudent() {
		JOptionPane.showMessageDialog(null, "Student #" + stuNum + ", gpa is " + gpa);
	}
	
}
