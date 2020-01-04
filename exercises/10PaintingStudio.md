## Painting Studio

### Description
**For this task we reuse the solution from exercise 9.**
If you had trouble with exercise 9, checkout the [solution](https://github.com/pibebtol/java-lessons/tree/master/exercises/solutions/07Vehicles).

For a painting tool we want to be able to take some of our geometric shapes and draw them onto the canvas.

Therefore we want to give it some new properties like border, color, position and such.

### Tasks
1. Create two interfaces: `DesignProperties` and `Positionable`.
* `DesignProperties` should contain a *getColor* function that returns a `Color` (import the class color with `import java.awt.Color;`).
* `Positionable` should contain functions `getX` and `getY` - reference point as well as the `getWidth` and the `getHeight`.
2. The `Square` and `Rectangle` class should both implement the interfaces `DesignProperties` as well as `Positionable`.
3. Implement all the functions for Square and Rectangle.
4. Create the file `PaintingStudio.java` and insert the content below.
5. In `PaintingStudio.java`, on line 42 create your rectangle/square and draw them to the canvas!
6. Profit!

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
	public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
				JFrame f = new JFrame("Painting Studio");
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				f.setSize(250,250);
				f.add(new MyPanel());
				f.pack();
				f.setVisible(true);
            }
        });
    }
}

class MyPanel extends JPanel {
	public Graphics g;

    public MyPanel() {
        setBorder(BorderFactory.createLineBorder(Color.black));
    }
	
    public Dimension getPreferredSize() {
        return new Dimension(500,500);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("This is the painting studio!",10,20);
		
		// create your Rectangle with position, width, height and color and give it to the
		// function drawRectangle.
		// The call should look something like this:
		// drawRectangle(g, rectangle, rectangle);
    }

	/**
	 * Call this method in the function paintComponent. Give it the graphics object as well as your rectangle/square and
	 * the color from the rectangle.
	 */
	private void drawRectangle(Graphics g, Positionable pos, DesignProperties props) {
		g.setColor(props.getColor());
        g.fillRect(pos.getX(), pos.getY(), pos.getWidth(), pos.getHeight());
        g.setColor(Color.BLACK);
        g.drawRect(pos.getX(), pos.getY(), pos.getWidth(), pos.getHeight());
	}
}
```
