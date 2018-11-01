package p6_5;

public class DataSet 
{
	private double sum, sumOfSquares;
	private int count;
	public DataSet()
	{
		sum = 0;
		sumOfSquares = 0;
		count = 0;
	}
	
	public void addValue(double x)
	{
		sum += x;
		count++;
		sumOfSquares += Math.pow(x, 2);
	}
	
	public double getStandardDeviation()
	{
		return Math.sqrt((sumOfSquares - Math.pow(sum, 2) / count) / (count - 1));
	}
	
	public int getCount()
	{
		return count;
	}
	
	public double getAverage()
	{
		return sum / count;
	}
}
