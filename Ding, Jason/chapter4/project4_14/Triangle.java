package project4_14;

import java.awt.geom.Point2D;

public class Triangle 
{
	private Point2D.Double p1, p2, p3;
	
	/**
	 * A triangle with three sides and three vertices.
	 * Each vertex has a location in the coordinate plane and an angle.
	 * Each side has a length.
	 * The triangle has a perimeter and an area.
	 * @param p1 vertex number 1
	 * @param p2 vertex number 2
	 * @param p3 vertex number 3
	 */
	public Triangle(Point2D.Double p1, Point2D.Double p2, Point2D.Double p3)
	{
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}
	
	/**
	 * Calculates the length of a certain side of the triangle.
	 * @param v the vertex opposite the side to be calculated (1, 2, or 3)
	 * @return the length of the side opposite the vertex
	 */
	public double getSideLength(int v)
	{
		if (v == 1)
			return p2.distance(p3);
		else if (v == 2)
			return p3.distance(p1);
		else
			return p1.distance(p2);
	}
	
	/**
	 * Calculates the angle of a certain vertex of the triangle.
	 * @param v one vertex out of the three (1, 2, or 3)
	 * @return the angle of the vertex
	 */
	public double getAngle(int v)
	{
		int side1 = -1;
		int side2 = -1;
		if (v == 1)
		{
			side1 = 2;
			side2 = 3;
		}
		
		else if (v == 2)
		{
			side1 = 1;
			side2 = 3;
		}
		
		else 
		{
			side1 = 2;
			side2 = 1;
		}
		
		double length1 = getSideLength(side1);
		double length2 = getSideLength(side2);
		return Math.acos((Math.pow(length1, 2) + Math.pow(length2, 2) - Math.pow(getSideLength(v), 2))/ (2 * length1 * length2));
	}
	
	/**
	 * Calculates the area of the triangle.
	 * @return the area of the triangle
	 */
	public double getArea()
	{
		double p = getPerimeter() / 2.0;
		return Math.sqrt(p * (p - getSideLength(1)) * (p - getSideLength(2)) * (p - getSideLength(3)));
	}
	
	/**
	 * Calculates the perimeter of the triangle.
	 * @return the perimeter of the triangle
	 */
	public double getPerimeter()
	{
		return getSideLength(1) + getSideLength(2) + getSideLength(3);
	}
	
}