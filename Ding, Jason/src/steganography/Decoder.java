package steganography;
import processing.core.PApplet;
import processing.core.PImage;
public class Decoder extends PApplet
{
	PImage encodedPicture;
	public static void main(String[] args) 
	{
		PApplet.main("steganography.Decoder");
	}
	
	public void settings()
	{
		size(1500,1200);
	}
	
	public void setup()
	{
		encodedPicture = loadImage("pics/encoded.png");
	}
	
	public void draw()
	{
       image(encodedPicture, 0, 0);
	}
	
	public void mouseClicked()
	{
		decode();
	}
	
	public void decode()
	{
		 for(int x = 0; x < encodedPicture.width; x++)
		 {
			 for(int y = 0; y < encodedPicture.height; y++)
			 {
				 int pixel = encodedPicture.get(x, y);
				 float red = red(pixel);
				 float newRed;

                 if (red % 2 == 1)
                	 	newRed = 255;
               
                 else
                	 	newRed = 0;
                 
                 int newPixel = color(newRed);
                 encodedPicture.set(x, y, newPixel);
			 }
		 }
	}
	
	
	
}


