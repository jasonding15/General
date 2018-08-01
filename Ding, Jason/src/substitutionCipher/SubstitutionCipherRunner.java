package substitutionCipher;

import java.util.Arrays;

public class SubstitutionCipherRunner {

	public static void main(String[] args) 
	{
		String message = "If there is ever a dispute over who is superior, Jason or Brian, there is always one simple answer: Jason. Brian may be taller, however, he lack the inteligence. Brian received a 35 on his ACT, while Jason received a 36. Brian is infereor in every aspect: sports, life, girls(maybe). Brian also likes to be bossed around by random freshman. This reults in a bad probem. If there is ever any questions, feel free to contact Justin Debster Weisgern.";
		SubstitutionCipher test = new SubstitutionCipher(message);
		System.out.println(Arrays.toString(test.percentLetters()));
	}

}
