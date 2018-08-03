package substitutionCipher;

public class SubstitutingLetters 
{
	private String encodedString;
	private char[] mappings;
	private char[] alphabet;
	
	public SubstitutingLetters(String encodedString)
	{
		this.encodedString = encodedString.toUpperCase();
		mappings = new char[26];
		alphabet = new char[26];
		char letter = 'A';
		for (int i = 0; i < mappings.length; i++)
		{
			
			mappings[i] = '-';
			alphabet[i] = letter;
			letter++;
		}
		
	}
	
	public void map (char original, char newLetter)
	{
		/*
		 * SL sl = new SubstitutingLetters("jason")
		 * sl.map("j", "a");
		 * System.out.println(sl.getModifiedString()); // "Aason", "a****"
		 * sl.map('a','o')
		 * sl.map("j", "k") 
		 * 
		 * loop through original string
		 * every time you come across the original character, replace with newLetter, which is uppercase
		 *
		 */
		original = Character.toUpperCase(original);
		int unicode = original - 'A';
		mappings[unicode] = newLetter;
	}
	
	public char[] getMappings()
	{
		return mappings;
	}
	
	public String getModifiedString()
	{
		String modifiedString = "";
		for(int i = 0; i < encodedString.length(); i++)
		{
			if (encodedString.charAt(i) >= 'A' && encodedString.charAt(i) <= 'Z')
			{	
				int un = encodedString.charAt(i) - 'A';
				char newLetter = Character.toUpperCase(mappings[un]);
				if (newLetter == '-')
					modifiedString += "_";
				else
				{
					modifiedString += newLetter;
				}
			}
			else
			{
				modifiedString += " ";
			}
		}
		return modifiedString;
	}
	public char[] getAlphabet() 
	{
		return alphabet;
	}
}
