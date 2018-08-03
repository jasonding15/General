package stopLightsAtIntersection;

import processing.core.PApplet;

public class IntersectionLightsController
{
	private LightAtIntersection top, left, bottom, right; //bottomStopLight, rightStopLight;
	private PApplet parent;
	private int yellowDelay, greenDelay, nextChange, bothRedDelay, greenArrowDelay;
	private boolean withArrowIsActive, arrowIsOn;
	
	public IntersectionLightsController(PApplet par)
	{
		
		parent = par;
		top = new LightAtIntersection(parent, 425, 90, 1, true);
		bottom = new LightAtIntersection(parent, 525, 500, 1, true);
		right = new LightAtIntersection(parent, 615, 280, 1, false);
		left = new LightAtIntersection(parent, 330, 380, 1, false);
		bothRedDelay = 1000;
		greenArrowDelay = 3000;
		yellowDelay = 2000;
		greenDelay = 5000;
		nextChange = 1000;
		withArrowIsActive = false;
		arrowIsOn = true;
	}
	
	public void updateShownLight()
	{
		if (parent.millis() > nextChange)
		{
			goToNextState();
			if (withArrowIsActive == false && left.getColor() == 1)
				nextChange += bothRedDelay;
			else if (top.getStateOfArrow() == true)
			{
				nextChange += greenArrowDelay;
			}
			else if (withArrowIsActive == true && top.getColor() == 1)
				nextChange += bothRedDelay;
			else if (withArrowIsActive == false && left.getColor() == 2)
				nextChange += yellowDelay;
			else if (withArrowIsActive == false && left.getColor() == 3)
				nextChange += greenDelay;
			else if (withArrowIsActive == true && top.getColor() == 2)
				nextChange += yellowDelay;
			else if (withArrowIsActive == true && top.getColor() == 3)
				nextChange += greenDelay;
		}

		
	}
	
	public void goToNextState()
	{
		if (withArrowIsActive == false && left.getColor() == 2 || left.getColor() == 3)
		{
			left.changeColor();
			right.changeColor();
		}
		else if (withArrowIsActive == false && left.getColor() == 1)
		{
			withArrowIsActive = true;
			top.changeStateOfArrow();
			bottom.changeStateOfArrow();
		}
		else if (top.getColor() == 1 && top.getStateOfArrow())
		{
			top.changeStateOfArrow();
			bottom.changeStateOfArrow();
			top.changeColor();
			bottom.changeColor();
		}
		else if (withArrowIsActive == true && top.getColor() == 2 || top.getColor() == 3)
		{
			top.changeColor();
			bottom.changeColor();
		}
		else if (withArrowIsActive == true && top.getColor() == 1)
		{
			left.changeColor();
			right.changeColor();
			withArrowIsActive = false;
		}
	}
	
	public void drawLights()
	{
		left.drawSelf();
		top.drawSelf();
		right.drawSelf();
		bottom.drawSelf();
	}
}
