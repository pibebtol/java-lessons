
public class Square implements GeometricShape {

	private int a;

	Square(int a) {
		this.a = a;
	}

	@Override
	public double getPerimeter() {
		return 4*a;
	}

	@Override
	public double getArea() {
		return a*a;
	}

}
