package p9_6;

import java.awt.Rectangle;

import p9_5.Measurer;

public class DSTester 
{

	public static void main(String[] args) 
	{
		Measurer rectmeasurer = new RectanglePerimeterMeasurer();
		Rectangle rect = new Rectangle(10, 4);
		System.out.println(rectmeasurer.measure(rect));
		
		DataSet ds = new DataSet(rectmeasurer);
		ds.add(rect);
		rect = new Rectangle(5,3);
		ds.add(rect);
		System.out.println(ds.getMaximum());
	}

}
