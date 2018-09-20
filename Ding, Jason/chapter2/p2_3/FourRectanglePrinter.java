package p2_3;

import java.awt.Rectangle;

public class FourRectanglePrinter //P2.3
{

	public static void main(String[] args) 
	{
		//must perform translations in increasing index order
		Rectangle box = new Rectangle(0, 5, 10, 40);
		System.out.println(box);
		translateRectangle(box, 1);
		System.out.println(box);
		translateRectangle(box, 2);
		System.out.println(box);
		translateRectangle(box, 3);
		System.out.println(box);

	}
	
	public static void translateRectangle(Rectangle rect, int index)
	{
		
		int XCoordinate = (int) rect.getX();
		int YCoordinate = (int) rect.getY();
		int width = (int) rect.getWidth();
		int height = (int) rect.getHeight();
		
		if(index == 1)
		{
			rect.setLocation(XCoordinate + width, YCoordinate);
		}
		
		else if(index == 2)
		{
			rect.setLocation(XCoordinate, YCoordinate + height);
		}
		
		else
		{
			rect.setLocation(XCoordinate - width, YCoordinate);
		}
	}

}
