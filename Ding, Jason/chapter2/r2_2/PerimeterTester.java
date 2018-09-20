package r2_2;

import java.awt.Rectangle;

public class PerimeterTester //P2.2
{

	public static void main(String[] args) 
	{
		//calculate perimeter of rectangle
		Rectangle box = new Rectangle(10, 10, 20, 20);
		System.out.println("The expected result is 80");
		System.out.println("The perimeter of the rectangle is " + getPerimeter(box) + ".");
		System.out.println();
		box = new Rectangle(0, 0, 34, 12);
		System.out.println("The expected result is 92.");
		System.out.println("The perimeter of the rectangle is " + getPerimeter(box) + ".");
	}
	
	public static double getPerimeter(Rectangle rect)
	{
		return 2 * rect.getHeight() + 2 * rect.getWidth();
	}

}
