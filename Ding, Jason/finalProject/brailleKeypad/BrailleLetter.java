package brailleKeypad;

import java.util.ArrayList;
import java.util.Arrays;

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
		if(Arrays.deepEquals(arr, getA())) 
			return "A";
		if(Arrays.deepEquals(arr, getB()))
			return "B";
		if(Arrays.deepEquals(arr, getC()))
			return "C";	
		if(Arrays.deepEquals(arr, getD()))
			return "D";
		if(Arrays.deepEquals(arr, getE()))
			return "E";
		if(Arrays.deepEquals(arr, getF()))
			return "F";
		if(Arrays.deepEquals(arr, getG()))
			return "G";
		if(Arrays.deepEquals(arr, getH()))
			return "H";
		if(Arrays.deepEquals(arr, getI()))
			return "I";
		return "Not a letter";
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
	
	public boolean[][] getC()
	{
		boolean[][] arr = { {true, true},
							{false, false},
							{false, false}};
		return arr;
	}
	
	public boolean[][] getD()
	{
		boolean[][] arr = { {true, true},
							{false, true},
							{false, false}};
		return arr;
	}
	
	public boolean[][] getE()
	{
		boolean[][] arr = { {true, false},
							{false, true},
							{false, false}};
		return arr;
	}
	
	public boolean[][] getF()
	{
		boolean[][] arr = { {true, true},
							{true, false},
							{false, false}};
		return arr;
	}
	
	public boolean[][] getG()
	{
		boolean[][] arr = { {true, true},
							{true, true},
							{false, false}};
		return arr;
	}
	
	public boolean[][] getH()
	{
		boolean[][] arr = { {true, false},
							{true, true},
							{false, false}};
		return arr;
	}
	
	public boolean[][] getI()
	{
		boolean[][] arr = { {false, true},
							{true, false},
							{false, false}};
		return arr;
	}
	
	public boolean[][] getJ()
	{
		boolean[][] arr = { {false, true},
							{true, true},
							{false, false}};
		return arr;
	}
	
	public boolean[][] getK()
	{
		boolean[][] arr = { {true, false},
							{false, false},
							{true, false}};
		return arr;
	}
	public boolean[][] getL()
	{
		boolean[][] arr = { {true, false},
							{true, false},
							{true, false}};
		return arr;
	}
	public boolean[][] getM()
	{
		boolean[][] arr = { {true, true},
							{false, false},
							{true, false}};
		return arr;
	}
	public boolean[][] getN() 
	{
		boolean[][] arr = { {true, true},
							{false, true},
							{true, false}};
		return arr;
	}
	public boolean[][] getO()
	{
		boolean[][] arr = { {true, false},
							{false, true},
							{true, false}};
		return arr;
	}
	public boolean[][] getP()
	{
		boolean[][] arr = { {true, true},
							{true, false},
							{true, false}};
		return arr;
	}
	public boolean[][] getQ()
	{
		boolean[][] arr = { {true, true},
							{true, true},
							{true, false}};
		return arr;
	}
	public boolean[][] getR()
	{
		boolean[][] arr = { {true, false},
							{true, true},
							{true, false}};
		return arr;
	}
	
	public boolean[][] getS()
	{
		boolean[][] arr = { {false, true},
							{true, false},
							{true, false}};
		return arr;
	}
	public boolean[][] getT()
	{
		boolean[][] arr = { {false, true},
							{true, true},
							{true, false}};
		return arr;
	}
	public boolean[][] getU()
	{
		boolean[][] arr = { {true, false},
							{false, false},
							{true, true}};
		return arr;
	}
	public boolean[][] getV()
	{
		boolean[][] arr = { {true, false},
							{true, false},
							{true, true}};
		return arr;
	}
	public boolean[][] getW()
	{
		boolean[][] arr = { {false, true},
							{true, true},
							{false, true}};
		return arr;
	}
	public boolean[][] getX()
	{
		boolean[][] arr = { {true, true},
							{false, false},
							{true, true}};
		return arr;
	}
	public boolean[][] getY()
	{
		boolean[][] arr = { {true, true},
							{false, true},
							{true, true}};
		return arr;
	}
	public boolean[][] getZ()
	{
		boolean[][] arr = { {true, false},
							{false, true},
							{true, true}};
		return arr;
	}
	
	public boolean[][] getNumberSign()
	{
		boolean[][] arr = { {false, true},
							{false, true},
							{true, true}};
		return arr;
	}
	
	public boolean[][] getPeriod()
	{
		boolean[][] arr = { {false, false},
							{true, true},
							{false, true}};
		return arr;
	}
	
	public boolean[][] getComma()
	{
		boolean[][] arr = { {false, false},
							{true, false},
							{false, false}};
		return arr;
	}
	
	public boolean[][] getQuestionMark()
	{
		boolean[][] arr = { {false, false},
							{true, false},
							{true, true}};
		return arr;
	}
	
	public boolean[][] getSemicolon()
	{
		boolean[][] arr = { {false, false},
							{true, false},
							{true, false}};
		return arr;
	}
	
	public boolean[][] getExcalamationPoint()
	{
		boolean[][] arr = { {false, false},
							{true, true},
							{true, false}};
		return arr;
	}	
	
}
