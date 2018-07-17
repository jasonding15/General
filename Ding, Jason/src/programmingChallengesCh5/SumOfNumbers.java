package programmingChallengesCh5;

import java.util.Scanner;

public class SumOfNumbers //Number 1
{
	public static void main(String[] args)
	{
		// Ask for a positive integer
		// input and store the input
		// create a loop that adds 1 up to that number
		// print sum of that loop
		
		Scanner fromKeyboard = new Scanner(System.in);
		System.out.print("Please enter a positive integer: ");
		int number = fromKeyboard.nextInt();
		fromKeyboard.close();
		
		int total = 0;
		for(int i = 1; i <= number; i++)
		{
			total += i;
		}
		
		System.out.println("The sum is: " + total);
	}
}
