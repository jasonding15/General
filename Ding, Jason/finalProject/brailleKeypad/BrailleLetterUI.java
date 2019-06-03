package brailleKeypad;

import java.util.ArrayList;
import java.util.Scanner;

public class BrailleLetterUI 
{
	private Scanner fromKeyboard;

	public BrailleLetterUI()
	{
		fromKeyboard = new Scanner(System.in);
	}
	
	public ArrayList<Integer> introduction()
	{
		System.out.println("Enter your response. 0 to end the letter, another to end the word: ");
		String str = fromKeyboard.nextLine();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		while(! str.substring(str.length() - 3).equals("000"))
		{
			System.out.println("Invalid input, pls end with 3 0s : ");
			str = fromKeyboard.nextLine();
		}
		for(int i = 0; i < str.length(); i++)
		{
			arr.add(Integer.parseInt(str.substring(i, i+ 1)));
		}
		
		return arr;
	}
	
	public void getWord(ArrayList<Integer> arr)
	{
		String str = "";
		int i = 0;
		ArrayList<Integer> temp = new ArrayList<Integer>();
		BrailleLetter bL;
		while(i < arr.size()) //end of word
		{
			temp.add(arr.get(i));
			if(temp.get(i) == 0) // end of letter
			{
				bL = new BrailleLetter(arr);
				str += bL;
			}
		}
		str += " ";
		System.out.println(str);		
	}
	
	public void getSentence()
	{
		ArrayList<Integer> arr = introduction();
		ArrayList<Integer> temp = new ArrayList<Integer>();
		int i = 0;
		System.out.println("You typed : ");
		while(arr.get(i) != 0 && arr.get(i + 1) != 0 && arr.get(i + 2) != 0) //end of sentence
		{
			temp.add(arr.get(i));
			if(temp.get(temp.size() - 1) == 0 && temp.get(temp.size() - 2) == 0)//end of word
			{
				getWord(temp);
				temp.clear();
			}
			i++;
		}
	}
}
