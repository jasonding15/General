package p4_5and6;

public class DataSet 
{
	private int sum, getCount, smallest, largest;
	public DataSet()
	{
		sum = 0;
		getCount = 0;
		smallest = Integer.MAX_VALUE;
		largest = Integer.MIN_VALUE;
	}
	
	public void addValue(int x)
	{
		sum += x;
		getCount++;
		if (x > largest)
			largest = x;
		if (x < smallest)
			smallest = x;
	}
	
	public int getSum()
	{
		return sum;
	}
	
	public double getAverage()
	{
		return sum * 1.0 / getCount;
	}
	
	public int getSmallest()
	{
		return smallest;
	}
	
	public int getLargest()
	{
		return largest;
	}
}
