/*Create a class named Billing that includes three overloaded computeBill()
methods for a photo book store.
•• When computeBill() receives a single parameter, it represents the price of
one photo book ordered. Add 8% tax, and return the total due.
•• When computeBill() receives two parameters, they represent the price of
a photo book and the quantity ordered. Multiply the two values, add 8% tax,
and return the total due.
•• When computeBill() receives three parameters, they represent the price of a
photo book, the quantity ordered, and a coupon value. Multiply the quantity
and price, reduce the result by the coupon value, and then add 8% tax and
return the total due.
Write a main() method that tests all three overloaded methods.*/

public class Billing {

	public static void main(String[] args) {

		double photoPrice = 2.00;
		int quantity = 10;
		double cupon = 1.40;
		
		System.out.println(computeBill(photoPrice));
		System.out.println(computeBill(photoPrice, quantity));
		System.out.println(computeBill(photoPrice, quantity, cupon));

	}
	
	public static double computeBill(double price) {
		double tax = 0.08 * price;
		return price + tax;
//		return price * 1.08;
	}
	
	public static double computeBill(double price, int qtd) {
		double result = price * qtd;
		double tax = 0.08 * result;
		return result + tax;
//		return ((price * qtd) * 1.08);
	}

	public static double computeBill(double price, int qtd, double cupon) {
		double result = (price * qtd)-cupon;
		double tax = 0.08 * result;
		return result + tax;
//		return (((price * qtd) - cupon) * 1.08);
	}
}
