import javax.swing.JOptionPane;

public class NumbersDemo {

	public static void main(String[] args) {

		double answer = 2.20 - 2.00;

		boolean isEqual = answer != 0.20;

		System.out.println("answer is " + answer);
		System.out.println("isEqual is " + isEqual);
		
		
	      int creditDays = 30;
	      
	      JOptionPane.showMessageDialog(null, "" + creditDays);
	      JOptionPane.showMessageDialog (null, "Every bill is due in " + creditDays + " days");
	      
	      int billingDate = 5;
	      
	      System.out.print("Bills are sent on day ");
	      System.out.print(billingDate);
	      
	      System.out.println(" of the month");
	      System.out.println("Next bill: October " + billingDate);
	      
	      
	      String result;
	      result = JOptionPane.showInputDialog(null, "What is your name?");
	      JOptionPane.showMessageDialog(null, "Hello, " + result + "!");

	}

}
