package algorithmWorkbenchChapter5;

public class Number5 
{
	public static void main(String[] args)
	{
		double result = 0, fraction, i, denominator;
		for (i = 1; i <= 30; i++ )
		{
			denominator = 31 - i;
			fraction = i / denominator;
			
			result += fraction;
		}
	System.out.println("Total: " + result);
	}

}
