
public class ShapeTester {

	public static void main(String[] args) {
		Circle circle = new Circle(5);
		System.out.println(circle.getArea() + " " + circle.getPerimeter());
		Square square = new Square(5);
		System.out.println(square.getArea() + " " + square.getPerimeter());
		Rectangle rect = new Rectangle(2, 2);
		System.out.println(rect.getArea() + " " + rect.getPerimeter());
	}

}
