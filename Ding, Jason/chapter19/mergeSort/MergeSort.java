package mergeSort;

public class MergeSort
{
	public static void sort(int[] a)
	{
		sort(a, 0, a.length - 1);
	}
	
	static void sort(int[] a, int low, int high)
	{
		if(low >= high)
			return;
		int mid = (low + high) / 2;
		sort(a, low, mid);
		sort(a, mid + 1, high);
		merge(a, low, mid, high);
	}

	static void merge(int[] a, int low, int mid, int high)
	{
		
	}
}
