package artAndProcessing;
import processing.core.PApplet;
public class Artwork extends PApplet
{
	float cloudX, cloudY, speedX, speedY;

	public static void main(String[] args) 
	{
		PApplet.main("artAndProcessing.Artwork");
	}
	
	public void settings()
	{
		size(1200,900);
	}
	
	public void setup()
	{
		cloudX = 300.0f; //cloud setup
		cloudY = 150.0f;
		
		speedX = 1.2f;
		speedY = 0f;
	}
	
	public void draw()
	{
		
		background(5, 223, 252);
		
		drawCloud(cloudX, cloudY); //cloud calling
		updatePosition();
		
		scale (2);
		
		fill(31, 196, 64); //grass line
		ellipse(800, 600, 2000, 550);
		
		fill(155, 110, 65); //base of windmill
		rect(200, 190, 130, 220);
		
		fill(124, 59, 41); //top of windmill
		arc(265, 190, 130, 145, radians(180), radians(360));
		
		fill(71, 61, 59); //windmill fans
		triangle(265, 165, 335, 53, 380, 95);
		triangle(265, 165, 195, 277, 150, 235);
		triangle(265, 165, 385, 240, 345, 278);
		triangle(265, 165, 199, 58, 151, 97);
		
		fill(255, 255, 255); //knob at center of fans
		ellipse( 265, 165, 15, 15);
		
		
		fill(89, 59, 46); //door
		rect(263, 360, 30, 50);
		
		fill(255, 255, 255);
		ellipse( 287, 386, 6, 6); //doorknob

		
		fill(204, 193, 157); //window on left
		beginShape();
		vertex(225, 245);
		vertex(260, 245);
		vertex(260, 280);
		vertex(225, 280);
		endShape(CLOSE);
		
		rect( 280, 245, 35, 35); //window on right
		
		fill(255,255,255); //window lines on left
		strokeWeight(2);
		line(243, 246, 243, 280);
		line( 226, 263, 260, 263);
		
		fill(255,255,255); //window lines on right
		strokeWeight(2);
		line(298, 245, 298, 280);
		line( 280, 263, 315, 263);
		
		resetMatrix();
		
		fill(255, 220, 94); //sun
		ellipse(1175, 50, 300, 300);
		
		
	
		
	}
	
	public void mousePressed()
	{
		System.out.println(mouseX + " " + mouseY);
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
		if (cloudX + 280 >= 1600)
			speedX = -speedX;
		if (cloudX - 105 <= -500)
			speedX = -speedX;
		
		cloudX += speedX;
		
		if (cloudY -55 <= 0)
			speedY = -speedY;
		if (cloudY + 175 >= 900)
			speedY = -speedY;
		

		cloudY += speedY;

	}
}

