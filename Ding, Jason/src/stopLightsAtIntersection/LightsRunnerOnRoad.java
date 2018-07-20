package stopLightsAtIntersection;

import processing.core.PApplet;

public class LightsRunnerOnRoad extends PApplet
{
	private LightAtIntersection stoplight;
	public static void main(String[] args) 
	{
		PApplet.main("stopLightsAtIntersection.LightsRunnerOnRoad");

	}
	
	public void settings()
	{
		size(1000, 800);
	}
	
	public void setup()
	{
		stoplight = new LightAtIntersection(this, 50, 50, 3, false);
	}
	
	public void draw()
	{
		background(150, 190, 255);
		fill(0);
		rect(400, 0, 200, 800);
		stoplight.drawSelf();
	}

}
