package flashySquare;

import processing.core.PApplet;

public class FlashySquare 
{
	private PApplet parent;
	private int x, y;
	private boolean isVisible;
	private int firstChange, nextChange;
	
	
    public FlashySquare(PApplet par, int initX, int initY, int frstChange)
    {
    		parent = par;
    		x = initX;
    		y = initY;
    		firstChange = frstChange;
    		nextChange = frstChange;
    		isVisible = true;
    }

    public void updateVisibility()
    {
    		if (parent.millis() >= firstChange)
    		{
    			isVisible = ! isVisible;
    			firstChange= parent.millis() + nextChange;
    		}
    }
    public void drawSelf()
    {
        parent.fill(208, 183, 232);
        
        if (isVisible)
        	parent.rect(x, y, 100, 100);
    }
}
