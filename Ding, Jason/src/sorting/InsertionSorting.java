package sorting;

import java.util.Arrays;

public class InsertionSorting {

	public static void main(String[] args) 
	{
		int[] arr = {37, 32, 70, 15, 93, 40, 63, 3, 40, 63};
		sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void sort(int[] arr)
	{
		for(int i = 1; i < arr.length; i++)
		{
			int temp = arr[i];
			int j = i;
			while(j > 0 && temp < arr[j - 1])
			{
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = temp;
		}
	}
}
