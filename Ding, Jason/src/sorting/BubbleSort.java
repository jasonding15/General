package sorting;

import java.util.Arrays;

public class BubbleSort 
{
	
	public static void main(String[] args) 
	{
		int[] arr = {71, 86, 79, 36, 78, 35, 75, 86, 24, 11};
//		swap (arr, 1, 4);
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void sort (int[] arr)
	{
		boolean swapped = true;
		
		while (swapped)
		{
			swapped = false;
			for(int i = 0; i < arr.length -1; i++)
			{
				if(arr[i] > arr[i + 1])
				{
					swap (arr, i, i + 1);
					swapped = true;
				}
			}
		}
		
	}
	
	private static void swap (int[] arr, int i, int j)
	{
		int oldJay = arr[j];
		int oldEye = arr[i];
		
		arr[j] = oldEye;
		arr[i] = oldJay;
	}

}
