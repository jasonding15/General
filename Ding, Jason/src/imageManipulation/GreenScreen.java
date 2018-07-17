package imageManipulation;
import processing.core.PApplet;
import processing.core.PImage;
public class GreenScreen extends PApplet
{
    PImage picture, background;

	public static void main(String[] args) 
	{
		PApplet.main("imageManipulation.GreenScreen");
	}
	
	public void settings()
	{
		size(1000,750);
	}
	
	public void setup()
	{
        picture = loadImage("pics/pengy.jpg");
        background = loadImage("pics/asteroid.jpg");
	}
	
	public void draw()
	{
		image(background, 0, 0);
        image(picture, 0, 0);
	}
	
	public void mouseClicked()
	{
		greenScreen();
	}
	public void greenScreen()
	{
		 for(int x = 0; x < picture.width; x++)
		 {
			 for(int y = 0; y < picture.height; y++)
			 {
				 //get penguin pixel
				 // if pixel is close to white
				 //replace it with the corresponding backgorund pixel
				 
				int pengyPixel = picture.get(x, y);
				float r = red(pengyPixel);
              	float g = green(pengyPixel);
              	float b = blue(pengyPixel);
              	
              	int asteroidPixel = background.get(x, y);
              	float br = red(asteroidPixel);
              	float bg = green(asteroidPixel);
              	float bb = green(asteroidPixel);
              	
              	if (dist(255, 255, 255, r, g, b) <= 50)
              	{
              		int newPixel = color(br, bb, bg);
              		picture.set(x, y, newPixel);
              	}


              		
              		
			 }
		 }
	}
	
}

