package week04;

import javax.swing.JOptionPane;

public class School {
	
	private NameAndAddress nameAdd;
	private int enrollment;
	
	public School(String name, String add, int zip, int enrolled) {

		nameAdd = new NameAndAddress(name, add, zip);
		enrollment = enrolled;
	}

	public void display() {
		JOptionPane.showMessageDialog(null, "The school information: ");
		nameAdd.display();
		JOptionPane.showMessageDialog(null, "Enrollment is " + enrollment);

	}
}
