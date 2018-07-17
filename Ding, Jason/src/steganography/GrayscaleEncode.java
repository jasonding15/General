package steganography;
import processing.core.PApplet;
import processing.core.PImage;
public class GrayscaleEncode extends PApplet
{
	PImage rose, puppy;
	public static void main(String[] args) 
	{
		PApplet.main("steganography.GrayScaleEncode");
	}
	
	public void settings()
	{
		size(800,600);
	}
	
	public void setup()
	{
		rose = loadImage("pics/rose.jpg");
		puppy = loadImage("pics/puppy.jpg");
		
	}
	
	public void draw()
	{
//       image(puppy, 0, 0);
	}
	
	public void mouseClicked()
	{
		
	}
	
	public int decodeOnePixel(int pixel)
	{
		float red = red(pixel);
		boolean redEven;
		if (red % 2 == 0)
			redEven = true;
		else
			redEven = false;
		
		float blue = blue(pixel);
		boolean blueEven;
		if (blue % 2 == 0)
			blueEven = true;
		else
			blueEven = false;
		
		float green = green(pixel);
		boolean greenEven;
		if (green % 2 == 0)
			greenEven = true;
		else
			greenEven = false;
		
		if (redEven && greenEven && blueEven)
			return color(0);
		
		if (redEven && greenEven && !blueEven)
			return color(36);
		
		if (redEven && !greenEven && blueEven)
			return color(73);
		
		if (redEven && !greenEven && !blueEven)
			return color(109);
		
		if (!redEven && greenEven && blueEven)
			return color(146);
		
		if (!redEven && greenEven && !blueEven)
			return color(182);
		
		if(!redEven && !greenEven && blueEven)
			return color(219);
			
		return color(255);
	}
	public void encode()
	{
		for(int x = 0; x < rose.width; x++)
		 {
			 for(int y = 0; y < rose.height; y++)
			 {
				 
				 int colorPixel = puppy.get(x, y);
				 float fgRed = red(colorPixel);
				 float green = green(colorPixel);
				 float blue = blue(colorPixel);
				 
				 int bwPixel = puppy.get(x, y);
				 float bwRed = red(bwPixel);
				 
				 float newRed = fgRed;		 
				 
				 if (bwRed < 20)
					{
					 if (fgRed % 2 == 1)
						newRed = fgRed - 1;

					}
				 else
					 {
					 if(fgRed % 2 == 0)
						 newRed = fgRed + 1;
					 }
					 
				
                 int newPixel = color(newRed, green, blue);
                 puppy.set(x, y, newPixel);

			 }
		 }
	}
	
	
	public int encodeOnePixel(int pixelColor, int pixelGray)
	{
		float gRed = red(pixelGray);
		float cRed = red(pixelColor);
		float cGreen = green(pixelColor);
		float cBlue = blue(pixelColor);
		float newRed = cRed;
		float newGreen = cGreen;
		float newBlue = cBlue;
		
		if (gRed < 36)
		{
			if (cRed % 2 == 1)
				newRed = cRed - 1;
			if (cGreen % 2 == 1)
				newGreen = cGreen - 1;
			if (cBlue % 2 == 1)
				newBlue = cBlue - 1;
		}
		
		if (gRed < 73)
		{
			if (cRed % 2 == 1)
				newRed = cRed - 1;
			if (cGreen % 2 == 1)
				newGreen = cGreen - 1;
			if (cBlue % 2 == 0)
				newBlue = cBlue + 1;
		}
		
		if (gRed < 109)
		{
			if (cRed % 2 == 1)
				newRed = cRed - 1;
			if (cGreen % 2 == 0)
				newGreen = cGreen + 1;
			if (cBlue % 2 == 1)
				newBlue = cBlue + 1;
		}
		
		if (gRed < 146)
		{
			if (cRed % 2 == 1)
				newRed = cRed - 1;
			if (cGreen % 2 == 0)
				newGreen = cGreen + 1;
			if (cBlue % 2 == 0)
				newBlue = cBlue + 1;
		}
		
		if (gRed < 182)
		{
			if (cRed % 2 == 0)
				newRed = cRed + 1;
			if (cGreen % 2 == 1)
				newGreen = cGreen - 1;
			if (cBlue % 2 == 1)
				newBlue = cBlue - 1;
		}
		
		if (gRed < 219)
		{
			if (cRed % 2 == 0)
				newRed = cRed + 1;
			if (cGreen % 2 == 1)
				newGreen = cGreen - 1;
			if (cBlue % 2 == 0)
				newBlue = cBlue + 1;
		}
		
		if (gRed <= 255)
		{
			if (cRed % 2 == 0)
				newRed = cRed + 1;
			if (cGreen % 2 == 1)
				newGreen = cGreen - 1;
			if (cBlue % 2 == 1)
				newBlue = cBlue - 1;
		}
		return -1;
			
	}
	
}


