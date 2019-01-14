package p9_9;

/**
 * Computes the average of a set of data values.
 */
public class DataSet
{
	private Comparable maximum, minimum;
	/**
	 * Constructs an data set with one (the first) element.
	 */
	public DataSet()
	{
		maximum = null;
		minimum = null;
	}

	/**
	 * Adds a data value to the data set.
	 * 
	 * @param x
	 *            a data value
	 */
	public void add(Comparable x)
	{
		if (maximum.compareTo(x) < 0)
			maximum = x;
		if (minimum.compareTo(x) > 0)
			minimum = x;
	}

	/**
	 * Gets the largest of the added data.
	 */
	public Comparable getMaximum()
	{
		return maximum;
	}
	
	public Comparable getMinimum()
	{
		return minimum;
	}
}