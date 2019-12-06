
public class Rectangle implements GeometricShape {
	private int a;
	private int b;

	Rectangle(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public double getPerimeter() {
		return 2*a + 2*b;
	}

	@Override
	public double getArea() {
		return a*b;
	}
}
