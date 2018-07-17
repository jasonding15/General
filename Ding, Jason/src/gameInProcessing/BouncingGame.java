package gameInProcessing;
import processing.core.PApplet;
public class BouncingGame extends PApplet
{
	float circleX1, circleY1, circleX2, circleY2, speedX1, speedY1, speedX2, speedY2;
	
	
	public static void main(String[] args) 
	{
		PApplet.main("gameInProcessing.BouncingGame");
	}
	
	public void settings()
	{
		size(1200,800);
	}
	public void setup()
	{
		circleX1 = 300;
		circleY1 = 200;
		
		speedX1 = 10;
		speedY1 = 8;
		
		circleX2 = 1100;
		circleY2 = 700;
		
		speedX2 = 7;
		speedY2 = 9;
	}
	public void draw()
	{
		background (96, 96, 96);
		drawCircle (circleX1, circleY1);
		drawCircle (circleX2, circleY2);
		updatePosition();
		resetPosition();
//		deflect();
	}
	public void drawCircle(float circleX, float circleY)
	{
		fill(91, 216, 176);
		ellipse (circleX, circleY, 150, 150);
	}
	
	public void updatePosition()
	{
		if (circleX1 + 75 >= 1200)
			speedX1 = -speedX1;
		if (circleX1 - 75 <= 0)
			speedX1 = -speedX1;
		
		circleX1 += speedX1;
		
		if (circleY1 -75 <= 0)
			speedY1 = -speedY1;
		if (circleY1 + 75 >= 800)
			speedY1 = -speedY1;
		

		circleY1 += speedY1;
		
		if (circleX2 + 75 >= 1200)
			speedX2 = -speedX2;
		if (circleX2 - 75 <= 0)
			speedX2 = -speedX2;
		
		circleX2 += speedX2;
		
		if (circleY2 -75 <= 0)
			speedY2 = -speedY2;
		if (circleY2 + 75 >= 800)
			speedY2 = -speedY2;
		

		circleY2 += speedY2;

	}
	
//	public void handlePossibleCollission()
		
	
	public void resetPosition()
	{
		float distance= dist (circleX1,circleY1, circleX2, circleY2);
		if (distance <= 150)
		{
		
			circleX1 = 300;
			circleY1 = 200;
			
			circleX2 = 1100;
			circleY2 = 700;
				
//			speedX1 = -speedX1;
//			speedX2 = -speedX2;
//			speedY1 = -speedY1;
//			speedY1 = -speedY2;
		}
	}
	
	
			
}

