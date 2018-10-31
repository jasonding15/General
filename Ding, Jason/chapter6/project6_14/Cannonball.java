package project6_14;

public class Cannonball 
{
	private static final double DELTAT = 0.01;
	private static final double GRAVITY = 9.81;
	private double hVelocity, vVelocity, distance, height;
	private int time;
	public Cannonball(double velocity, double angle)
	{
		hVelocity = Math.cos(angle) * velocity;
		vVelocity = Math.sin(angle) * velocity;
		height = 0;
		distance = 0;
		time = 0;
	}
	
	public void updatePosition()
	{
		height = height + vVelocity * DELTAT;
		vVelocity = vVelocity - GRAVITY * DELTAT;
		distance += hVelocity * DELTAT;
		time++;
		if(time % 100 == 0 || height < 0)
		{
			if (height <= 0)
				height = 0;
			System.out.println("Time: " + time / 100.0);
			System.out.println("Distance: " + distance);
			System.out.println("Altitude: " + height);
			System.out.println();	
		}
				
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public double getDistance()
	{
		return distance;
	}
	
}
