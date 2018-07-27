package week2QuizStart;

import junit.framework.TestCase;

public class QuizTest extends TestCase
{
    public void testSwapFirstLast()
    {
        int[] values = new int[] {4, 5, 6};
        
        Quiz.swapFirstLast(values);
        int[] expectedResult = new int[] {6, 5, 4};
        
        assertTrue(arraysEqual(values, expectedResult));
        
        
        values = new int[] {4, 5, 6, 9, 3};
        
        Quiz.swapFirstLast(values);
        expectedResult = new int[] {3, 5, 6, 9, 4};
        
        assertTrue(arraysEqual(values, expectedResult));
        
        
        values = new int[] {4, 5};
        
        Quiz.swapFirstLast(values);
        expectedResult = new int[] {5, 4};
        
        assertTrue(arraysEqual(values, expectedResult));
        
        
        values = new int[] {4};
        
        Quiz.swapFirstLast(values);
        expectedResult = new int[] {4};
        
        assertTrue(arraysEqual(values, expectedResult));
    }
    
    public void testMoreEvens()
    {
        int[] values = new int[] {4, 5, 6};
        boolean expectedResult = true;
        boolean actualResult = Quiz.moreEvens(values);
        assertTrue(actualResult == expectedResult);
        
        values = new int[] {4, 5, 3};
        expectedResult = false;
        actualResult = Quiz.moreEvens(values);
        assertTrue(actualResult == expectedResult);
        
        values = new int[] {4, 5, 3, 6};
        expectedResult = false;
        actualResult = Quiz.moreEvens(values);
        assertTrue(actualResult == expectedResult);
        
        values = new int[] {4, 6, 12, 14};
        expectedResult = true;
        actualResult = Quiz.moreEvens(values);
        assertTrue(actualResult == expectedResult);
        
        values = new int[] {5, 3, 7, 1};
        expectedResult = false;
        actualResult = Quiz.moreEvens(values);
        assertTrue(actualResult == expectedResult);
        
        values = new int[] {};
        expectedResult = false;
        actualResult = Quiz.moreEvens(values);
        assertTrue(actualResult == expectedResult);
        
        values = new int[] {1};
        expectedResult = false;
        actualResult = Quiz.moreEvens(values);
        assertTrue(actualResult == expectedResult);
        
        values = new int[] {4};
        expectedResult = true;
        actualResult = Quiz.moreEvens(values);
        assertTrue(actualResult == expectedResult);
    }
    
    public void testHasTwoAndFour()
    {
        int[] values = new int[]{7, 3, 4, 6, 2, 8};
        boolean expectedResult = true;
        boolean actualResult = Quiz.hasTwoAndFour(values);
        assertTrue(expectedResult == actualResult);
        
        values = new int[]{7, 3, 9, 6, 11, 8};
        expectedResult = false;
        actualResult = Quiz.hasTwoAndFour(values);
        assertTrue(expectedResult == actualResult);
        
        values = new int[]{7, 3, 2, 6, 11, 8};
        expectedResult = false;
        actualResult = Quiz.hasTwoAndFour(values);
        assertTrue(expectedResult == actualResult);
        
        values = new int[]{7, 3, 0, 6, 4, 8};
        expectedResult = false;
        actualResult = Quiz.hasTwoAndFour(values);
        assertTrue(expectedResult == actualResult);
        
        values = new int[]{7};
        expectedResult = false;
        actualResult = Quiz.hasTwoAndFour(values);
        assertTrue(expectedResult == actualResult);
        
        values = new int[]{4};
        expectedResult = false;
        actualResult = Quiz.hasTwoAndFour(values);
        assertTrue(expectedResult == actualResult);
        
        values = new int[]{};
        expectedResult = false;
        actualResult = Quiz.hasTwoAndFour(values);
        assertTrue(expectedResult == actualResult);
    }

    public void testOnlyNegatives()
    {
        int[] values = new int[]{7, 3, 4, 6, 2, 8};
        boolean expectedResult = false;
        boolean actualResult = Quiz.onlyNegatives(values);
        assertTrue(expectedResult == actualResult);
        
        values = new int[]{-7, -3, -9, -6, -11, -8};
        expectedResult = true;
        actualResult = Quiz.onlyNegatives(values);
        assertTrue(expectedResult == actualResult);
        
        values = new int[]{-7, -3, 9, -6, -11, 8};
        expectedResult = false;
        actualResult = Quiz.onlyNegatives(values);
        assertTrue(expectedResult == actualResult);
        
        values = new int[]{7, 3, -9, 6, 11, -8};
        expectedResult = false;
        actualResult = Quiz.onlyNegatives(values);
        assertTrue(expectedResult == actualResult);
        
        values = new int[]{7};
        expectedResult = false;
        actualResult = Quiz.onlyNegatives(values);
        assertTrue(expectedResult == actualResult);
        
        values = new int[]{-7};
        expectedResult = true;
        actualResult = Quiz.onlyNegatives(values);
        assertTrue(expectedResult == actualResult);
        
        values = new int[]{};
        expectedResult = true;
        actualResult = Quiz.onlyNegatives(values);
        assertTrue(expectedResult == actualResult);
    }
    
    private static boolean arraysEqual(int[] arr1, int[] arr2)
    {
        if(arr1.length != arr2.length)
            return false;
        
        for(int i = 0; i < arr1.length; i++)
            if(arr1[i] != arr2[i])
                return false;
        
        return true;
    }
}