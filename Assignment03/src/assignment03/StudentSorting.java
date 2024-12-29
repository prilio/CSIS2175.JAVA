package assignment03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.JOptionPane;

public class StudentSorting {
    public static void main(String[] args) {
        
    	
        // Define and set data fields for ten students
    	ArrayList<Student> students = new ArrayList<Student>();

    	String[] firstNames = {"Taylor", "Dua", "Ed", "Milley", "Justin"};
    	String[] lastNames = {"Swift", "Lipa", "Sheeran", "Cyrus", "Bieber"};
    	double[] tuitions = {5000.0, 6000.0, 5500.0, 6200.0, 5300.0};

    	//Add the students into the ArrayList
    	for (int i = 0; i < firstNames.length; i++) {
    	    Student student = new Student(firstNames[i], lastNames[i], tuitions[i]);
    	    students.add(student);    	    
    	}
        
        // Create a StringBuilder to build the output message
        StringBuilder messageUnsorted = new StringBuilder();
        StringBuilder messageSorted = new StringBuilder();

        // Append the unsorted list of students to the message
        messageUnsorted.append("Unsorted Students:\n");
        for (Student student : students) {
        	messageUnsorted.append(student).append("\n");
        }

        // Display the message in a JOptionPane dialog
        JOptionPane.showMessageDialog(null, messageUnsorted.toString(), 
        		"Student Information", JOptionPane.INFORMATION_MESSAGE);
        
        // Sort the students based on tuition
        // Sort the students based on tuition
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                // Compare the tuitions of the two students
                return Double.compare(student1.getTuition(), student2.getTuition());
            }
        });

        // Append the sorted list of students to the message
        messageSorted.append("\nSorted Students by Tuition:\n");
        for (Student student : students) {
        	messageSorted.append(student).append("\n");
        }

        // Display the message in a JOptionPane dialog
        JOptionPane.showMessageDialog(null, messageSorted.toString(), 
        		"Student Information", JOptionPane.INFORMATION_MESSAGE);
    }
}