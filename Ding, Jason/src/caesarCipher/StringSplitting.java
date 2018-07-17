package caesarCipher;

import java.util.Scanner;

public class StringSplitting {

	public static void main(String[] args) {
		Scanner fromSentence = new Scanner("where is everyone?");
		
		while(fromSentence.hasNext())
			System.out.println(fromSentence.next());
		
		fromSentence.close();

	}

}
