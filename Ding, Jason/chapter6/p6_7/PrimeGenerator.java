package p6_7;

public class PrimeGenerator 
{
	public int number, lastPrime;
	public PrimeGenerator(int number)
	{
		this.number = number;
		lastPrime = 1;
	}
	
	public int nextPrime()
	{
		for( int i = lastPrime + 1; i < number; i++)
		{
			if (isPrime(i))
			{
				lastPrime = i;
				return i;
			}
		}
		return -1;
	}
	
	public boolean isPrime(int x)
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
