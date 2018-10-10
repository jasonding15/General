package p4_5and6;

public class DataSet 
{
	private int sum, getCount, smallest, largest;
	/**
	 * creates a data set that can have integers added to it and 
	 * can calculate the average, sum of the values, and the smallest and largest value
	 */
	public DataSet()
	{
		sum = 0;
		getCount = 0;
		smallest = Integer.MAX_VALUE;
		largest = Integer.MIN_VALUE;
	}
	
	/**
	 * adds a value to the data set
	 * @param x the integer to be added
	 */
	public void addValue(int x)
	{
		sum += x;
		getCount++;
		if (x > largest)
			largest = x;
		if (x < smallest)
			smallest = x;
	}
	
	/**
	 * @return the sum of the integers in the data set
	 */
	public int getSum()
	{
		return sum;
	}
	
	/**
	 * @return the average of the values in the data set
	 */
	public double getAverage()
	{
		return sum * 1.0 / getCount;
	}
	
	/**
	 * @return the smallest value in the data set
	 */
	public int getSmallest()
	{
		return smallest;
	}
	
	/**
	 * @return the largest value in the data set
	 */
	public int getLargest()
	{
		return largest;
	}
}
