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
		stoplight = new LightAtIntersection(this, 50, 50, 1, true);
	}
	
	public void draw()
	{
		background(150, 190, 255);

		fill(0);
		rect(400, 0, 200, 800); //road
		rect(0, 300, 1000, 200); //road
		fill(255, 250, 0); // yellow lines
		rect(0, 394, 400, 6);
		rect(0, 401, 400, 6);
		rect(600, 394, 400, 6);
		rect(600, 401, 400, 6);
		rect(494, 0, 6, 300);
		rect(501, 0, 6, 300);
		rect(494, 500, 6, 300);
		rect(501, 500, 6, 300);

		stoplight.drawSelf();
	}

}
