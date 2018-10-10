package week2QuizStart;

//import java.util.Arrays;

public class Quiz
{
    public static void main(String[] args)
    {
        // You may write any test code you wish here.
        // Your score will be based on the test code
        // in the QuizTest class.
    	
    		int arr[] = {-8};
//    	swapFirstLast(arr);
//    	System.out.println(Arrays.toString(arr));
//    	System.out.println(hasTwoAndFour(arr));
//    		System.out.println(moreEvens(arr));
    		System.out.println(onlyNegatives(arr));
    	
    	
    }
    
    /*
     * Swaps the first and last elements in arr.
     * arr will contain at least 1 element.
     */
    public static void swapFirstLast(int[] arr)
    {
        int firstElement = arr[0];
        int lastElement = arr[arr.length - 1];
        
        arr[0] = lastElement;
        arr[arr.length-1] = firstElement;
    }
    
    /*
     * Returns true if the number of even values in arr
     * exceeds the number of odd values, false otherwise.
     */
    public static boolean moreEvens(int[] arr)
    {
        	int evenCount = 0;
        	int oddCount = 0;
    		for (int i = 0; i < arr.length; i++)
        {
        		if (arr[i] % 2 == 0)
        			evenCount++;
        		if (arr[i] % 2 == 1)
        			oddCount++;
        }
    		if (evenCount > oddCount)
    			return true;
    	
    		return false; // TODO implement
    }
    
    /*
     * Returns true if arr contains both a 2 and a 4,
     * false otherwise.
     */
    public static boolean hasTwoAndFour(int[] arr)
    {
        boolean hasTwo = false;
        boolean hasFour = false;
        
        for(int i = 0; i < arr.length; i++)
        {
        		if (arr[i] == 2)
        			hasTwo = true;
        		if (arr[i] == 4)
        			hasFour = true;
        }
        if (hasTwo && hasFour)
        		return true;
    		return false; // TODO implement
    }
    
    /*
     * Returns true if arr contains only negative values.
     * Note: The method returns true for an empty array.
     */
    public static boolean onlyNegatives(int[] arr)
    {
        	if (arr.length == 0)
        		return true;
    		for (int i = 0; i < arr.length; i++)
        	{
        		if (arr[i] >= 0)
        			return false;
        	}
    		return true; // TODO implement
    }
}