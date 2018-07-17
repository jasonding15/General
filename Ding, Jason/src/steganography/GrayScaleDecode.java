package steganography;
import processing.core.PApplet;
import processing.core.PImage;
public class GrayScaleDecode extends PApplet
{
	PImage disney;
	public static void main(String[] args) 
	{
		PApplet.main("steganography.GrayScaleDecode");
	}
	
	public void settings()
	{
		size(1600,1200);
	}
	
	public void setup()
	{
		disney = loadImage("pics/grayscale.png");
		
//		int ok = disney.get(20,19);
//		int pixel =  decodeOnePixel(ok);
//		System.out.println(red(pixel));
//		System.out.println(green(pixel));
//		System.out.println(blue(pixel));
//		System.out.println(red(ok));
//		System.out.println(green(ok));
//		System.out.println(blue(ok));
	}
	
	public void draw()
	{
       image(disney, 0, 0);
	}
	
	public void mouseClicked()
	{
		decodeGrayscale();
	}
	
	public void decodeGrayscale()
	{
		 for(int x = 0; x < disney.width; x++)
		 {
			 for(int y = 0; y < disney.height; y++)
			 {
				 int pixel = disney.get(x, y);
				 
                 int newPixel = decodeOnePixel(pixel);
                 disney.set(x, y, newPixel);
			 }
		 }
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
	
	
}


