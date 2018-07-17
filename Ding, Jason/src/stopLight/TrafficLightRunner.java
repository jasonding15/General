package stopLight;
import processing.core.PApplet;
public class TrafficLightRunner extends PApplet
{
	private TrafficLight stopLight;
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
		stopLight = new TrafficLight(this, 200, 100, 3);
	}
	public void draw()
	{
		background(255);
		stopLight.drawSelf();
	}
}

