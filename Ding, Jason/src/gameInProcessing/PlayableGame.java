package gameInProcessing;
import processing.core.PApplet;
public class PlayableGame extends PApplet
{
	float circleX, circleY, speedX, speedY, enemyX, enemyY, speedEX, speedEY;
	boolean upPressed, downPressed, leftPressed, rightPressed;
	int lives, time;
	
	public static void main(String[] args) 
	{
		PApplet.main("gameInProcessing.PlayableGame");
	}
	public void settings()
	{
		size(1200,900);
	}
	public void setup()
	{
		circleX = 300;
		circleY = 200;
		speedX = 0;
		speedY = 0;
		
		enemyX = 1100;
		enemyY = 800;
		speedEX = 6;
		speedEY = 6;
		
		lives = 3;
	}	
	public void draw()
	{
		background (96, 96, 96);
		
		fill(91, 216, 176);
		drawCircle (circleX, circleY);
		
		fill(150, 0, 0);
		drawCircle (enemyX, enemyY);
		
		enemyBounceOffWalls();
		
		bounceOffWalls();
		
		movement();
		
		handleCollission();
		
		livesCounter();	
		
		moveCharacter();
		
		moveEnemy();
		
		
		if (lives > 0)
			timeElapsed();
		else 
			handleEndGame();

	}
	
	public void moveCharacter()
	{
		circleY += speedY;
		circleX += speedX;
	}
	public void moveEnemy()
	{
		enemyX += speedEX;
		enemyY += speedEY;
	}

	public void keyPressed()
	{
		if (key == CODED)
		{
			if (keyCode == UP)
				upPressed = true;
			else if (keyCode == DOWN)
				downPressed = true;
			else if (keyCode == LEFT)
				leftPressed = true;
			else if (keyCode == RIGHT)
				rightPressed = true;
		}
	}
	public void keyReleased()
	{
		if (keyCode == UP)
		{
		upPressed = false;
		}
		else if (keyCode == DOWN)
		{
			downPressed = false;
		}
		else if (keyCode == LEFT)
		{
			leftPressed = false;
		}
		else if (keyCode == RIGHT)
		{
			rightPressed = false;
		}
		
	}
	public void drawCircle(float circleX, float circleY)
	{
		ellipse (circleX, circleY, 150, 150);
	}
	public void enemyBounceOffWalls()
	{
		if (enemyX + 75 >= 1200)
			speedEX = -speedEX;
		if (enemyX - 75 <= 0)
			speedEX = -speedEX;
		
		if (enemyY -75 <= 0)
			speedEY = -speedEY;
		if (enemyY + 75 >= 900)
			speedEY = -speedEY;
	}	
	public void bounceOffWalls()
	{
		if (circleX + 75 >= 1200)
			speedX = -speedX;
		if (circleX - 75 <= 0)
			speedX = -speedX;
		
		if (circleY -75 <= 0)
			speedY = -speedY;
		if (circleY + 75 >= 900)
			speedY = -speedY;
	}
	public void movement()
	{	
		if (upPressed && ! downPressed)
			speedY = -6;
		else if (downPressed && ! upPressed)
			speedY = 6;
		else if (rightPressed && ! leftPressed)
			speedX = 6;
		else if (leftPressed && ! rightPressed)
			speedX = -6;
	}
	public void handleCollission()
	{
		float distance= dist (circleX,circleY, enemyX, enemyY);
		if (distance <= 150)
		{
			circleX = 300;
			circleY = 200;
			
			enemyX = 1100;
			enemyY = 700;
			
			speedX = 0;
			speedY = 0;
			
			lives -= 1;
		}
	}
	public void livesCounter()
	{
		textSize(32);
		text("Lives: " + lives, 30, 60);	
	}
	public void timeElapsed()
	{	  
		time = millis() / 1000;
		noStroke();
		fill(255);
		text(time, 30, 100);
	}
	public void handleEndGame()
	{
		speedEX = 0;
		speedEY = 0;
		fill(109, 58, 58);
		rect(0,0,2000,2000);
		fill(247, 222, 222);
		text("GAME OVER",500,450);
		text("Final Score: " + time, 480, 550);
	}

}
