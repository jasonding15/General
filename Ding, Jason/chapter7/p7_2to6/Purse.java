package p7_2to6;

import java.util.ArrayList;

public class Purse 
{
	private ArrayList<String> arr;
	public Purse()
	{
		arr = new ArrayList<String>();
	}
	
	public void addCoin(String coinName)
	{
		arr.add(coinName);
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
	
	public String toString()
	{
		return arr.toString(); 
	}
}
