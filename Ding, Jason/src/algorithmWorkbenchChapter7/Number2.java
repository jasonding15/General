package algorithmWorkbenchChapter7;

import java.util.Arrays;

public class Number2 {

	public static void main(String[] args) 
	{
		int[] numberArray1 = new int[100];
		int[] numberArray2 = new int[100];
		for(int i = 0; i < numberArray1.length; i++)
		{
			numberArray1[i] = (int) (Math.random() * 101);
		}
		
		System.out.println(Arrays.toString(numberArray1));
		
		for(int i = 0; i < numberArray1.length; i++)
		{
			numberArray2[i] = numberArray1[i];
		}
		System.out.println(Arrays.toString(numberArray2));
	}

}
