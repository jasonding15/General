package stopLight;
import processing.core.PApplet;
public class TrafficLightRunner extends PApplet
{
	private TrafficLightController twoStopLights;
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
		twoStopLights = new TrafficLightController(this);
	}
	public void draw()
	{
		background(138, 234, 230);
		twoStopLights.drawLights();
		twoStopLights.updateShownLight();
	}
	
	public void mousePressed()
	{
//		leftStopLight.changeColor();
//		rightStopLight.changeColor();
//		twoStopLights.goToNextState();
	}
}

