package movingCharacter;
import processing.core.PApplet;
public class CloudsThatMove extends PApplet
{
	float cloud1X, cloud1Y;
	float cloud2X, cloud2Y;
	float cloud3X, cloud3Y;
	float cloud4X, cloud4Y;
	float cloud5X, cloud5Y;
	float cloud6X, cloud6Y;
	float cloud7X, cloud7Y;


	public static void main(String[] args) 
	{
		PApplet.main("movingCharacter.CloudsThatMove");
	}
	
	public void settings()
	{
		size(1200,900);
	}
	
	public void setup()
	{
		cloud1X = 300.0f;
		cloud1Y = 200.0f;
		
		
		cloud2X = 900.0f;
		cloud2Y = 700.0f;
		
		cloud3X = 250.0f;
		cloud3Y = 750.0f;
		
		cloud4X = 900.0f;
		cloud4Y = 50.0f;
		
		cloud5X = 100.0f;
		cloud5Y = 0.0f;
		
		cloud6X = 1300;
		cloud6Y = 100;
		
		cloud7X = 0;
		cloud7Y = 1200;
	}
	
	public void draw()
	{
		background(109, 228, 242);
		
		
		
		cloud1X += 0.7;
		cloud1Y += 0.4f;
		
		cloud2X -= 0.3f;
		cloud2Y -= 0.1f;
		
		cloud3X += 0.6f;
		cloud3Y -= 0.2f;
		
		cloud4X -= 0.7f;
		cloud4Y += 0.2f;
		
		cloud5X += 0.13f;
		cloud5Y += 0.21f;
		
		cloud6X -= 0.9f;
		cloud6Y += 0.6f;
		
		cloud7X += 0.3f;
		cloud7Y -= 0.6f;
		
		drawCloud(cloud1X, cloud1Y);
		drawCloud(cloud2X, cloud2Y);
		drawCloud(cloud3X, cloud3Y);
		drawCloud(cloud4X, cloud4Y);
		drawCloud(cloud5X, cloud5Y);
		drawCloud(cloud6X, cloud6Y);
		drawCloud(cloud7X, cloud7Y);



	}
	
	public void drawCloud(float cloudX, float cloudY)
	{
		noStroke();
		fill(255);
		rect( cloudX, cloudY, 200, 105);
		
		ellipse(cloudX + 20, cloudY + 70, 250, 150);
		ellipse(cloudX + 45, cloudY + 15, 200, 140);
		ellipse(cloudX + 180, cloudY + 90, 200, 130);
		ellipse(cloudX + 180, cloudY + 40, 200, 130);
		ellipse(cloudX + 130, cloudY + 5, 160, 120);
		ellipse(cloudX + 105, cloudY + 100, 200, 150);
	}
	
}

