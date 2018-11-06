package r7_8;

import java.util.Arrays;

public class R7_8 
{

	public static void main(String[] args) 
	{
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = (int) (Math.random() * 99 + 1);
		}
		System.out.println(Arrays.toString(arr));
	}

}
