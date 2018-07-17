package quizOne;

import java.util.Scanner;

public class Program2 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input amount of seconds: ");
		int totalSeconds = input.nextInt();
		input.close();
		
		int days = totalSeconds / 86400;
		int remainder1 = totalSeconds % 86400;
		
		int hours = remainder1 / 3600;
		int remainder2 = remainder1 % 3600;
		
		int minutes = remainder2 / 60;
		int seconds = remainder2 % 60;
		
		System.out.println("There are " + days + " days, " + hours + " hours, " + minutes + 
				" minutes, and " + seconds + " seconds in " + totalSeconds + " seconds.");
	}
}
