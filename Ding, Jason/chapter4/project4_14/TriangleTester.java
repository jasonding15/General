package project4_14;

import java.awt.geom.Point2D;

public class TriangleTester 
{

	public static void main(String[] args) 
	{
		Point2D.Double p1 = new Point2D.Double(10,10);
		Point2D.Double p2 = new Point2D.Double(6,7);
		Point2D.Double p3 = new Point2D.Double(18,7);

		Triangle tri = new Triangle(p1, p2, p3);
		System.out.println(tri.getArea());
		System.out.println(tri.getSideLength(1));
		System.out.println(tri.getSideLength(2));
		System.out.println(tri.getSideLength(3));
		System.out.println(tri.getPerimeter());
		System.out.println(tri.getAngle(1));
		System.out.println(tri.getAngle(2));
		System.out.println(tri.getAngle(3));
	}

}
