package project4_14;

import java.awt.geom.Point2D;

public class Triangle 
{
	/**
	 * A triangle with three sides and three vertices.
	 * Each vertex has a location in the coordinate plane and an angle.
	 * Each side has a length.
	 * The triangle has a perimeter and an area.
	 * @param p1 vertex number 1
	 * @param p2 vertex number 2
	 * @param p3 vertex number 3
	 */
	public Triangle( Point2D.Double p1, Point2D.Double p2, Point2D.Double p3 )
	{
		
	}
	
	/**
	 * Calculates the length of a certain side of the triangle.
	 * @param v the vertex opposite the side to be calculated (1, 2, or 3)
	 * @return the length of the side opposite the vertex
	 */
	public double getSideLength( int v )
	{
		return -1.0;
	}
	
	/**
	 * Calculates the angle of a certain vertex of the triangle.
	 * @param v one vertex out of the three (1, 2, or 3)
	 * @return the angle of the vertex
	 */
	public double getAngle( int v )
	{
		return -1.0;
	}
	
	/**
	 * Calculates the area of the triangle.
	 * @return the area of the triangle
	 */
	public double getArea()
	{
		return -1.0;
	}
	
	/**
	 * Calculates the perimeter of the triangle.
	 * @return the perimeter of the triangle
	 */
	public double getPerimeter()
	{
		return -1.0;
	}
}