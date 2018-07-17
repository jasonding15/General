package artAndProcessing;
import processing.core.PApplet;
public class ConcentricCircles extends PApplet
{

	public static void main(String[] args) 
	{
		PApplet.main("artAndProcessing.ConcentricCircles");
	}
	
	public void settings()
	{
		size(500,500);
	}
	public void setup()
	{
		
	}
	public void draw()
	{
		int diameter = 400;
		background(255);
		for (int x = 1; x <= 10; x ++)
		{
			fill(random(100), random(100), random(100));
			ellipse(250, 250, diameter, diameter);
			diameter -= 50;
			
		}
	}
}

