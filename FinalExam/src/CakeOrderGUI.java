import java.awt.event.*;
import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;

public class CakeOrderGUI extends JFrame implements ActionListener{

	private JLabel shapeLabel, sizeLabel, flavorLabel;
	private JComboBox<String> shapeComboBox, flavorComboBox;
	private JComboBox<Integer> sizeComboBox;
	private JButton showListButton, addCakeButton;
	
	private static ArrayList<Cake> cakes;
	
	public CakeOrderGUI() {
		super("Cake Order GUI");
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setLayout(new GridLayout(0,2)); 
	    shapeLabel = new JLabel("Choose Shape: ");
	    sizeLabel = new JLabel("Choose Size (in inches): ");
	    flavorLabel = new JLabel("Choose Flavor: ");
	    shapeComboBox = new JComboBox<String>();
	    shapeComboBox.addItem("Round");
	    shapeComboBox.addItem("Square");	    
	    sizeComboBox = new JComboBox<Integer>();
	    for(int i = 10; i <= 30; i=i+5)
	    	sizeComboBox.addItem(i);
	    flavorComboBox = new JComboBox<String>();
	    flavorComboBox.addItem("Chocolate");
	    flavorComboBox.addItem("Vanilla");
	    flavorComboBox.addItem("Hazelnut");
	    showListButton = new JButton("Show List of Cakes");
	    showListButton.addActionListener(this);
	    addCakeButton = new JButton("Add Selected Cake to Order");
	    addCakeButton.addActionListener(this);
	    add(shapeLabel);
	    add(shapeComboBox);
	    add(sizeLabel);
	    add(sizeComboBox);
	    add(flavorLabel);
	    add(flavorComboBox);
	    add(showListButton);
	    add(addCakeButton);
	}
	
	public static void main(String[] args)  {
		CakeOrderGUI cakeOrderGUI = new CakeOrderGUI();
		cakeOrderGUI.setSize(400, 200);
		cakeOrderGUI.setVisible(true);
		
		cakes = new ArrayList<Cake>();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(addCakeButton)) {
			Cake newCake;
			int size = (Integer)(sizeComboBox.getSelectedItem());
			String flavor = (String) (flavorComboBox.getSelectedItem());
			if("Round".equals(shapeComboBox.getSelectedItem())) {
				newCake = new RoundCake(size, flavor);
			} else {
				newCake = new SquareCake(size, flavor);
			}
			cakes.add(newCake);
			JOptionPane.showMessageDialog(this, "Successfully added: " + newCake);
		}
		
		if(e.getSource().equals(showListButton)) {
			String result = "List of cakes: \n";
			double totalSize = 0;
			for(Cake cake: cakes) {
				result += cake.toString() + "\n";
				totalSize += cake.getArea();
			}
			result += "Total size of cakes: " + totalSize + " square inches";
			JOptionPane.showMessageDialog(this, result);
		}
	}

}
