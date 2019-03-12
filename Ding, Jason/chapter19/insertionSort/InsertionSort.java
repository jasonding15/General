package insertionSort;

public class InsertionSort
{
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
        
    }

    public static int binarySearch(int[] x, int key)
    {
        return -1;
    }

    private static int binarySearch(int[] x, int key, int start, int end)
    {
        return -1;
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
