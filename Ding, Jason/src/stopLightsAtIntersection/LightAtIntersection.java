package stopLightsAtIntersection;

import processing.core.PApplet;

public class LightAtIntersection 
{
	private PApplet parent;
	private int x, y, color; // 1: R, 2: Y, 3: G
	boolean hasArrow, arrowIsOn;
	
	public LightAtIntersection(PApplet par, int ex, int why, int clr, boolean arrow)
	{
		parent = par;
		x = ex;
		y = why;
		color = clr;
		hasArrow = arrow;
		arrowIsOn = false;
	}
	
	public void drawSelf()
	{
		parent.fill(99);
		parent.rect(x, y, 50, 150);
	
		parent.fill(50);
		parent.ellipse(x + 25, y + 25, 38, 38);
		parent.ellipse(x + 25, y + 75, 38, 38);
		parent.ellipse(x + 25, y + 125, 38, 38);
		parent.noStroke();

		if (hasArrow)
		{
			parent.fill(99);
			parent.rect(x, y + 150, 50, 50);
			parent.fill(50);
			parent.ellipse(x + 25,  y + 175, 38, 38);
			
			if (arrowIsOn)
			{
				parent.fill(60, 234, 66);
				parent.triangle(x + 13, y + 175, x + 23, y + 165, x + 23, y + 185);
				parent.rect(x + 23, y + 170, 13, 10);
			}
		}
		
		if (color == 1)
		{
			parent.fill(255, 0, 0);
			parent.ellipse(x + 25,  y + 25,  38, 38);
		}

		if (color == 2)
		{
			parent.fill(255, 252, 102);
			parent.ellipse(x + 25,  y + 75,  38, 38);
		}
	
		if (color == 3)
		{
			parent.fill(60, 234, 66);
			parent.ellipse(x + 25, y + 125, 38, 38);
		}
		
		
	}

	public int getColor()
	{
		return color;
	}
	
	public void changeStateOfArrow()
	{
		arrowIsOn = ! arrowIsOn;
	}
	public boolean getStateOfArrow()
	{
		return arrowIsOn;
	}
	public void changeColor()
	{
		color--;
		if (color == 0)
			color = 3;
	}
	
	

}
