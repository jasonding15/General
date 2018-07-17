package steganography;
import processing.core.PApplet;
import processing.core.PImage;
public class Encoder extends PApplet
{
	PImage okSign, jBieb;
	public static void main(String[] args) 
	{
		PApplet.main("steganography.Encoder");
	}
	
	public void settings()
	{
		size(1500,1300);
	}
	public void setup()
	{
	okSign = loadImage("pics/open-umbrella-outline_318-32644.jpg");
	jBieb = loadImage("pics/justin-bieber_24.jpg");

	}
	public void draw()
	{
//		image(okSign, 0, 0);
		image(jBieb, 0, 0);

	}
	
	public void mousePressed()
	{
		encode();
		jBieb.save("pics/encoded.png");
	}
	
	public void encode()
	{
		for(int x = 0; x < okSign.width; x++)
		 {
			 for(int y = 0; y < okSign.height; y++)
			 {
				 
				 int colorPixel = jBieb.get(x, y);
				 float fgRed = red(colorPixel);
				 float green = green(colorPixel);
				 float blue = blue(colorPixel);
				 
				 int bwPixel = okSign.get(x, y);
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
                 jBieb.set(x, y, newPixel);

			 }
		 }
	}
}

