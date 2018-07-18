package flashySquare;
import processing.core.PApplet;
public class FlashySquareRunner extends PApplet
{
	private FlashySquare topLeft, topRight, bottomLeft, bottomRight;
	
	public static void main(String[] args) 
	{
		PApplet.main("flashySquare.FlashySquareRunner");
	}
	
	public void settings()
	{
		size(500,500);
	}
	
	public void setup()
	{
		topLeft = new FlashySquare(this, 100, 100, 1000);
		topRight = new FlashySquare (this, 300, 100, 2000);
		bottomLeft = new FlashySquare (this, 100, 300, 3000);
		bottomRight = new FlashySquare (this, 300, 300, 4000);
	}
	
	public void draw()
	{
		background(190, 221, 216);
		topLeft.updateVisibility();
		topLeft.drawSelf();
		
		topRight.updateVisibility();
		topRight.drawSelf();
		
		bottomLeft.updateVisibility();
		bottomLeft.drawSelf();
		
		bottomRight.updateVisibility();
		bottomRight.drawSelf();
	}
}

