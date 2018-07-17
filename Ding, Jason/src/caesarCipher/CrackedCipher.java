package caesarCipher;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CrackedCipher
{

	public static void main(String[] args) throws FileNotFoundException 
	{
//		Scanner keyboard = new Scanner(System.in);
//		System.out.println("Press '1' for encryption, or '2' for decryption: ");
//		System.out.println(encryptLetter('v', 7)); // should print 'e
//		System.out.println(isLetter(' '));
		
//		System.out.println(decryptLetter('a', 2));
//		System.out.println(decrypt("Gtsotzw, Fqjc Xufs mfx f ktwjmjfi.", 5));
//		keyCrack("Gtsotzw, Fqjc Xufs mfx f ktwjmjfi.");
//		System.out.println(actualWord(""));
//		System.out.println(wordCount("hi how Is it going"));
//		System.out.println(encrypt("Lebron is the GOAT", 20));
		System.out.println(mostLikelyDecryption("Fyvlih cm nby AIUN."));
	}
	
	public static char encryptLetter(char letter, int key)
	{
		int unicode = letter;
		int newUnicode = unicode + key;
		
		char eLetter = (char) newUnicode;
		
		if (eLetter > 'Z' && letter >= 'A' && letter <= 'Z')
			eLetter -= 26;
		
		if (eLetter > 'z' && letter >= 'a' && letter <= 'z')
			eLetter -= 26;
		
		return eLetter;
		
	}
	
	public static char decryptLetter(char letter, int key)
	{
		int unicode = letter;
		int newUnicode = unicode - key;
		
		char dLetter = (char) newUnicode;
		
		if (dLetter < 'A' && letter >= 'A' && letter <= 'Z')
			dLetter += 26;
		
		if (dLetter < 'a' && letter >= 'a' && letter <= 'z')
			dLetter += 26;

		return dLetter;
	
	}
	
	public static String encrypt(String sentence, int key)
	{
		String str = "";
		
		for (int i = 0; i < sentence.length(); i++)
		{
			if (isLetter(sentence.charAt(i)))
				str += encryptLetter(sentence.charAt(i), key);
			else
				str += sentence.charAt(i);
		}
		return str;
	}
	
	public static String decrypt(String sentence, int key)
	{
		String str = "";
		for (int i = 0; i < sentence.length(); i++)
		{
			if (isLetter(sentence.charAt(i)))
				str += decryptLetter(sentence.charAt(i), key);
			else
				str += sentence.charAt(i);
		}
		return str;
	}
	
	public static boolean isLetter(char letter)
	{
		if (letter >= 'A' && letter <= 'Z')
			return true;
		else if (letter >= 'a' && letter <= 'z')
			return true;
		else 
			return false;
	}
	
	public static void keyCrack(String sentence)
	{
		for (int key = 0; key <= 26; key++)
		{
			System.out.println(decrypt(sentence, key));
		}
	}
	
	public static boolean actualWord(String possibleWord) throws FileNotFoundException
	{
		possibleWord = possibleWord.toLowerCase();
		
		Scanner fromDict = new Scanner(new File("/usr/share/dict/words"));
		while(fromDict.hasNextLine())
		{
			if (fromDict.nextLine().equals(possibleWord))
			{
				fromDict.close();
				return true;
			}
		}
		
		fromDict.close();
		return false;
	}
	
	public static int wordCount (String sentence) throws FileNotFoundException
	{
		int count = 0;
		Scanner fromSentence = new Scanner(sentence);
		while(fromSentence.hasNext())
		{
			if (actualWord(fromSentence.next()))
				count ++;
		}
		
		fromSentence.close();
		return count;
	}
	
	public static String mostLikelyDecryption(String encryptedMessage) throws FileNotFoundException
	{
		int mostCount = 0, currentCount, bestKey = 0;
		for (int key = 0; key <= 26; key++)
		{
			 String possibleDecryption = decrypt(encryptedMessage, key);
			 currentCount = wordCount(possibleDecryption);
			 
			 if (currentCount > mostCount)
			 {
				 mostCount = currentCount;
				 bestKey = key;
			 }
		}
		return decrypt(encryptedMessage, bestKey);
	}
	
}
