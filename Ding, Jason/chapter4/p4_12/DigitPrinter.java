package p4_12;

public class DigitPrinter 
{

	public static void main(String[] args) 
	{
		DigitExtractor de = new DigitExtractor(979584);
		System.out.println(de.nextDigit());
		System.out.println(de.nextDigit());
		System.out.println(de.nextDigit());
		System.out.println(de.nextDigit());
		System.out.println(de.nextDigit());
		System.out.println(de.nextDigit());
	}

}
