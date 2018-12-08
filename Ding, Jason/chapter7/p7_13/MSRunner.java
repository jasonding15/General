package p7_13;

import java.util.Arrays;

public class MSRunner 
{

	public static void main(String[] args) 
	{
		MagicSquare ms = new MagicSquare(5);
		for(int i = 0; i < ms.getGrid().length; i++)
		{
			System.out.println(Arrays.toString(ms.getGrid()[i]));
		}
	}

}
