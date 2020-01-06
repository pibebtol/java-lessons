import java.awt.*;

public class Circle extends GeometricShape implements Drawable {
	private int r;
	private int x, y;
	private Color color;

	Circle(int x, int y, int r, Color color) {
		this.x = x;
		this.y = y;
		this.r = r;
		this.color = color;
	}

	@Override
	public double getPerimeter() {
		return 2*pi*r;
	}

	@Override
	public double getArea() {
		return pi*r*r;
	}

	@Override
	public void draw(Graphics graphics) {
		graphics.setColor(color);
		graphics.drawOval(x, y, r, r);
	}
}
