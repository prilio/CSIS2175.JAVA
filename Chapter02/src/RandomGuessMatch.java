
import javax.swing.JOptionPane;

/* In the “Game Zone” section in Chapter 1, you learned how to obtain a random
number. For example, the following statement generates a random number
between the constants MIN and MAX inclusive and assigns it to a variable named
random:
random = MIN + (int)(Math.random() * MAX);
Write a program that selects a random number between 1 and 5 and asks
the user to guess the number. Display a message that indicates the difference
between the random number and the user’s guess. Display another message that
displays the random number and the Boolean value true or false depending
on whether the user’s guess equals the random number.*/


public class RandomGuessMatch {

	public static void main(String[] args) {
		
		String userInput;
		userInput = JOptionPane.showInputDialog("Enter a number between 1 and 5 >> ");
		int userNumber = Integer.parseInt(userInput);
		int randomNumber = (1 + (int)(Math.random() * 5));
		int difference = randomNumber - userNumber;
		JOptionPane.showMessageDialog(null, "The difference between the random number and the user's guess is "
										+ difference);
		boolean value;
		value = (randomNumber == userNumber);
		JOptionPane.showMessageDialog(null, "Is random number equal to the user's guess? " + value +
											"\nThe random number is " + randomNumber);
		
		
		

	}

}
