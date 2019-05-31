package brailleKeypad;

import java.util.ArrayList;

public class BrailleLetterRunner 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(7);
		arr.add(4);
		arr.add(5);
		arr.add(0);
//		arr.add(7);
//		arr.add(3);
		arr.add(8);
//		arr.add(3);
		
		BrailleLetter a = new BrailleLetter(arr);
		System.out.println(a.getLetter());
	}

}
