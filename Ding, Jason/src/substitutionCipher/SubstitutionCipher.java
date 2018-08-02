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
			percentArray[i] = ((int) (percentArray[i] * 1000)) / 1000.0;
		}
		return percentArray;
	}
	public void formatTable()
	{
		System.out.println("Letter number\tPercentage");
		System.out.println("-------------------------");
		char letter = 'A';
		for(int i = 0; i < percentArray.length; i++)
		{
			System.out.println("|   " +  letter + " \t| \t" + percentArray[i] + "\t|");
//			System.out.println("|   " +  letter + " \t| \t" + (int) (percentArray[i] * 100) + "%\t|");
			System.out.println("-------------------------");
			letter++;
		}
	}

}
