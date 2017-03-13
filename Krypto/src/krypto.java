import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.*;

public class krypto extends JPanel implements KeyListener{

	private static final long serialVersionUID = 93L;

	int Grid[][] = new int[][]{
            
              {1,3,5,2,4,1,1,1},
               {1,3,5,2,4,1,1,1},
                  {1,3,5,2,4,1,1,1},
                     {1,3,5,2,4,1,1,1},
                        {1,3,5,2,4,1,1,1},
                           {1,3,5,2,4,1,1,1},
                              {1,3,5,2,4,1,1,1},
                                 {1,3,5,2,4,1,1,1},

         
         
           
                
        };
                
	char[] Key = new char[] {'M','P','L','A','W','O','B','Q'};
 
 	int width= 75, height=75;	
 	int fontSizeSmall = 19;
 	int fontSizeLarge = 25;
 		
	public static void main(String[] args){		
		JFrame frame = new JFrame();
		frame.setSize(800,900);
 		frame.setLocation(100,100);
 		frame.setFocusable(true);
 		frame.setDefaultCloseOperation(3);
 		frame.setTitle("MUCK!");
 		frame.add(new krypto());
 		frame.setResizable(true);
 		frame.setVisible(true);
 	}
 	
 	public void paint(Graphics g) {
 		for (int y=0; y<8; y++){
 			for (int x=0; x<8; x++){
 				g.drawRect(x*width,y*height, width, height);
 				g.drawRect(x*width+1,y*height+1, width-2, height-2);
 				g.setFont(new Font("",0,fontSizeSmall));
 				g.drawString(String.valueOf(Grid[y][x]), x*width+8, (y)*height+fontSizeSmall);
 				
 				g.setFont(new Font("",0,fontSizeLarge));
 		        g.drawString(String.valueOf(  Key[Grid[y][x]]  ), x*width + width/2-fontSizeLarge /2,y*height+height-8);
 			}
 		}
 	}
 
 	public void keyTyped(KeyEvent e) {
 	}
 
 	public void keyPressed(KeyEvent e) {
 		if(e.getKeyChar() == 'w'){
 			Grid[1][1] = 0;
 		}
 		if(e.getKeyChar() == 's'){
 			Grid[1][1] = 2;
 		}
 		System.out.println("eee");
 }
 
 	public void keyReleased(KeyEvent e) {
 		repaint();
 	} 
 }

		
		