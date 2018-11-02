package p6_5;

import java.util.Scanner;

public class DSRunner 
{

	public static void main(String[] args) 
	{
		DataSet ds = new DataSet();
		Scanner input = new Scanner(System.in);
		String print = "Input double: ";
		String inputAgain = "Press return to enter another number (any other key to stop): ";
		
		System.out.print(print);
		ds.addValue(input.nextDouble());
		input.nextLine();
		
		boolean isFinished = true;
		System.out.print(inputAgain);
		String result = input.nextLine().toLowerCase();
		
		if (result.equals(""))
			isFinished = false;
		
		while(!isFinished)
		{
			System.out.print(print);
			ds.addValue(input.nextDouble());
			input.nextLine();
			System.out.print(inputAgain);
			result = input.nextLine().toLowerCase();
			if(result.equals(""))
				isFinished = false;
			else
				isFinished = true;
		}
		input.close();
		System.out.println("Count: " + ds.getCount());
		System.out.println("Standard Deviation: " + ds.getStandardDeviation());
		System.out.println("Average: " + ds.getAverage());
	}

}
