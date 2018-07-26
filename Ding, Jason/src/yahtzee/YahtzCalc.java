package yahtzee;

import java.util.Arrays;

public class YahtzCalc 
{

	public static void main(String[] args) 
	{
		int[] fiveRolls = {4, 3, 4, 4, 3};
//		System.out.println(sumWithValue(5, fiveRolls));
//		System.out.println(Arrays.toString(countNumberOfTimes(fiveRolls)));
//		int[] numberOfTimes = countNumberOfTimes(fiveRolls);
//		System.out.println(Arrays.toString(numberOfTimes));
//		System.out.println(calcThreeOfAKind(numberOfTimes));
//		System.out.println(calcFourOfAKind(numberOfTimes));
//		System.out.println(calcChance(fiveRolls));
//		System.out.println(calcYahtzee(fiveRolls));
//		System.out.println(calcLargeStraight(numberOfTimes));
//		System.out.println(calcSmallStraight(numberOfTimes));
		System.out.println(calcFullHouse(fiveRolls));

	}
	
	public static int sumWithValue(int x, int[] fiveRolls)
	{
		int sum = 0;
		
		for (int i = 0; i < fiveRolls.length; i++)
		{
			if (fiveRolls[i] == x)
				sum += x;
		}
		
		return sum;
	}
	
	public static int[] countNumberOfTimes(int[] fiveRolls)
	{
		int[] numberOfTimes = new int[6];
		for(int i = 0; i < fiveRolls.length; i++)
		{
			numberOfTimes[fiveRolls[i] - 1]++;
		}
		
		return numberOfTimes;
	}
	
	public static int calcThreeOfAKind(int[] fiveRolls)
	{
		int[] numberOfTimes = countNumberOfTimes(fiveRolls);
		for(int i = 0; i < numberOfTimes.length; i++)
		{
			if (numberOfTimes[i] == 3)
				return 1 * numberOfTimes[0] + 2 * numberOfTimes[1] + 3 * numberOfTimes[2] + 4 * numberOfTimes[3] + 5 * numberOfTimes[4] + 6 * numberOfTimes[5];
		}
		
		return 0;
	}
	
	public static int calcFourOfAKind(int[] fiveRolls)
	{
		int[] numberOfTimes = countNumberOfTimes(fiveRolls);
		for(int i = 0; i < numberOfTimes.length; i++)
		{
			if (numberOfTimes[i] == 4)
				return 1 * numberOfTimes[0] + 2 * numberOfTimes[1] + 3 * numberOfTimes[2] + 4 * numberOfTimes[3] + 5 * numberOfTimes[4] + 6 * numberOfTimes[5];
		}
		
		return 0;
	}
	
	public static int calcFullHouse(int[] fiveRolls)
	{
		int[] numberOfTimes = countNumberOfTimes(fiveRolls);
		boolean is2 = false, is3 = false;
		for(int i = 0; i < numberOfTimes.length; i++)
		{
			if(numberOfTimes[i] == 3)
				is3 = true;
			if(numberOfTimes[i] == 2)
				is2 = true;
		}
		
		if(is3 && is2)
			return 25;
		else 
			return 0;
	}

	public static int calcSmallStraight(int[] fiveRolls)
	{
		int[] numberOfTimes = countNumberOfTimes(fiveRolls);
		if (numberOfTimes[0] >= 1 && numberOfTimes[1] >= 1 && numberOfTimes[2] >= 1 && numberOfTimes[3] >= 1)
			return 30;
		else if (numberOfTimes[1] >= 1 && numberOfTimes[2] >= 1 && numberOfTimes[3] >= 1 && numberOfTimes[4] >= 1)
			return 30;
		if (numberOfTimes[5] >= 1 && numberOfTimes[2] >= 1 && numberOfTimes[3] >= 1 && numberOfTimes[4] >= 1)
			return 30;
		else
			return 0;
		//30
	}
	
	public static int calcLargeStraight(int[] fiveRolls)
	{
		int[] numberOfTimes = countNumberOfTimes(fiveRolls);
		if (numberOfTimes[0] == 1 && numberOfTimes[1] == 1 && numberOfTimes[2] == 1 && numberOfTimes[3] == 1 && numberOfTimes[4] == 1)
			return 40;
		else if (numberOfTimes[5] == 1 && numberOfTimes[1] == 1 && numberOfTimes[2] == 1 && numberOfTimes[3] == 1 && numberOfTimes[4] == 1)
			return 40;
		else
			return 0;
	}
	
	public static int calcYahtzee(int[] fiveRolls)
	{
		if (fiveRolls[0] == fiveRolls[1] && fiveRolls[1] == fiveRolls[2] && fiveRolls[2] == fiveRolls[3] && fiveRolls[3]== fiveRolls[4])
			return 50;
		else 
			return 0;
	}
	
	public static int calcChance(int[] fiveRolls)
	{
		return fiveRolls[0] + fiveRolls[1] + fiveRolls[2] + fiveRolls[3] + fiveRolls[4];
	}
}
