package caesarCipher;

import java.util.Scanner;

public class Cipher 
{
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Would you like to encrypt or decrypt? Type '1' to encrypt, and '2' to decrypt: ");
		int decision = input.nextInt();
		
		System.out.print("What is the key?: ");
		int key = input.nextInt();
		input.nextLine();
			
		System.out.print("What is the letter (upper case)?: ");
		char letter = input.nextLine().charAt(0);
		input.close();

		int unicode = letter; 
			
		if (decision == 1)
		{
			int newUnicode = unicode + key;
		
			char ELetter = (char) newUnicode;
			
			if (ELetter > 'Z')
				ELetter -= 26;
			
		
			System.out.println("The encrypted letter is " + ELetter + ".");
		}
		else if (decision == 2)
		{
			int newUnicode = unicode - key;
		
			char DLetter = (char) newUnicode;
			
			if (DLetter < 'A')
				DLetter += 26;
		
			System.out.println("The decrypted letter is " + DLetter + ".");
		}
		else
			System.out.println("Error, re-run the program and please comply with the request to enter '1' or '2'."
				+ "I am merely an insecure computer program and am sorry for the inconvience, but I do not "
				+ "have the wisdom to compute any other input.");
		
	}
}
