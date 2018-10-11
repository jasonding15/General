package p5_15;

import java.awt.geom.Point2D;
/**
 * represents a line that can have calculations performed on it
 * @author jding, lxie
 */
public class Line 
{
	private double slope, yIntercept;
	/**
	 * Constructs a line that passes through the specified point with the specified slope
	 * @param point point that line passes through
	 * @param slope slope of line
	 */
	public Line(Point2D.Double point, double slope )
	{
		this.slope = slope;
		yIntercept = getYintercept(point, slope);
	}
	
	/**
	 * constructs a line that passes through the two specified points
	 * @param p1 first point that line passes through
	 * @param p2 second point that line passes through
	 */
	public Line(Point2D.Double p1, Point2D.Double p2)
	{
		double yDifference = p2.getY() - p1.getY();
		double xDifference = p2.getX() - p1.getX();
		slope = yDifference / xDifference;
		yIntercept = getYintercept(p1, slope);
	}
	
	/**
	 * constructs a line with the given equation in slope-intercept form
	 * @param equation equation of line in "y = mx + b"
	 */
	public Line(String equation)
	{
		
	}
	
	/**
	 * constructs a vertical line with the given equation
	 * @param equation equation in "x = a"
	 * @param isVertical if is vertical line
	 */
	public Line(String equation, boolean isVertical)
	{
		
	}
		
	/**
	 * checks if another line intersects the original line
	 * @param other line to be checked against
	 * @return whether lines intersect
	 */
	public boolean intersects(Line other)
	{
		// other.slope
	}
	
	/**
	 * checks if another line is identical to the original line
	 * @param other line to be checked against
	 * @return whether lines are identical
	 */
	public boolean equals(Line other)
	{
		
	}
	
	/**
	 * checks if another line is parallel to the original line
	 * @param other line to be checked against
	 * @return whether lines are parallel
	 */
	public boolean isParallel(Line other)
	{
		
	}
	
	private double getYintercept(Point2D.Double point, double slope)
	{
		return point.getY() - point.getX() * slope;
	}
	
}
