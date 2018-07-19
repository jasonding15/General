package flashySquare;

import processing.core.PApplet;

public class FlashySquare 
{
	private PApplet parent;
	private int x, y;
	private boolean isVisible;
	private int delay, nextChange;
	
	
    public FlashySquare(PApplet par, int initX, int initY, int dly)
    {
    		parent = par;
    		x = initX;
    		y = initY;
    		delay = dly;
    		nextChange = dly;
    		isVisible = true;
    }

    public void updateVisibility()
    {
    		if (parent.millis() >= nextChange)
    		{
    			isVisible = ! isVisible;
    			nextChange= parent.millis() + delay;
    		}
    }
    public void drawSelf()
    {
        parent.fill(208, 183, 232);
        
        if (isVisible)
        	parent.rect(x, y, 100, 100);
    }
}
