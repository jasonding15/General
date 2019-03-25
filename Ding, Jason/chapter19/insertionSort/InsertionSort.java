package insertionSort;

public class InsertionSort
{
    public static void main(String args[])
    {
    		int[] arr = new int[] {6, 5, 4, 3};
    		sortWithBinarySearch(arr);
    		System.out.println(arr);
    }
	public static void sort(int[] x)
    {
        for (int i = 1; i < x.length; i++)
        {
        		int index = i;
        		int temp = x[i];
        		while (index > 0 && temp < x[index - 1] )
        		{
    				x[index] = x[index - 1];
        			index--;
        		}
        		x[index] = temp;
        }
    }
    
    public static void recursiveSort(int[] x)
    {
        
    }

    public static void sortWithBinarySearch(int[] x)
    {
    	  for (int i = 1; i < x.length; i++)
          {
          		int n = binarySearch(x, x[i], 0, i);
          		int index = i;
          		while (index >= n)
          		{
      				x[index] = x[index - 1];
          			index--;
          		}
          		x[index] = x[i];
          }
    }

    public static int binarySearch(int[] x, int key)
    {
        return binarySearch(x, key, 0, x.length - 1);
    }

    private static int binarySearch(int[] x, int key, int start, int end)
    {
    		if (start > end)
    			return start * -1 - 1;
    		int mid = (start + end) / 2;
    		if (x[mid] == key)
    			return mid;
    		if (x[mid] > key)
    			return binarySearch(x, key, start, end - 1);
    		else
    			return binarySearch(x, key, start + 1, end);
    }

    // recursive variant sorts x[start] ... x[x.length - 1]
    private static void sort(int[] x, int start)
    {
        
    }

    // inserts value into correct position in x[0]...x[start]
    private static void insert(int[] x, int value, int start)
    {
    		
    }
}
