package baseConversion;

public class BaseConverter
{
    static char digitToChar(int digit) // package access for testing
    {
    		if (digit == 10)
    			return 'A';
    		if (digit == 11)
    			return 'B';
    		if (digit == 12)
    			return 'C';
    		if (digit == 13)
    			return 'D';
    		if (digit == 14)
    			return 'E';
    		if (digit == 15)
    			return 'F';
    		return (char) (digit + 48);
    }
    
    public static String convertFromBase10(int num, int targetBase)
    {
    		String result = "";
    		int quotient = -1;
    		while (quotient >= 0)
    		{
    			result += digitToChar(targetBase % 16);
    			quotient = targetBase / 16;
    		}
    		return result;
    }

    static int charToValue(char digit) // package access for testing
    {
        return -1; // TODO: implement
    }
    
    public static int convertToBase10(String num, int originalBase)
    {
        return -1; // TODO: implement
    }

    public static String convert(String num, int originalBase, int targetBase)
    {
        return null; // TODO: implement
    }
}
