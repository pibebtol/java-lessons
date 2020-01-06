## Painting Studio

### Description
**For this task we reuse the solution from exercise 9.**
If you had trouble with exercise 9, checkout the [solution](https://github.com/pibebtol/java-lessons/tree/master/exercises/solutions/07Vehicles).

For a painting tool we want to be able to take some of our geometric shapes and draw them onto the canvas.

Therefore we want to give it some new properties like border, color, position and such.

### Tasks
1. Create a class `Line` with 4 integers: `startX`, `startY`, `endX` and `endY`.
2. Create the interface class `Drawable`.
   - This class defines the function `draw(Color color)`, which is imported via `import java.awt.Color;` (on the very top of your file).
2. The `Circle`, `Line` and `Rectangle` class should implement the interface `Drawable`.
3. Implement all the functions for Square, Line and Rectangle.
4. Create the file `PaintingStudio.java` and insert the content below.
5. Profit!

### Content for the file *PaintingStudio.java*
```java
import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class PaintingStudio {

    static Drawable[] drawables = new Drawable[3];

    public static void main(String[] args) {

        drawables[0] = new Rectangle(1, 1, 70, 90, Color.RED);
        drawables[1] = new Circle(30, 40, 50, Color.BLUE);
        drawables[2] = new Line(40, 50, 90, 20, Color.GREEN);

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame f = new JFrame("Painting Studio");
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.setSize(250, 250);
                f.add(new MyPanel());
                f.pack();
                f.setVisible(true);
            }
        });
    }

    static class MyPanel extends JPanel {
        public Graphics g;

        public MyPanel() {
            setBorder(BorderFactory.createLineBorder(Color.black));
        }

        public Dimension getPreferredSize() {
            return new Dimension(500, 500);
        }

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawString("This is the painting studio!", 10, 20);

            for (Drawable drawable : drawables) {
                drawable.draw(g);
            }
        }
    }
}
```
