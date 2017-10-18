package ljs;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class MyComponent extends JPanel { 		 
	public void paintComponent(Graphics g) { 
		int x[] = new int[]{670,690,710,700,680};
		int y1[] = new int[]{10,20,10,40,40};
		int y2[] = new int[]{110,120,110,140,140};
		
		g.drawLine(10, 80, 100, 10); 
		g.drawString("DrawLine()", 10,100); 				
		
		g.drawRect(120, 10, 100, 80); 
		g.drawString("drawRect", 120, 100); 		
	
		g.draw3DRect(230, 10, 100, 80,isOptimizedDrawingEnabled());
		g.drawString("3DRect", 230, 100);  
		
		g.drawRoundRect(340, 10, 100, 80, 5, 5); 
		g.drawString("RoundRect", 340, 100);  
		
		g.drawOval(450, 10, 100, 80);
		g.drawString("drawOval", 450, 100); 
		
		g.drawArc(560, 10, 100, 80, 90, 110);
		g.drawString("drawArc", 560, 100); 
		
		g.drawPolygon(x, y1, x.length);
		g.drawString("drawPolygon",670, 100); 		
		
		
		g.fillRect(10, 110, 100, 80); 
		g.drawString("fillRect", 10, 210); 		
		
		g.fill3DRect(120, 110, 100, 80, isOptimizedDrawingEnabled()); 
		g.drawString("3DRect", 120, 210);
		
		g.fillRoundRect(230, 110, 100, 80, 5, 5); 
		g.drawString("RoundRect", 230, 210); 	
		
		g.fillOval(340, 110, 100, 80); 
		g.drawString("fillOval", 340, 210); 
		
		g.fillArc(450, 110, 100, 80, 90, 210); 
		g.drawString("fillArc", 450, 210); 
		
		g.fillPolygon(x, y2, x.length); 
		g.drawString("drawPolygon", 670, 210); } 
	} 

	public class Basicpaint { 
		public static void main(String[] args) { 
			JFrame frame = new JFrame(); 
			frame.setSize(1000, 300); 
			frame.setTitle("±×¸®±â"); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
			MyComponent component = new MyComponent(); 
			frame.add(component); 
			frame.setVisible(true); 
			} 		
	}



