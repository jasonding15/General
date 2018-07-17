package quizOne;

import java.util.Scanner;

public class Program1 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input the number of days: ");
		int days = input.nextInt();
		
		System.out.print("Input the number of hours: ");
		int hours = input.nextInt();
		
		System.out.print("Input the number of minutes: ");
		int minutes = input.nextInt();
		
		System.out.print("Input the number of seconds: ");
		int seconds = input.nextInt();
		
		input.close();
		
		int totalSeconds = days * 86400 + hours * 3600 + minutes * 60 + seconds;
		
		System.out.println("There are " + totalSeconds + " seconds in the inputted amount of time.");
	}
}
