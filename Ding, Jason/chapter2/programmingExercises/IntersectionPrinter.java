package programmingExercises;

import java.awt.Rectangle;

public class IntersectionPrinter //P2.4
{

	public static void main(String[] args) 
	{
		Rectangle box1 = new Rectangle(0, 0, 20, 20);
		Rectangle box2 = new Rectangle(19, 19, 15, 15);
		System.out.println("The first rectangle: " + box1);
		System.out.println("The second rectangle: " + box2);
		Rectangle box3 = box1.intersection(box2);
		System.out.println("The rectangle created by the previous rectangles' intersection: " + box3);
		
		if(box3.getHeight() <= 0 || box3.getWidth() <= 0)
			System.out.println("The rectangles do not intersect.");
	}

}
