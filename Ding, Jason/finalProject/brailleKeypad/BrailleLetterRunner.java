package brailleKeypad;

import java.util.ArrayList;
import java.util.Scanner;

public class BrailleLetterRunner 
{

//	public static void main(String[] args) 
//	{
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		arr.add(7);
//		arr.add(4);
//		arr.add(5);
//		arr.add(0);
////		arr.add(7);
////		arr.add(3);
//		arr.add(8);
////		arr.add(3);
//		
//		BrailleLetter a = new BrailleLetter(arr);
//		System.out.println(a.getLetter());
//	}
	
	public static void main(String[] args) 
	{
		ArrayList<Integer> arr = new ArrayList<Integer>();
		Scanner fromKeyboard = new Scanner(System.in);
		System.out.println("Input letters, 0 to end letter, another 0 for space, another 0 to end");
		int i = fromKeyboard.nextInt();
		while(i != 0)
		{
			arr.add(i);
		}
		BrailleLetter bL = new BrailleLetter(arr);
		
		
		fromKeyboard.close();
		
	}

}
