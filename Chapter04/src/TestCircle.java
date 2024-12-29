/* Create a class named TestCircle whose main() method declares several
Circle objects. Using the setRadius() method, assign one Circle a
small radius value, and assign another a larger radius value. Do not assign
a value to the radius of the third circle; instead, retain the value assigned
at construction. Display all the values for all the Circle objects.*/

public class TestCircle {

	public static void main(String[] args) {


		Circle circle1 = new Circle();
		Circle circle2 = new Circle();
		Circle circle3 = new Circle();
		

		circle1.setRadius(2.4);
		circle2.setRadius(7.3);
		
		displayCircleDetails(circle1);
		displayCircleDetails(circle2);
		displayCircleDetails(circle3);
	}
	
	public static void displayCircleDetails(Circle circle) {
        System.out.println("Circle Details:");
        System.out.println("---------------");
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Diameter: " + circle.getDiameter());
        System.out.println("Area: " + circle.getArea());
        System.out.println();
	}

}
