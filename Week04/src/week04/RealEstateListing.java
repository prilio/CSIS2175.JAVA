package week04;

import javax.swing.JOptionPane;

public class RealEstateListing {
	
	private int listingNumber;
	private double price;
	private HouseData houseData;
	
	
	
	public RealEstateListing(int listingNumber, double price, String address, int sqFt) {
		super();
		this.listingNumber = listingNumber;
		this.price = price;
		houseData = new HouseData(address, sqFt);
	}


	public void display() {
		JOptionPane.showMessageDialog(null, "Listing number #" + listingNumber + " Selling for $" + price);
		JOptionPane.showMessageDialog(null, "Address: " + houseData.streetAddress + 
				"\n" +houseData.squareFeet + " square feet");
		
	}

	private class HouseData{
		private String streetAddress;
		private int squareFeet;
		
		public HouseData(String address, int sqFt) {
			streetAddress = address;
			squareFeet = sqFt;
		}
		
		
	}

}
