package r7_10;

import java.util.Arrays;

public class R7_10 
{

	public static void main(String[] args) 
	{
		int[] arr = new int[20];
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = (int) Math.pow(i + 1, 2);
		}
		System.out.println(Arrays.toString(arr));
		// elements beyond those I filled are 0s
	}

}
