package programmingChallengesCh3;

import java.util.Scanner;

public class CircleRunner // number 8
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("What is the circle's radius (in centimeters)?: ");
		double rad = keyboard.nextDouble();
		keyboard.nextLine();
		keyboard.close();
		
		Circle firstCircle = new Circle (rad);
		System.out.println("The area of the circle is: " + firstCircle.getArea() + " centimeters.");
		System.out.println("The diameter of the circle is: " + firstCircle.getDiameter() + " centimeters.");
		System.out.println("The circumference of the circle is: " + firstCircle.getCircumference() + " centimeters.");
	}

}
