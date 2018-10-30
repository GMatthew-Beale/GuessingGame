import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class GraphicsColor2 
	{

		public static void main(String[] args)
			{
				GraphicChallenge Mycanvas = new GraphicChallenge();
		        JFrame frame = new JFrame();
		        frame.setSize(100, 100);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.getContentPane().add(Mycanvas).setBackground(Color.black);
		        frame.setLocationRelativeTo(null);  
		        frame.setResizable(false);
		        frame.setVisible(true);
			}
		public void paint3(Graphics graphics)
		{
		graphics.setColor(new Color(0,0,225));
		graphics.fillRect(0, 0, 50, 50);
		}
	
	
	
	
	
	
	
	
	
	}
