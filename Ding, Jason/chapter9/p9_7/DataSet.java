package p9_7;

import p9_5.Measurer;

/**
 * Computes the average of a set of data values.
 */
public class DataSet<T>
{
	private double sum;
	private T maximum, minimum;
	private int count;
	private Measurer<T> aMeasurer;

	/**
	 * Constructs an empty data set.
	 */
	public DataSet(Measurer<T> measurer)
	{
		sum = 0;
		count = 0;
		maximum = null;
		minimum = null;
		aMeasurer = measurer;
	}
	
	public DataSet()
	{
		sum = 0;
		count = 0;
		maximum = null;
		minimum = null;
		aMeasurer = (Measurer<T>) new MeasurableMeasurer();
	}

	/**
	 * Adds a data value to the data set.
	 * 
	 * @param x
	 *            a data value
	 */
	public void add(T x)
	{
		sum = sum + aMeasurer.measure(x);
		if (count == 0 || aMeasurer.measure(maximum) < aMeasurer.measure(x))
			maximum = x;
		if (count == 0 || aMeasurer.measure(minimum) > aMeasurer.measure(x))
			minimum = x;
		 count++;
	}

	/**
	 * Gets the average of the added data.
	 * 
	 * @return the average or 0 if no data has been added
	 */
	public double getAverage()
	{
		if (count == 0)
			return 0;
		else
			return sum / count;
	}

	/**
	 * Gets the largest of the added data.
	 * 
	 * @return the maximum or 0 if no data has been added
	 */
	public T getMaximum()
	{
		return maximum;
	}
	
	public T getMinimum()
	{
		return minimum;
	}
}