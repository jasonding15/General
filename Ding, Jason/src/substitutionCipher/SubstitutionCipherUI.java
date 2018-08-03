package substitutionCipher;

import java.util.Arrays;
import java.util.Scanner;

public class SubstitutionCipherUI 
{
	
	private SubstitutionCipher sc;
	private SubstitutingLetters subLetters;
	private Scanner fromKeyboard;
	
	public SubstitutionCipherUI() 
	{
		 sc = null;
		 subLetters = null;
		 fromKeyboard = new Scanner(System.in);

	}
	public void runOneTime()
	{
		takeString();
		showTable();
		askToMap();
		getNewString();
	}
	private void takeString()
	{
		System.out.print("What string would you like to decode? ");
		String ans = fromKeyboard.nextLine();
		System.out.println();
		
		sc = new SubstitutionCipher(ans);
		subLetters = new SubstitutingLetters(ans);
		sc.countLetters();
		sc.percentLetters();
		
	}
	private void showTable()
	{
		System.out.println("Below are the frequencies of the letters in your message and the average frequencies in the English language.");
		System.out.println();
		sc.formatTable();
	}
	private void askToMap()
	{
		boolean wantsToMap = true;
		System.out.print("Which letters do you want to map, based on the table? Type the old letter followed by the letter you want it mapped to: ");
		String ans = fromKeyboard.nextLine();
		subLetters.map(ans.charAt(0), ans.charAt(1));
		System.out.println("Here are your current mappings: " + Arrays.toString(subLetters.getAlphabet()));
		System.out.println("Here are your current mappings: " + Arrays.toString(subLetters.getMappings()));
		System.out.println("Here's your modified string: " + subLetters.getModifiedString());
		System.out.println(" ");
		
		subLetters.map(ans.charAt(0), ans.charAt(1));
		while(wantsToMap)
		{
			System.out.print("Would you like to map any other letters (y for yes, any other for no): ");
			String confirm = fromKeyboard.nextLine();
			confirm = confirm.toUpperCase();
			
			if(confirm.equals("Y"))
			{
				System.out.print("Which letters would you like to map? ");
				ans = fromKeyboard.nextLine();
				subLetters.map(ans.charAt(0), ans.charAt(1));
				System.out.println("Your new mappings are: " + Arrays.toString(subLetters.getAlphabet()));
				System.out.println("Your new mappings are: " + Arrays.toString(subLetters.getMappings()));
				System.out.println("Here's your modified string: " + subLetters.getModifiedString());
				System.out.println(" ");
			}
			else
				wantsToMap = false;
					
		}
		
		System.out.println("Here are your final mappings: " + Arrays.toString(subLetters.getAlphabet()));
		System.out.println("Here are your final mappings: " + Arrays.toString(subLetters.getMappings()));
		
	}
	private void getNewString()
	{
		System.out.println("Here is your new string: " + subLetters.getModifiedString());
	}

}
