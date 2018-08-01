package apCSA;

import junit.framework.TestCase;

public class TrailJUnitTests extends TestCase
{

	
	public void testIsLevelTrailSegment()
	{
		int[] arr = {100, 150, 105, 120, 90, 80, 50, 75, 75, 70, 80, 90, 100};
		Trail path = new Trail(arr);
		boolean expectedResult = false;
		boolean actualResult = path.isLevelTrailSegment(2, 12);
        assertTrue(actualResult == expectedResult);

        expectedResult = true;
        actualResult = path.isLevelTrailSegment(7, 10);
        assertTrue(actualResult == expectedResult);

        expectedResult = false;
        actualResult = path.isLevelTrailSegment(0, 5);
        assertTrue(actualResult == expectedResult);
	}
	
	public void testIsDifficult()
	{
		int arr[] = {100, 150, 105, 120, 90, 80, 50, 75, 75, 70, 80, 90, 100};
		Trail path = new Trail(arr);
		boolean expectedResult = true;
		boolean actualResult = path.isDifficult();
		assertTrue(actualResult == expectedResult);
		
		int array[] = {100, 150, 125, 120, 95, 80, 55, 75, 75, 70, 80, 90, 100};
		path = new Trail(array);
		expectedResult = false;
		actualResult = path.isDifficult();
		assertTrue(actualResult == expectedResult);
	}

}
