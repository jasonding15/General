package programmingChallengesCh7;

import java.util.ArrayList;
import java.util.Scanner;

public class Rainfall //number 1
{
	public static void main(String[] args) 
	{
		Scanner fromKeyboard = new Scanner(System.in);
		ArrayList<Double> rain = new ArrayList<Double>();
		double rainfall = -1.0;
		for (int i = 1; i < 13; i++)
		{
			System.out.print("What is the amount of rainfall for month " + i + "?: ");
			rainfall = fromKeyboard.nextDouble();
			rain.add(rainfall);
		}
		fromKeyboard.close();		
		
		double total = findTotal(rain);
		System.out.println("The total amount of rainfall for the year is " + total + ".");
		double average = findAverage(rain);
		System.out.println("The average amount of rainfall per month is " + average + ".");
		int mostRain = findMostRainMonth(rain);
		System.out.println("The month with the most rain is month " + mostRain + ".");
		int leastRain = findLeastRainMonth(rain);
		System.out.println("The month with the least rain is month " + leastRain + ".");
	}
	
	public static double findTotal(ArrayList<Double> arr)
	{
		double totalSum = 0;
		for (int i = 0; i < arr.size(); i++)
		{
			totalSum += arr.get(i);
		}
		
		return totalSum;
	}
	
	public static double findAverage(ArrayList<Double> arr)
	{
		double total = findTotal(arr);
		double avg = total / 12;
		return avg;
	}
	
	public static int findMostRainMonth(ArrayList<Double> arr)
	{
		double mostRain = arr.get(0);
		int monthWMR = 0;
		for (int i = 0; i < arr.size(); i++)
		{
			if (mostRain < arr.get(i))
			{
				mostRain = arr.get(i);
				monthWMR = i;
			}
		}
		return monthWMR + 1;
	}
	
	public static int findLeastRainMonth(ArrayList<Double> arr)
	{
		double leastRain = arr.get(0);
		int monthWLR = 0;
		for (int i = 0; i < arr.size(); i++)
		{
			if (leastRain > arr.get(i))
			{
				leastRain = arr.get(i);
				monthWLR = i;
			}
		}
		return monthWLR + 1;
	}
}
