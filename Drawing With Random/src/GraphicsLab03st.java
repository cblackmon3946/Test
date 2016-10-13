// GraphicsLab03st.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*; 
																

public class GraphicsLab03st extends Applet
{
	
	public void paint(Graphics g) 	
	{
		// Draw Grid
		g.drawRect(10,10,780,580);
		g.drawLine(400,10,400,590);
		g.drawLine(10,300,790,300);
		
		Random rnd = new Random(1234);
		
		// Draw Random Lines
		int lineCount = 0;

		while (lineCount <= 100)
		{
		
			int Red = rnd.nextInt(255) +1;
			int Green = rnd.nextInt(255) +1;
			int Blue = rnd.nextInt(255) +1;
			Color customColor = new Color(Red, Green, Blue);
			int randX1 = rnd.nextInt(391) + 10;
			int randY1 = rnd.nextInt(291) + 10;
			int randX2 = rnd.nextInt(391) + 10;
			int randY2 = rnd.nextInt(291) + 10;
			g.setColor(customColor);
			g.drawLine(randX1, randY1, randX2, randY2);
			lineCount ++;
		
		}
		
		// Draw Random Squares
		int lineCount2 = 0;
		while (lineCount2 <= 100)
		{
			
			int randX3 = rnd.nextInt(331) + 410;
			int randY3 = rnd.nextInt(241) +10; 
			int Red2 = rnd.nextInt(255) +1;
			int Green2 = rnd.nextInt(255) +1;
			int Blue2 = rnd.nextInt(255) +1;
			Color customColor2 = new Color(Red2, Green2, Blue2);
			g.setColor(customColor2);
			g.fillRect(randX3, randY3, 50, 50);
			lineCount2 ++;
		}

		// Draw Random Circles
		int lineCount3 = 0;
		while (lineCount3 <= 100)
		{
			
			int Red3 = rnd.nextInt(255) +1;
			int Green3 = rnd.nextInt(255) +1;
			int Blue3 = rnd.nextInt(255) +1;
			Color customColor3 = new Color(Red3, Green3, Blue3);
			g.setColor(customColor3);
			int randX4 = rnd.nextInt(191) + 10;
			int randY4 = rnd.nextInt(91) + 300;
			int circleDiameter = rnd.nextInt(201);
			g.drawOval(randX4, randY4, circleDiameter, circleDiameter);
			lineCount3 ++;
			
		}

		// Draw 3-D Box
		int bluexpoints[] = {605, 605, 640};
		int blueypoints[] = {395, 430, 430};
		int bluenpoints = 3;
		int greenxpoints[] = {505, 505, 540, 540};
		int greenypoints[] = {395, 495, 530, 430};
		int greennpoints = 4;
		g.setColor(Color.yellow);
		g.fillRect(505, 395, 100, 100);
		g.setColor(Color.blue);
		g.fillPolygon(bluexpoints, blueypoints, bluenpoints);
		g.setColor(Color.red);
		g.fillRect(540, 430, 100, 100);
		g.setColor(Color.green);
		g.fillPolygon(greenxpoints, greenypoints, greennpoints);
		
	}
		
}



    
 