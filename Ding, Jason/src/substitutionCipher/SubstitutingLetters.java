package substitutionCipher;

public class SubstitutingLetters 
{
	private String encodedString;
	private String[] mappings;
	
	public SubstitutingLetters(String encodedString)
	{
		this.encodedString = encodedString;
		mappings = new String[26];
	}
	
	public void map (char original, String newLetter)
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
		int unicode = original;
		mappings[unicode] = newLetter;
	}
	
	public String getModifiedString(String original, String newLetter)
	{
		String modifiedString = encodedString;
		for(int i = 0; i < modifiedString.length(); i++)
		{
			if(modifiedString.substring(i, i + 1) .equals(original))
			{
//				Character.toUpperCase(newLetter);
				modifiedString.replace(original, newLetter);
			}
				
		}
		return modifiedString;
	}
	
//	public void mapping()
//	{
//		String [] mappings = new String[26];
//		
//	}
}
