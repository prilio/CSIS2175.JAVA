package week08;

import javax.swing.JOptionPane;

public class AverageOfQuizzes {

	public static void main(String[] args) {
		
		int[] scores = new int[10];
		int score = 0;
		int count = 0;
		int total = 0;
		final int QUIT = 999;
		final int MAX = 10;
		
		score = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter quiz score or " 
					+ QUIT + " to quit >> "));
		while(score != QUIT) {
			scores[count] = score;
			total += scores[count];
			++count;
			if(count == MAX) {
				score = QUIT;
			}
			else {
				score = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the next quiz score or " 
			+ QUIT + " to quit >> "));
			}
		}
		JOptionPane.showMessageDialog(null, "The scores entered were: ");
		for(int x = 0; x < count; ++x)
			JOptionPane.showMessageDialog(null, scores[x] + " ");
		if(count != 0)
			JOptionPane.showMessageDialog(null, "The average is " + (total *1.0 /count));
		else
			JOptionPane.showMessageDialog(null, "No scores were entered");

	}

}
