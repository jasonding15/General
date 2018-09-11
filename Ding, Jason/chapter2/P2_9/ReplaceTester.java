package P2_9;

public class ReplaceTester //P2.9
{

	public static void main(String[] args) 
	{
		String str = "Mississippi";
		System.out.println("Expected result is 'M!$$!$$!pp!'.");
		System.out.println("Actual result: " + replaceLetters(str));
		
		str = "Tiss tiss Mr.Tsisfsi";
		System.out.println(replaceLetters(str)); //expected result is 'T!$$ t!$$ Mr.T$!$f$!'
	}
	
	public static String replaceLetters(String str)
	{
		str = str.replace('i', '!');
		str = str.replace('s', '$');
		
		return str;
	}

}
