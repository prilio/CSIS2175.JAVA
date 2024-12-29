/*Create a class named Circle with fields named radius, diameter, and area.
Include a constructor that sets the radius to 1 and calculates the other two
values. Also include methods named setRadius() and getRadius(). The
setRadius() method not only sets the radius, but it also calculates the other
two values. (The diameter of a circle is twice the radius, and the area of a circle
is pi multiplied by the square of the radius. Use the Math class PI constant
for this calculation.)*/

public class Circle {


	//FIELDS
	private double radius;
	private double diameter;
	private double area;

	//CONSTRUCTOR TO CALCULATE AREAS
	public Circle()
	{
		this.radius = 1;
		this.calculateDiameter();
		this.calculateArea();
	}

	//SET RADIUS
	public void setRadius(double radius) {
		this.radius = radius;
		this.calculateDiameter();
		this.calculateArea();
	}
	
	//GET METHODS
	public double getRadius()
	{
		return radius;
	}

	public double getDiameter() {
		return diameter;
	}

	public double getArea() {
		return area;
	}
	
	//CONSTRUCTOR METHODS
	public void calculateDiameter()
	{
		diameter = 2 * radius;
	}

	public void calculateArea()
	{
		area = Math.PI * Math.pow(radius, 2);
	}
	

	

	
	
}


