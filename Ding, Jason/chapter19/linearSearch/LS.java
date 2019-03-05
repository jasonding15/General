package linearSearch;

public class LS {

	public static void main(String[] args) 
	{
		int[] arr = new int[] {0, 1, 2, 3, 4};
		System.out.println(recursively(arr, 12));
		System.out.println(iteratively(arr, -1));

	}
	
	public static int recursively(int[] arr, int key)
	{
		return recursively(arr, key, 0);
	}
	
	private static int recursively(int[] arr, int key, int i)
	{
		if (i >= arr.length)
			return -1;
		if (arr[i] == key)
			return i;
		return recursively(arr, key, i + 1);
	}
	
	public static int iteratively(int[] arr, int key)
	{
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] == key)
				return i;
		}
		return -1;
	}

}
