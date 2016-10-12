import java.awt.*;

public class Ball {
private int width = 100;
private int height = 100;
private int d = 50;
private int x = 0;
private int y = 0;
private int moveX = 1;
private int moveY = 1;
Color ballColor = new Color(0xE73);

	
	
	public Ball (Game game){
		this.game = game;
	}
		
	
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

}
