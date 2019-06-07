package brailleKeypad;

import java.util.ArrayList;
import java.util.Scanner;

public class UIforMac 
{
	private Scanner fromKeyboard;

	public UIforMac()
	{
		fromKeyboard = new Scanner(System.in);
	}
	
	public ArrayList<Integer> introduction()
	{
		String s = "Enter your response using the keypad to signify braille leters. Enter 0 to end the letter, "
				+ "two zeros to end the word, and hit enter to end and hear your response:  ";
//		String s = "Go: ";
		System.out.print(s);
		SpeechForMac.say(s);
		String str = fromKeyboard.nextLine();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		while(str.length() < 2 || ! str.substring(str.length() - 2).equals("00"))
		{
			System.out.println("Invalid input, please end with Two 0s : ");
			SpeechForMac.say("Invalid input, pls end with Two 0s : ");
			str = fromKeyboard.nextLine();
		}
		for(int i = 0; i < str.length(); i++)
		{
			arr.add(Integer.parseInt(str.substring(i, i+ 1)));
		}
		
		return arr;
	}
	
	public String getWord(ArrayList<Integer> arr) //ends with one 0
	{
		String str = "";
		int i = 0;
		ArrayList<Integer> temp = new ArrayList<Integer>();
		BrailleLetter bL;
		while(i < arr.size()) //end of word
		{
			temp.add(arr.get(i));
			if(temp.get(temp.size() - 1) == 0) // end of letter
			{
				if (temp.size() == 1)
					return str;
				bL = new BrailleLetter(temp);
				str += bL.getLetter();
				temp.clear();
			}
			i++;
		}
		return str;
	}
	
	public void getSentence()
	{
		ArrayList<Integer> arr = introduction();
		ArrayList<Integer> temp = new ArrayList<Integer>();
		String s = "";
		for(int i = 0; i < arr.size(); i++) //end of sentence
		{
			temp.add(arr.get(i));
			
			if(temp.size() >= 2 && temp.get(temp.size() - 1) == 0 && temp.get(temp.size() - 2) == 0)//end of word
			{
				s += getWord(temp) + " ";
				temp.clear();
			}
		}
		System.out.print(s);
		SpeechForMac.say(s);
	}
}
