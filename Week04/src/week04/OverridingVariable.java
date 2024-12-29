package week04;

import javax.swing.JOptionPane;

public class OverridingVariable {

	public static void main(String[] args) {
		int aNumber = 10;
		JOptionPane.showMessageDialog(null, "In main(), aNumber is " + aNumber);
		firstMethod();
		JOptionPane.showMessageDialog(null, "Back in main(), aNumber is " +aNumber);
		secondMethod(aNumber);
		JOptionPane.showMessageDialog(null, "Back in main() again, aNumber is " + aNumber);

	}
	public static void firstMethod() {
		int aNumber = 77;
		JOptionPane.showMessageDialog(null, "In firstMethod(), aNumber is " + aNumber);
	}
	public static void secondMethod(int aNumber) {
		JOptionPane.showMessageDialog(null, "In secondMethod(), at first aNumber is " + aNumber);
		aNumber = 862;
		JOptionPane.showMessageDialog(null, "In secondMethod(), after an assignment a Number is " + aNumber);
	}

}
