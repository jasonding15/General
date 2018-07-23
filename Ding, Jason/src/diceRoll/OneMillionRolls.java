package diceRoll;

import java.util.Arrays;

public class OneMillionRolls {

	public static void main(String[] args) 
	{
		System.out.println(Arrays.toString(countAMillionDieRolls()));
		int[] millionRolls = countAMillionDieRolls();
		System.out.println(Arrays.toString(calculatePercentage(millionRolls)));
	}
	
	public static int sumOfTwoDieRoll()
	{
		int dieRoll1 = (int) (Math.random() * 6 + 1);
		int dieRoll2 = (int) (Math.random() * 6 + 1);
		
		return dieRoll1 + dieRoll2;
	}
	
	public static int[] countAMillionDieRolls()
	{
		int[] resultOfSums = new int [11];
		
		for(int i = 0; i <= 1000000; i++)
		{
			int sum = sumOfTwoDieRoll();
			resultOfSums[sum - 2]++;
		}
		
		return resultOfSums;
	}
	
	public static double[] calculatePercentage(int[] resultOfSums)
	{
		double[] percentages = new double[11];
		
		for(int i = 0; i <= resultOfSums.length - 1; i++)
		{
			percentages[i] = resultOfSums[i] / 1000000.0 * 100;
		}
		
		return percentages;
	}

}
