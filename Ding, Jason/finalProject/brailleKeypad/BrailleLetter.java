package brailleKeypad;

import java.util.ArrayList;

public class BrailleLetter 
{
	private boolean[][] arr;
	public BrailleLetter(ArrayList<Integer> nums)
	{
		arr = new boolean[3][2];
		for(int i = 0; i < nums.size(); i++)
		{
			if (nums.get(i) == 1)
				arr[2][0] = true;
			else if (nums.get(i) == 2)
				arr[2][1] = true;
			else if (nums.get(i) == 4)
				arr[1][0] = true;
			else if (nums.get(i) == 5)
				arr[1][1] = true;
			else if (nums.get(i) == 7)
				arr[0][0] = true;
			else if (nums.get(i) == 8)
				arr[0][1] = true;
			else 
				return;
		}
	}
	
	public String getLetter()
	{	
		if(arr == getA()) // comparing error
			return "A";
		return "";
	}
	
	public boolean[][] getA()
	{
		
		boolean[][] arr = { {true, false},
							{false, false},
							{false, false}};
		return arr;
		
		
	}
	
	public boolean[][] getB()
	{
		boolean[][] arr = { {true, false},
							{true, false},
							{false, false}};
		return arr;
	}
	
	
	
	
}
