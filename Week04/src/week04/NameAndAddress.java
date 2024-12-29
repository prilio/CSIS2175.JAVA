package week04;

import javax.swing.JOptionPane;

public class NameAndAddress {

	private String name;
	private String address;
	private int zipCode;
	
	public NameAndAddress(String name, String address, int zipCode) {
		super();
		this.name = name;
		this.address = address;
		this.zipCode = zipCode;
	}
	
	public void display() {
		JOptionPane.showMessageDialog(null, name);
		JOptionPane.showMessageDialog(null, address);
		JOptionPane.showMessageDialog(null, zipCode);
	}
	
	

}
