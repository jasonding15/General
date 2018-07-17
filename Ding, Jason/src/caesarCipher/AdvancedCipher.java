package caesarCipher;

public class AdvancedCipher
{

	public static void main(String[] args) 
	{
//		Scanner keyboard = new Scanner(System.in);
//		System.out.println("Press '1' for encryption, or '2' for decryption: ");
//		System.out.println(encryptLetter('v', 7)); // should print 'e
//		System.out.println(isLetter(' '));
		
//		System.out.println(decryptLetter('a', 2));
		System.out.println(decrypt("Gtsotzw, Fqjc Xufs mfx f ktwjmjfi.", 5));
//		System.out.println(encrypt("Bonjour, Alex Span has a forehead.", 5));

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
}
