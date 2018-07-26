package sorting;

public class BinarySearch {

	public static void main(String[] args) 
	{
		int[] arr = {3, 15, 32, 37, 40, 63, 63, 70, 93};
		System.out.println(binarySearch(arr, 12));
	}
	
	public static int binarySearch(int[] arr, int key)
	{
		int lowIndex = 0;
		int highIndex = arr.length - 1;
		
		while(lowIndex <= highIndex)
		{
			int mid = (highIndex + lowIndex) / 2;
			if ( key < arr[mid])
				highIndex = mid  - 1;
			else if (key > arr[mid])
				lowIndex = mid + 1;
			else
				return mid;
		}
		
		return -1;
	}
	
}
