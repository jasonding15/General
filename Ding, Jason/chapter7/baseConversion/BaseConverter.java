package baseConversion;

import java.util.ArrayList;

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
    		ArrayList<Character> remainders = new ArrayList<Character>();
    		int quotient = num / targetBase;
    		while (quotient > 0)
    		{
    			remainders.add(0, digitToChar(num % targetBase));
    			quotient = num / targetBase;
    			num /= targetBase;
    		}
    		String str = "";
    		for (int i = 0; i < remainders.size(); i++)
    		{
    			str += remainders.get(i);
    		}
    		return str;
    	}

    static int charToValue(char digit) // package access for testing
    {
    	if (digit == 'A')
			return 10;
		if (digit == 'B')
			return 11;
		if (digit == 'C')
			return 12;
		if (digit == 'D')
			return 13;
		if (digit == 'E')
			return 14;
		if (digit == 'F')
			return 15;
		return (int) (digit - 48); // TODO: implement
    }
    
    public static int convertToBase10(String num, int originalBase)
    {
        int sum = 0;
        for (int i = 0; i < num.length(); i++)
        {
        	int number = charToValue(num.charAt(i));
        	int position = num.substring(i).length() - 1;
        	sum += number * Math.pow(originalBase, position);
        }
        return sum;
    }

    public static String convert(String num, int originalBase, int targetBase)
    {
        int numInBaseTen = convertToBase10(num, originalBase);
        return convertFromBase10(numInBaseTen , targetBase);
    }
}
