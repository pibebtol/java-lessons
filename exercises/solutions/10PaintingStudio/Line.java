import java.awt.*;

public class Line implements Drawable {

    int startX, startY, endX, endY;
    Color color;

    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(color);
        graphics.drawLine(startX, startY, endX, endY);
    }

    public Line(int startX, int startY, int endX, int endY, Color color) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.color = color;
    }
}
