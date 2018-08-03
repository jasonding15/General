package stopLightsAtIntersection;

import processing.core.PApplet;

public class LightsRunnerOnRoad extends PApplet
{
	private IntersectionLightsController theStopLights; //topStopLight, bottomStoplight, leftStopLight, rightStopLight;
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
		theStopLights = new IntersectionLightsController(this);
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
		fill(255); //white lines for lanes that go straight horizontally;
		rect(0, 350, 25, 4);
		rect(50, 350, 25, 4);
		rect(100, 350, 25, 4);
		rect(150, 350, 25, 4);
		rect(200, 350, 25, 4);
		rect(250, 350, 25, 4);
		rect(300, 350, 25, 4);
		rect(350, 350, 25, 4);
		rect(600, 350, 25, 4);
		rect(650, 350, 25, 4);
		rect(700, 350, 25, 4);
		rect(750, 350, 25, 4);
		rect(800, 350, 25, 4);
		rect(850, 350, 25, 4);
		rect(900, 350, 25, 4);
		rect(950, 350, 25, 4);
		rect(1000, 350, 25, 4);
		rect(25, 450, 25, 4);
		rect(75, 450, 25, 4);
		rect(125, 450, 25, 4);
		rect(175, 450, 25, 4);
		rect(225, 450, 25, 4);
		rect(275, 450, 25, 4);
		rect(325, 450, 25, 4);
		rect(375, 450, 25, 4);
		rect(600, 450, 25, 4);
		rect(650, 450, 25, 4);
		rect(700, 450, 25, 4);
		rect(750, 450, 25, 4);
		rect(800, 450, 25, 4);
		rect(850, 450, 25, 4);
		rect(900, 450, 25, 4);
		rect(950, 450, 25, 4);
























//		rect(400, 350, )

		theStopLights.drawLights();
		theStopLights.updateShownLight();
	}
	
	public void mousePressed()
	{
		System.out.println(mouseX + " " + mouseY);
	}

}
