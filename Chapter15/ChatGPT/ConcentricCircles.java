import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class ConcentricCircles extends JPanel {
    private int numCircles;

    public ConcentricCircles(int numCircles) {
        this.numCircles = numCircles;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawConcentricCircles(g, getWidth() / 2, getHeight() / 2, 100, numCircles);
    }

    private void drawConcentricCircles(Graphics g, int x, int y, int radius, int n) {
        if (n == 0) {
            return;
        }

        Graphics2D g2d = (Graphics2D) g;
        Ellipse2D circle = new Ellipse2D.Double(x - radius, y - radius, 2 * radius, 2 * radius);

        g2d.draw(circle);

        int newRadius = (int) (radius * 0.8); // Decrease the radius for the next circle
        drawConcentricCircles(g, x, y, newRadius, n - 1);
    }

    public static void main(String[] args) {
        int numCircles = 10; // Change this to the desired number of concentric circles
        JFrame frame = new JFrame("Concentric Circles");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ConcentricCircles circlesPanel = new ConcentricCircles(numCircles);
        frame.add(circlesPanel);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
