package p5_15;

import java.awt.geom.Point2D;
/**
 * represents a line that can have calculations performed on it
 * @author jding, lxie
 */
public class Line 
{
	private double slope, yIntercept;
	private double xIntercept; // irrelevant if line is non-vertical
	/**
	 * Constructs a line that passes through the specified point with the specified slope
	 * @param point point that line passes through
	 * @param slope slope of line
	 */
	public Line(Point2D.Double point, double slope )
	{
		yIntercept = getYintercept(point, slope);
		this.slope = slope;	
		xIntercept = Double.NaN;
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
		int m = (int) (yDifference / xDifference * 100);
		this.slope = (double) (m/100.0);
		yIntercept = getYintercept(p1, slope);
		xIntercept = Double.NaN;
	}
	
	/**
	 * constructs a line with the given equation in slope-intercept form
	 * @param equation equation of line in "y = mx + b"
	 */
	public Line(String equation)
	{
		parseString(equation);
	}
	
	/**
	 * constructs a vertical line with the given equation
	 * @param equation equation in "x = a"
	 * @param isVertical if is vertical line
	 */
	public Line(String equation, boolean isVertical)
	{
		if (!isVertical)
			parseString(equation);
		else
		{
			slope = Double.NaN;
			yIntercept = Double.NaN;
			xIntercept = Double.parseDouble(equation.substring(4));
		}
	}
		
	/**
	 * checks if another line intersects the original line
	 * @param other line to be checked against
	 * @return whether lines intersect
	 */
	public boolean intersects(Line other)
	{
		return this.slope != other.slope;
	}
	
	/**
	 * checks if another line is identical to the original line
	 * @param other line to be checked against
	 * @return whether lines are identical
	 */
	public boolean equals(Line other)
	{
		if (! intersects(other) && this.yIntercept == other.yIntercept || this.xIntercept == other.xIntercept)
			return true;
		return false;
	}
	
	/**
	 * checks if another line is parallel to the original line
	 * @param other line to be checked against
	 * @return whether lines are parallel
	 */
	public boolean isParallel(Line other)
	{
		return !intersects(other);
	}
	
	public String toString()
	{
		if (Double.isNaN(slope))
			return "x = " + xIntercept;
		else
			return "y = " + slope + "x " + "+ " + yIntercept;
	}
	
	private double getYintercept(Point2D.Double point, double slope)
	{
		return point.getY() - point.getX() * slope;
	}
	
	private void parseString(String equation)
	{
		int xIndex = equation.indexOf('x');
		this.slope = Double.parseDouble(equation.substring(4, xIndex));
		this.yIntercept = Double.parseDouble(equation.substring(xIndex + 4));
		xIntercept = Double.NaN;
	}
}
