package p6_6;

public class FactorGenerator 
{
	private int numberToFactor, nextFactor;
	public FactorGenerator(int numberToFactor)
	{
		this.numberToFactor = numberToFactor;
		nextFactor = 2;
	}
	
	/**
	 * sets the numberToFactor to it divided by nextFactor
	 * @return the number that was divided into the numberToFactor
	 */
	public int nextFactor()
	{
		boolean canFactor = hasMoreFactors();
		if (canFactor)
		{
			numberToFactor /= nextFactor;
			return nextFactor;
		}
		return -1;
	}
	
	/**
	 * determines if the numberToFactor has more prime factors
	 * sets nextFactor to the next prime factor
	 * @return if the numberToFactor has more prime factors
	 */
	public boolean hasMoreFactors()
	{
		while(nextFactor <= numberToFactor)
		{
			if (isPrime(nextFactor) && numberToFactor % nextFactor == 0)
				return true;
			nextFactor ++;
		}
		return false;
	}
	
	private boolean isPrime(int x)
	{
		if (x == 2)
			return true;
		for (int i = 2; i < x; i++)
		{
			if (x % i == 0)
				return false;
		}
		return true;
	}
}
