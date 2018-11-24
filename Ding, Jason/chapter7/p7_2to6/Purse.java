package p7_2to6;

import java.util.ArrayList;
import java.util.Arrays;

public class Purse 
{
	private ArrayList<String> arr;
	public Purse()
	{
		arr = new ArrayList<String>();
	}
	
	public void addCoin(String coinName)
	{
		arr.add(coinName.toUpperCase());
	}
	
	public void reverseCoins()
	{
		for (int i = 0; i < arr.size() / 2; i++)
		{
			String temp = arr.get(i);
			arr.set(i, arr.get(arr.size() - i - 1));
			arr.set(arr.size() - 1 - i, temp);
		}
	}
	
	public boolean sameContents(Purse other)
	{
		if (other.arr.equals(this.arr))
			return true;
		return false;
	}
	
	public void transferPurse(Purse other)
	{
		for (int i = 0; i < other.arr.size(); i++)
		{
			this.addCoin(other.arr.get(i));
		}
		other.arr.clear();
		
	}
	
	public boolean sameCoins(Purse other)
	{
		int[] arr1 = countCoins(this.arr);
		int[] arr2 = countCoins(other.arr);
		return Arrays.equals(arr1, arr2);
		
		
	}
	
	private static int[] countCoins(ArrayList<String> arr)
	{
		int[] count = new int[] {0, 0, 0, 0};
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("PENNY"))
				count[0]++;
			else if (arr.get(i).equals("NICKEL"))
				count[1]++;
			else if (arr.get(i).equals("DIME"))
				count[2]++;
			else
				count[3]++;
		}
		
		return count;

	}
	
	public String toString()
	{
		return arr.toString(); 
	}
}
