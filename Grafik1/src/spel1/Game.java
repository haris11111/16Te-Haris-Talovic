package spel1;

import javax.swing.*;
import java.awt.*;
public class Game extends JPanel {
	
	Ball ball = new Ball(this);
	
	private void moveBall(){
		ball.move();
	}

	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
      ball.paint(g2d);

	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		Game game = new Game();
		
		frame.setSize(700, 800);
		frame.setLocation(300, 300);
		frame.setTitle("HAHAH");
		frame.setDefaultCloseOperation(3);
		frame.add(game);
		frame.setResizable(false);
		frame.setVisible(true);
		while (true) {
			game.moveBall();
			game.repaint();
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
