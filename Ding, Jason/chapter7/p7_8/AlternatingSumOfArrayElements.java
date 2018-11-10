package p7_8;

public class AlternatingSumOfArrayElements 
{

	public static void main(String[] args) 
	{
		int[] arr = new int[] {1, 4, 9, 16, 9, 7, 4, 9, 11};
		System.out.println(computeAlternatingSum(arr));
	}
	
	public static int computeAlternatingSum(int[] arr)
	{
		int sum = 0; 
		for (int i = 0; i < arr.length; i++)
		{
			if (i % 2 == 0)
				sum += arr[i];
			else
				sum -= arr[i];
		}
		return sum;
	}
}
