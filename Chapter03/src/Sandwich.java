/* Create a class named Sandwich. Data fields include a String for the main
ingredient (such as tuna), a String for bread type (such as wheat), and a
double for price (such as 4.99). Include methods to get and set values for
each of these fields.*/

public class Sandwich {
	
	private String mainIngredient;
	private String breadName;
	private double price;
	
	public String getMainIngredient() {
		return mainIngredient;
	}
	
	public void setMainIngredient(String mainIngredient) {
		this.mainIngredient = mainIngredient;
	}
	
	public String getBreadName() {
		return breadName;
	}
	
	public void setBreadName(String breadName) {
		this.breadName = breadName;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

}
