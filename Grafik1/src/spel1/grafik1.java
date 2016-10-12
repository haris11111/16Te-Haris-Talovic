package spel1;

import javax.swing.*;
import java.awt.*;
public class grafik1 extends JPanel {

	private int width = 100;
	private int height = 100;
	private int d = 50;
	private int x = 0;
	private int y = 0;
	private int moveX = 1;
	private int moveY = 1;
	Color ballColor = new Color(0xE73);

	private void moveBall() {
		if(x + moveX <=0)
			moveX = 1;
		if(x + moveX > getWidth() - d)
			moveX = -1;
		if(y + moveY <0)
			moveY = 1;
		if(y + moveY > getHeight() - d)
			moveY = -1;
		
		x += moveX;
		y += moveY;
	}

	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setColor(ballColor);
		g2d.fillOval(x, y, d, d);
		

	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		grafik1 grafik = new grafik1();
		
		frame.setSize(700, 800);
		frame.setLocation(300, 300);
		frame.setTitle("HAHAH");
		frame.setDefaultCloseOperation(3);
		frame.add(grafik);
		frame.setResizable(false);
		frame.setVisible(true);
		while (true) {
			grafik.moveBall();
			grafik.repaint();
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
