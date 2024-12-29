
public class RoundCake extends Cake {

	public RoundCake(int size, String flavor) {
		super(size, flavor);
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		double radius = 0.5 * getSize();
		return  radius * radius * Math.PI;
	}

	@Override
	public String toString() {
		return "Round cake, " + super.toString();
	}
}
