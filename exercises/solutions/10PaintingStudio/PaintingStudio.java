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