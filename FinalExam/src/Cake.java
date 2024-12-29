
public abstract class Cake {

	private int size;
	private String flavor;
	
	public Cake(int size, String flavor) {
		this.size = size;
		this.flavor = flavor;
	}
	
	public int getSize() {
		return size;
	}
	
	public String toString() {
		return "Size: " + size + " inches, Flavor: " + flavor;
	}
	
	public abstract double getArea();
}
