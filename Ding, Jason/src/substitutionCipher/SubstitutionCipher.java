package substitutionCipher;

public class SubstitutionCipher 
{
	/*
	 * 
	 */
	private String encryptedMessage;
	private double[] percentArray;
	
	public SubstitutionCipher(String encryptedMessage)
	{
		this.encryptedMessage = encryptedMessage;
		percentArray = new double[26];
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

		for (int i = 0; i < percentArray.length; i++)
		{
			percentArray[i] = letterCount[i] / totalCount;
			percentArray[i] = ((int) (percentArray[i] * 1000)) / 10.0;

		}
		return percentArray;
	}
	public void formatTable()
	{
		double [] realFreq= {8.167, 1.492, 2.782, 4.253, 12.702, 2.228, 2.015, 6.094, 6.966, 0.153, 0.772, 4.025, 2.406, 6.749, 7.507, 1.929, 0.095, 5.987, 6.327, 9.056, 2.758, 0.978, 2.360, 0.150, 1.974, 0.074};
		System.out.println("Letter\t   % in message \t    % in English");
		System.out.println("-----------------------------------------");
		char letter = 'A';
		for(int i = 0; i < percentArray.length; i++)
		{
			System.out.println("|   " +  letter + " \t| \t" + percentArray[i] + "\t|\t" + realFreq[i] + "\t|");

			System.out.println("-----------------------------------------");
			letter++;
		}
	}

}
