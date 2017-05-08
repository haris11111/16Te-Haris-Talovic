
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

@SuppressWarnings("serial")
public class Heart1 extends JPanel {

    private static final double MULTIPLIER = 0.3;
    private static final int X_TRANSLATION = (int) (1000 * MULTIPLIER);
    private static final int Y_TRANSLATION = (int) (2 * 850 * MULTIPLIER);
    private static final Dimension APP_SIZE = new Dimension(2 * X_TRANSLATION,
            2 * X_TRANSLATION);
    private static final float STROKE_SIZE = 5;
    List<Point2D> pointsR = new ArrayList<Point2D>();

    public Heart1() {
        for (int t = 0; t <= 60; t++) {
            double r = MULTIPLIER * (-t * t + 40 * t + 1200.0);
            double theta = t * Math.PI / 180;
            double x = r * Math.sin(theta);
            double y = -r * Math.cos(theta);
            pointsR.add(new Point2D.Double(x, y));
        }
        setPreferredSize(APP_SIZE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(STROKE_SIZE));
        g2.setColor(Color.red);

       

        g2.setColor(Color.RED);

        g2.setFont(new Font("Arial", Font.BOLD, 50));
        g2.drawString("Анђела", 200, 250);
      
        

        if (pointsR.size() > 3) {
            Point2D p0 = pointsR.get(0);
            for (int i = 1; i < pointsR.size(); i++) {
                Point2D p1 = pointsR.get(i);
                int x1 = (int) p0.getX();
                int y1 = (int) p0.getY();
                int x2 = (int) p1.getX();
                int y2 = (int) p1.getY();
                g.drawLine(x1 + X_TRANSLATION, y1 + Y_TRANSLATION, x2 + X_TRANSLATION, y2 + Y_TRANSLATION);
                g.drawLine(X_TRANSLATION - x1, y1 + Y_TRANSLATION, X_TRANSLATION - x2, y2 + Y_TRANSLATION);
                p0 = p1;
            }
        }
    }

    private static void createAndShowUI() {
        JFrame frame = new JFrame("Heart");
        frame.getContentPane().add(new Heart1());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                createAndShowUI();
            }
        });
    }
}
