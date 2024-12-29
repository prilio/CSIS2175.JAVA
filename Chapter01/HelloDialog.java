//Filename HelloDialog.java
//Written by Priscila Lio Crudi
//Written on 2023-01-19

import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class HelloDialog {

	public static void main(String[] args) {
//		//Component frame;
//		// TODO Auto-generated method stub
//		JOptionPane.showMessageDialog(f, "Hello, world!");
//		/*JOptionPane.showInternalConfirmDialog(null,
//				"please choose one", "information",
//				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);*/
		
		JFrame f = new JFrame("ExerciseOptions v1.0");
	    f.setSize(200, 500);
	    f.setLocation(400, 400);
	    f.setVisible(true);
	    
	    JOptionPane.showMessageDialog(f, "You have mail.");
	    //JOptionPane.showMessageDialog(f, "You are low on memory.",
	        //"Apocalyptic message", JOptionPane.WARNING_MESSAGE);
	}

}
