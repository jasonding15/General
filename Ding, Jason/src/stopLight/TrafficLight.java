package stopLight;

import processing.core.PApplet;

public class TrafficLight 
{
	private PApplet parent;
	private int x, y, color; // 1: R, 2: Y, 3: G
	
	public TrafficLight(PApplet par, int ex, int why, int clr)
	{
		parent = par;
		x = ex;
		y = why;
		color = clr;
	}
	
	public void drawSelf()
	{
		parent.fill(99);
		parent.rect(x, y, 200, 600);
		
		parent.fill(186, 185, 184);
		parent.ellipse(x + 100, y + 100, 150, 150);
		parent.ellipse(x + 100, y + 300, 150, 150);
		parent.ellipse(x + 100, y + 500, 150, 150);
		
		if (color == 1)
		{
			parent.fill(255, 0, 0);
			parent.ellipse(x + 100,  y + 100,  150,  150);
		}

		if (color == 2)
		{
			parent.fill(255, 252, 102);
			parent.ellipse(x + 100,  y + 300,  150, 150);
		}
		
		if (color == 3)
		{
			parent.fill(60, 234, 66);
			parent.ellipse(x + 100, y + 500, 150, 150);
		}
	}
	
	public void changeColor()
	{
		color--;
		if (color == 0)
			color = 3;
	}
	
	

}
