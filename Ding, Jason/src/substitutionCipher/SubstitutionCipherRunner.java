package substitutionCipher;

//import java.util.Arrays;

public class SubstitutionCipherRunner {

	public static void main(String[] args) 
	{
		String message = "abcdefghijklmnopqrstuvwxyz";
		SubstitutionCipher test = new SubstitutionCipher(message);
		test.percentLetters();
		test.formatTable();
	}

}

