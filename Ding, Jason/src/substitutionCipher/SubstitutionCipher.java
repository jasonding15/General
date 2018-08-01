package substitutionCipher;

public class SubstitutionCipher 
{
	private String encryptedMessage;
	
	public SubstitutionCipher(String encryptedMessage)
	{
		this.encryptedMessage = encryptedMessage;
	}
	
	public int[] countLetters()
	{
		int[] letterCount = new int[26];
		encryptedMessage = encryptedMessage.toUpperCase();
		
		for(int i = 0; i < encryptedMessage.length(); i++)
		{
			int letterNum = encryptedMessage.charAt(i);
			letterNum -= 'A';
			if(letterNum >= 0 && letterNum < letterCount.length)
				letterCount[letterNum]++;
		}
		
		return letterCount;
	}
	
	public double[] percentLetters()
	{
		int[] letterCount = countLetters();
		double totalCount = 0.0;
		for (int a = 0; a < letterCount.length; a++)
		{
			totalCount += letterCount[a];
		}
		double[] percentCount = new double[26];
		for (int i = 0; i < percentCount.length; i++)
		{
			percentCount[i] = letterCount[i] / totalCount;
		}
		return percentCount;
	}

}
