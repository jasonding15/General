package movingCharacter;
import processing.core.PApplet;
public class BouncingCloud extends PApplet
{
	float cloudX, cloudY;


	float speedX, speedY;

	public static void main(String[] args) 
	{
		PApplet.main("movingCharacter.BouncingCloud");
	}
	
	public void settings()
	{
		size(1200,900);
	}
	
	public void setup()
	{
		cloudX = 300.0f;
		cloudY = 200.0f;
		
		speedX = 8.7f;
		speedY = 4.6f;
	}
	
	public void draw()
	{
		background(109, 228, 242);
		
		drawCloud(cloudX, cloudY);
		
		updatePosition();



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
	
	public void updatePosition()
	{
		if (cloudX + 280 >= 1200)
			speedX = -speedX;
		if (cloudX - 105 <= 0)
			speedX = -speedX;
		
		cloudX += speedX;
		
		if (cloudY -55 <= 0)
			speedY = -speedY;
		if (cloudY + 175 >= 900)
			speedY = -speedY;
		

		cloudY += speedY;

	}
	
}

