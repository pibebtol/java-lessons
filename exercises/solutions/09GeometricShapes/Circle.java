
public class Circle implements GeometricShape {
	private int r;

	Circle(int r) {
		this.r = r;
	}

	@Override
	public double getPerimeter() {
		return 2*pi*r;
	}

	@Override
	public double getArea() {
		return pi*r*r;
	}
}
