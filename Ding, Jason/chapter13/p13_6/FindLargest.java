package p13_6;

public class FindLargest
{
	public static void main(String[] args)
	{
		int[] array = {4,1,7,1,0,9,7};
		System.out.println(findLargest(array));
	}
	
	public static int findLargest(int[] a)
	{
		return findLargest(a, a.length - 1);
	}
	
	private static int findLargest(int[] a, int start)
	{
		if (a.length == 0 || start <= 0)
			return 0;
		if (a.length == 1)
			return a[0];
		if (a[start] > findLargest(a, start - 1))
			return a[start];
		else 
			return findLargest(a, start - 1);
	}
}
