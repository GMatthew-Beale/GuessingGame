import java.awt.Canvas;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;

import javax.swing.JFrame;
	
public class GraphicChallenge extends Canvas
	{
		
		public static void main(String[] args)
		{
			GraphicChallenge1();
			
		}
			
		 
	public static void GraphicChallenge1()
	
			{
				
				GraphicChallenge canvas = new GraphicChallenge();
		        JFrame frame = new JFrame();
		        frame.setSize(1000, 1000);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.getContentPane().add(canvas).setBackground(Color.orange);
		        frame.setLocationRelativeTo(null);  
		        frame.setResizable(false);
		        frame.setVisible(true);
			}
		        public void paint(Graphics graphics)
		        	{
				Scanner userInput = new  Scanner(System.in);				
				System.out.println("Which kind of square do you want");
				System.out.println("1: 250 X 250 Red 2: 250 X 250 Blue 3: 1000 X 1000 Red 4: 1000 X 1000 Blue");
				int size = userInput.nextInt();
	
				 
				if (size == 1)
					{
					graphics.setColor(Color.red);
					graphics.fillRect(0, 0, 250, 250);					       
					}
				if (size == 2)
					{
						graphics.setColor(Color.blue);
						graphics.fillRect(0, 0, 250, 250);		
					}
				if (size == 3)
					{
						graphics.setColor(Color.red);
						 graphics.fillRect(0,0,1000,1000);	
					}
				if (size == 4)
					{
						graphics.setColor(Color.blue);
						 graphics.fillRect(0,0,1000,1000);	
					}
		        	}
			
			
			
			
			
			
			
			
			
			
			
		        	}
			
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
