package programmingChallengesCh7;

public class CAV 
{
//	public CAVTester(int[] array, int number)
//	{
//		binarySearch(array, number);
//	}
	public static boolean binarySearch(int[] arr, int key)
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
				return true;
		}
		
		return false;
	}
	
}
