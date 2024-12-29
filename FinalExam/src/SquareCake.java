
public class SquareCake extends Cake {

	public SquareCake(int size, String flavor) {
		super(size, flavor);
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		int length = getSize();
		return length * length;
	}

	@Override
	public String toString() {
		return "Square cake, " + super.toString();
	}
}
