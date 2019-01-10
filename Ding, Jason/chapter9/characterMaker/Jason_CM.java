package characterMaker;

public class Jason_CM implements CharacterMaker
{
	private char[] letters;
	public Jason_CM()
	{
		letters = new char[] {'J', 'a', 'o', 'E', 'H'};
	}
	public char[][] characterToAscii(char character)
	{
		
	}
	
	public boolean characterSupported(char character)
	{
		for(int i = 0; i < letters.length; i++)
		{
			if(letters[i] == character)
				return true;
		}
		return false;
	}
	
	public char[] supportedCharacters()
	{
		return letters;
	}

	private char[][] createJ()
	{
		char[][] arr = new char[][]
			   {{' ', '_', '_', '_', '_', '_', '_', '_', '_', ' '},
				{'|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|'},
				{'|', '_', '_', '_', ' ', ' ', '_', '_', '_', '|'},
				{' ', ' ', ' ', '|', ' ', ' ', '|', ' ', ' ', ' '},
				{' ', ' ', ' ', '|', ' ', ' ', '|', ' ', ' ', ' '},
				{'_', '_', '_', '|', ' ', ' ', '|', ' ', ' ', ' '},
				{'|', ' ', '|', '|', ' ', ' ', '|', ' ', ' ', ' '},
				{'|', ' ', '\\','/', ' ', ' ', '|', ' ', ' ', ' '},
				{'|', ' ', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' '},
				{'\\','_', '_', '_', '_', '_', '/', ' ', ' ', ' '}};
		return arr;

	}

}