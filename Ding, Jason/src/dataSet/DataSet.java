package dataSet;

public class DataSet 
{
	private double dataSum, numberOfValues;
	public DataSet(double firstValue)
	{
		dataSum += firstValue;
		numberOfValues ++;
	}
	
	public DataSet()
	{
		dataSum = 0;
		numberOfValues = 0;
	}
	
	public void addValue(double newValue)
	{
		dataSum += newValue;
		numberOfValues ++;
	}
	
	public double getSum()
	{
		return dataSum;
	}
	
	public double getMean()
	{
		return dataSum / numberOfValues;
	}
}
