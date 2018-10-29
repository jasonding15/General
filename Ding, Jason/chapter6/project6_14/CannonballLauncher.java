package project6_14;

import java.util.Scanner;

public class CannonballLauncher 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Input velocity: ");
		double velocity = input.nextDouble();
		
		System.out.print("Input angle(degrees): ");
		double angle = input.nextDouble();
		input.close();
		
		Cannonball cball = new Cannonball(velocity, Math.toRadians(angle));
		cball.updatePosition();
		while(cball.getHeight() > 0)
			cball.updatePosition();
	}

}
