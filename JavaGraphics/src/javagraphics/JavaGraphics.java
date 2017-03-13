package javagraphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author haris.talovic
 */
public class JavaGraphics extends JFrame {

    public JavaGraphics() throws HeadlessException {
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(new DrawArea());
        setVisible(true);

    }

    public static void main(String[] args) {
        new JavaGraphics();
    }

}

class DrawArea extends JPanel {

    int r = 100;
    int xc = 150, yc = 150;

    public DrawArea() {

    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.black);
        for (int i = 0; i < 100; i++) {

            g.drawArc(xc - r, yc - r, r * 2, r * 2, 0, 360);

            xc = 150;
            yc = 100;
            r = 50;
            g.drawArc(xc - r, yc - r, r * 2, r * 2, 270, 180);

            xc = 150;
            yc = 200;
            r = 50;
            g.drawArc(xc - r, yc - r, r * 2, r * 2, 90, 180);

            xc = 150;
            yc = 100;
            r = 12;
            g.drawArc(xc - r, yc - r, r * 2, r * 2, 0, 360);

            xc = 150;
            yc = 200;
            r = 12;
            g.drawArc(xc - r, yc - r, r * 2, r * 2, 0, 360);

            xc = 150; // vänster
            yc = 200;
            r = 50;
            g.drawArc(xc - r, yc - r, r * 2, r * 2, 90, 180);

            int width = 980;
            int heigh = 630;
            g.drawRect(10, 10, width, HEIGHT);

            g.drawLine(10, 18, 28 * i + 10, HEIGHT + 10);
            g.drawLine(width + 10, 18 * i + 10, width - 28 * 1 + 10, heigh + 10);
            g.drawLine(10, heigh - 18 * i + 10, width - 28 * i + 10, 10);
            g.drawLine(width + 10, heigh - 18 * i + 10, width - 28 * i + 10, 10);

        }
    }
}