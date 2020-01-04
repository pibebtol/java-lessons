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
		Rectangle rectangle = new Rectangle(50, 30, 100, 150, Color.RED);
		drawRectangle(g, rectangle, rectangle);
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