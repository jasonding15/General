package stopLight;

import processing.core.PApplet;

public class TrafficLightController //8 seconds red, 2 yellow, 7 green
{
	private TrafficLight one, two;
	private PApplet parent;
	private int yellowDelay, greenDelay, nextChange, bothRedDelay;
	private boolean oneActive;
	
	public TrafficLightController(PApplet par)
	{
		
		parent = par;
		one = new TrafficLight(parent, 200, 100, 1);
		two = new TrafficLight(parent, 600, 100, 3);
		bothRedDelay = 1000;
		yellowDelay = 2000;
		greenDelay = 5000;
		nextChange = 1000;
		oneActive = false;
	}
	
	public void updateShownLight()
	{
		if (parent.millis() > nextChange)
		{
			goToNextState();
			if (oneActive == false && two.getColor() == 1)
				nextChange += bothRedDelay;
			else if (oneActive == true && one.getColor() == 1)
				nextChange += bothRedDelay;
			else if (oneActive == false && two.getColor() == 2)
				nextChange += yellowDelay;
			else if (oneActive == false && two.getColor() == 3)
				nextChange += greenDelay;
			else if (oneActive == true && one.getColor() == 2)
				nextChange += yellowDelay;
			else if (oneActive == true && one.getColor() == 3)
				nextChange += greenDelay;
		}

		
	}
	
	public void goToNextState()
	{
		if (oneActive == false && two.getColor() == 2 || two.getColor() == 3)
			two.changeColor();
		else if (oneActive == false && two.getColor() == 1)
		{
			one.changeColor();
			oneActive = true;
		}
		else if (oneActive == true && one.getColor() == 2 || one.getColor() == 3)
			one.changeColor();
		else if (oneActive == true && one.getColor() == 1)
		{
			two.changeColor();
			oneActive = false;
		}
	}
	
	public void drawLights()
	{
		one.drawSelf();
		two.drawSelf();
	}
}
