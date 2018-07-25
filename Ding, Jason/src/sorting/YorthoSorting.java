package sorting;

import java.util.Arrays;

public class YorthoSorting {

	public static void main(String[] args) 
	{
		int[] arr = {2, 21, 3, 4, 5, 2, 18, 19};
		sort(arr);
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void sort (int[] arr)
	{
		/*int indexFromEnd
		 *int biggestNum
		 * 
		 * loop through the array keeping track of the biggest number
		 * swap the biggest number with the last number
		 * exclude the last 
		 */
		
		int biggestNum = arr[0];
		int bigNumPosition = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			biggestNum = arr[0];
			bigNumPosition = 0;
			
			for(int a = 0; a < arr.length - i; a++)
			{
				if (arr[a] > biggestNum)
				{	
					biggestNum = arr[a];
					bigNumPosition = a;
				}
			}
			
			int otherPos = arr.length - i - 1;
			swap (arr, bigNumPosition, otherPos);
			
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
