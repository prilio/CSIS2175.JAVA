package week04;

import javax.swing.JOptionPane;

public class BaseballPlayer {

	private static int count = 0;
	private int number;
	private double battingAverage;
	
	public BaseballPlayer(int id, double avg) {
		number = id;
		battingAverage = avg;
		count = count +1;
	}
	public void showPlayer() {
		JOptionPane.showMessageDialog(null, "Player #" + number + " batting average is " + battingAverage +
				". There are " + count + " players");
	}
}
