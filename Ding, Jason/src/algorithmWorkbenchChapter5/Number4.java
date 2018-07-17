package algorithmWorkbenchChapter5;

import java.util.Scanner;

public class Number4 {
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int sum = 0;
	
		for (int x = 1; x <= 10; x ++)
		{
			System.out.print("Enter a number: ");
			int digit = keyboard.nextInt();
			sum += digit;
			System.out.println("You entered " + digit + ". Your running total is " + sum + ".");
			
			System.out.println();
			
		}
		keyboard.close();
	}
}
