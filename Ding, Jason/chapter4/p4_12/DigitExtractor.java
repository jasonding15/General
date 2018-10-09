package p4_12;

public class DigitExtractor 
{
	/**
	 * constructs a digit extactor that gets the digits of an integer
	 * in reverse order
	 * @param x is the integer to break into digits
	 */
	private int digitCount;
	private String digits;
	public DigitExtractor(int x)
	{
		digits = Integer.toString(x);
		digitCount = digits.length();

	}
	
	public int nextDigit()
	{
		digitCount--;
		return Integer.parseInt(digits.substring(digitCount, digitCount + 1));
	}
}
