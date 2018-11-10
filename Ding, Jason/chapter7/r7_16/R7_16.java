package r7_16;

import java.util.Arrays;

public class R7_16 
{

	public static void main(String[] args) 
	{
		int[] arr = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] array = new int[] {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
		//a
		boolean isSameArray = true;
		if (arr.length != array.length)
			isSameArray = false;
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] != array[i])
				isSameArray = false;
		}
		System.out.println(isSameArray);
		//b
		for (int i = 0; i < arr.length; i++)
			array[i] = arr[i];
		System.out.println(Arrays.toString(array));
		//c
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = 0;
		}
		System.out.println(Arrays.toString(arr));
		//d or same as c
		arr = new int[10];
		System.out.println(Arrays.toString(arr));
	}

}
