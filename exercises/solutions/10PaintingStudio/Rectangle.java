import java.awt.*;

public class Rectangle extends GeometricShape implements Drawable {
	private int a;
	private int b;
	private int x;
	private int y;
	private Color color;

	Rectangle(int a, int b, int x, int y, Color color) {
		this.a = a;
		this.b = b;
		this.x = x;
		this.y = y;
		this.color = color;
	}

	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getWidth() {
		return a;
	}
	public int getHeight() {
		return b;
	}
	public Color getColor() {
		return color;
	}
	@Override
	public double getPerimeter() {
		return 2*a + 2*b;
	}

	@Override
	public double getArea() {
		return a*b;
	}

	@Override
	public void draw(Graphics graphics) {
		graphics.setColor(color);
		graphics.fillRect(a, b, x, y);
	}
}
