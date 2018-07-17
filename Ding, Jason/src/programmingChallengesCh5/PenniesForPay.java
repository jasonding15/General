package programmingChallengesCh5;

import java.util.Scanner;

public class PenniesForPay //Number 4 
{
	//Ask the amount of days they are working for
	// store the input amount & validate it if it is not valid input
	// create a loop calculating the total, starting at 1 and multiplying 2 for every day, adding after each day. 
	// display total in dollars
	// display a table that show much money they would earn each day.
	public static void main(String[] args) 
	{
		int days = getValidInput();
		int totalMoney = countMoney(days);
		
		double dollarAmount = totalMoney / 100.0;
		System.out.println("You have made a total of $" + dollarAmount + "." );
		
		System.out.println("Days Worked\t\t\t Money Made ");
		System.out.println("--------------------------------------------");
		int i = 1;
		double totalAmount = 0;
		while (i <= days)
		{
			double currentMoney = Math.pow(2,i-1);
			totalAmount += currentMoney;
			System.out.println(i + "\t\t\t\t$" + totalAmount/100.0);
			i++;
		}
	}
	
	public static int getValidInput()
	{
		Scanner fromKeyboard = new Scanner(System.in);
		System.out.print("How many days are you working for?: ");
		int days = fromKeyboard.nextInt();
		
		while (days < 1)
		{
			System.out.println("The input must be an integer greater than 1.");
			System.out.print("How many days are you working for?: ");
			days = fromKeyboard.nextInt();
		}
		fromKeyboard.close();
		return days;
	}
	
	public static int countMoney(int days)
	{
		int totalMoney = 0, currentMoney = 1;
		for(int i=1; i <= days; i++)
		{
			totalMoney += currentMoney;
			currentMoney *= 2;
		}
		return totalMoney;

		
	}

}
