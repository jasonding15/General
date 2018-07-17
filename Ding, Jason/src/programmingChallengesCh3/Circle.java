package programmingChallengesCh3;

public class Circle  // number 8
{
	private double radius;
	private final double PI = 3.14159265358979323846264338327950288419;
	
	public Circle (double rad)
	{
		radius = rad;
	}
	
//	public void setRadius (double rad)
//	{
//		radius = rad;
//	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public double getArea()
	{
		return PI * radius * radius;
	
	}
	
	public double getDiameter()
	{
		return radius * 2;
	}
	
	public double getCircumference()
	{
		return 2 * PI * radius;
	}
	
	
}
