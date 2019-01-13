package p9_6;

import java.awt.Rectangle;

import p9_5.Measurer;

public class RectanglePerimeterMeasurer implements Measurer<Rectangle>
{
	public double measure(Rectangle rect)
	{
		return (2 * (rect.getHeight() + rect.getWidth()));
	}
}
