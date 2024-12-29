package week08;

import javax.swing.JOptionPane;

public class PassArray {

	public static void main(String[] args) {
		
		final int NUM_ELEMENTS = 4;
		int[] someNums = {5, 10, 15, 20};
		int x;
		JOptionPane.showMessageDialog(null, "At start of main: ");
		for(x =0; x <NUM_ELEMENTS; ++x)
			JOptionPane.showMessageDialog(null, " " + someNums[x]);
		methodGetsArray(someNums);
		JOptionPane.showMessageDialog(null, "At the end of main: ");
		for(x =0; x <NUM_ELEMENTS; ++x)
			JOptionPane.showMessageDialog(null, " " + someNums[x]);

	}
	public static void methodGetsArray(int[] arr) {
		int x;
		JOptionPane.showMessageDialog(null, "At start of method arr holds: ");
		for(x =0; x <arr.length; ++x)
			JOptionPane.showMessageDialog(null, " " + arr[x]);
		for(x =0; x <arr.length; ++x)
			arr[x] = 888;
		JOptionPane.showMessageDialog(null, " and at end of method arr holds: ");
		for(x =0; x <arr.length; ++x)
			JOptionPane.showMessageDialog(null, " " + arr[x]);
	}

}
