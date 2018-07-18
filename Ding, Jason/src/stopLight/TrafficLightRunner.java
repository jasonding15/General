package stopLight;
import processing.core.PApplet;
public class TrafficLightRunner extends PApplet
{
	private TrafficLight leftStopLight, rightStopLight;
	public static void main(String[] args) 
	{
		PApplet.main("stopLight.TrafficLightRunner");
	}
	
	public void settings()
	{
		size(1000, 800);
	}
	public void setup()
	{
		leftStopLight = new TrafficLight(this, 200, 100, 1);
		rightStopLight = new TrafficLight(this, 600, 100, 1);
	}
	public void draw()
	{
		background(138, 234, 230);
		leftStopLight.drawSelf();
		rightStopLight.drawSelf();
	}
	
	public void mousePressed()
	{
		leftStopLight.changeColor();
		rightStopLight.changeColor();
	}
}

