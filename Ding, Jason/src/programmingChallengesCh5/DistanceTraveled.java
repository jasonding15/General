package programmingChallengesCh5;

import java.util.Scanner;

public class DistanceTraveled //Number 2
{

	public static void main(String[] args) 
	{
		/* ask for speed and time
		 * store inputed values in corresponding variables
		 * distance = speed * time
		 * display distance
		 * create loop that shows the distance traveled for each hour
		 * display the values
		 */
		
		Scanner fromKeyboard = new Scanner(System.in);
		
		int speed = getValidSpeed(fromKeyboard);
		int time = getValidTime(fromKeyboard);

		int totalDistance = speed * time;
		System.out.println("The total distance is " + totalDistance + ".");
		
		System.out.println("Hour\t\t\t Distance Traveled ");
		System.out.println("------------------------------------------");
		
		int i = 1;
		while (i <= time)
		{
			System.out.println(i + "\t\t\t\t" + speed*i);
			i++;
		}
		
		fromKeyboard.close();
	}
	
	public static int getValidSpeed(Scanner scan)
	{
		
		
		System.out.print("What is the speed (in miles per hour)?: ");
		int speed = scan.nextInt();
		while (speed < 0)
		{
			System.out.println("Input must be a positive integer.");
			System.out.print("What is the speed (in miles per hour)?");
			speed = scan.nextInt();
		}
		return speed;
	}
	
	public static int getValidTime(Scanner scan)
	{
		System.out.print("What is the time (in hours)?: ");
		int time = scan.nextInt();
		while (time < 1)
		{
			System.out.println("Input must be a positive integer.");
			System.out.print("What is the time (in hours)?: ");
			time = scan.nextInt();
		}
		return time;
		
	}

}
