package p4_12;

public class DigitExtractor 
{
	private int digitCount;
	private String digits;
	/**
	 * constructs a digit extactor that gets the digits of an integer
	 * in reverse order
	 * @param x is the integer to break into digits
	 */
	public DigitExtractor(int x)
	{
		digits = Integer.toString(x);
		digitCount = digits.length();

	}
	
	/**
	 * gives back the next digit in reverse order
	 * @return the next to last digit
	 */
	public int nextDigit()
	{
		digitCount--;
		return Integer.parseInt(digits.substring(digitCount, digitCount + 1));
	}
}
