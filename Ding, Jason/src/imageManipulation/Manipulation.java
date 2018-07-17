package imageManipulation;
import processing.core.PApplet;
import processing.core.PImage;
public class Manipulation extends PApplet
{
	PImage picture;
	
	public static void main(String[] args) 
	{
	
		PApplet.main("imageManipulation.Manipulation");
	}
	
	public void settings()
	{
		size(1000,750);
	}
	public void setup()
	{
		picture = loadImage("pics/wedizzy.jpg");
	}
	public void draw()
	{
        image(picture, 0, 0);
	}
	public void mouseClicked()
	{
		greyscale();
//		inverse();
//		mirror();
	}
	public void greyscale()
	{
        for(int x = 0; x < picture.width; x++)
        {
        		for(int y = 0; y < picture.height; y++)
        		{
                    int pixel = picture.get(x, y);
                    float red = red(pixel);
                    float green = green(pixel);
                    float blue = blue(pixel);
                    float average = (blue + green + red) / 3;
                    int newPixel = color(average);
                    picture.set(x, y, newPixel);

        		}
        }
	}
	public void inverse()
	{
		 for(int x = 0; x < picture.width; x++)
		 {
			 for(int y = 0; y < picture.height; y++)
			 {
				 int pixel = picture.get(x, y);
                 float red = red(pixel);
                 float green = green(pixel);
                 float blue = blue(pixel);
                 float inverseRed = 255 - red;
                 float inverseBlue = 255 - blue;
                 float inverseGreen = 255 - green;
                 int newPixel = color(inverseRed, inverseBlue, inverseGreen);
                 picture.set(x, y, newPixel);
			 }
		 }
	}
	
	public void mirror()
	{
		for(int x = 0; x < picture.width / 2; x++)
		{
			for(int y = 0; y < picture.height; y++)
			{
				int otherX = picture.width - x - 1;
                int pixel = picture.get(x, y);
               
				picture.set( otherX, y,  pixel);
			}
		}
	}
}

