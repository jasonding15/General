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
		arrowIsOn = true;
	}
	
	public void drawSelf()
	{
		parent.fill(99);
		parent.rect(x, y, 100, 300);
	
		parent.fill(0);
		parent.ellipse(x + 50, y + 50, 75, 75);
		parent.ellipse(x + 50, y + 150, 75, 75);
		parent.ellipse(x + 50, y + 250, 75, 75);
	
		if (hasArrow)
		{
			parent.fill(99);
			parent.rect(x, y + 300, 100, 100);
			parent.fill(0);
			parent.ellipse(x + 50,  y + 350, 75, 75);
			
			if (arrowIsOn)
			{
				parent.fill(60, 234, 66);
				parent.noStroke();
				parent.triangle(x + 25, y + 350, x + 45, y + 330, x + 45, y + 370);
				parent.rect(x + 45, y + 340, 25, 20);
			}
		}
		
		if (color == 1)
		{
			parent.fill(255, 0, 0);
			parent.ellipse(x + 50,  y + 50,  75,  75);
		}

		if (color == 2)
		{
			parent.fill(255, 252, 102);
			parent.ellipse(x + 150,  y + 150,  175, 75);
		}
	
		if (color == 3)
		{
			parent.fill(60, 234, 66);
			parent.ellipse(x + 50, y + 250, 75, 75);
		}
		
		
	}

	public int getColor()
	{
		return color;
	}
	
	public void changeColor()
	{
		color--;
		if (color == 0)
			color = 3;
	}
	
	

}
