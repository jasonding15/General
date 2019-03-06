package selectionSort;

public class SelectionSort
{
	
	public static void main(String[] args)
	{
		int[] arr = new int[] {-4, -1, -2, -10};
		System.out.println(indexOfMin(arr, 0));
	}
	public static void sort(int[] x)
    {
    		for(int i = 0; i < x.length; i++)
    		{
    			int smallest = x[i];
    			int index = i;
    			for(int a = i; a < x.length; a++)
    			{
    				if (x[a] < smallest)
    				{
    					smallest = x[a];
    					index = a;
    				}
    			}
    			swap(x, i, index);
    		}
//		sort(x, 0);
    }
    
    private static void swap(int[] x, int i, int j)
    {
    		int temp = x[i];
    		x[i] = x[j];
    		x[j] = temp;
    }
    
    // recursive variant sorts x[start] ... x[x.length - 1]
    private static void sort(int[] x, int start)
    {
    		if (start == x.length)
    			return;
    		
    }
    
    private static int indexOfMin(int[] x, int start)
    {
    		if (start == x.length)
    			return start - 1;
    		if (x[start] < x[indexOfMin(x, start + 1)])
    			return start;
    		return indexOfMin(x, start + 1);    		
    }
}