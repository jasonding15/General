package p6_7;

public class PrimeGenerator 
{
	public int prime, number;
	public PrimeGenerator(int number)
	{
		this.number = number;
		prime = 2;
	}
	
	public int nextPrime()
	{
		for( int i = prime + 1; i < number; i++)
		{
			if (isPrime(i))
			{
				prime = i;
				return i;
			}
		}
		return -1;
	}
	
	private boolean isPrime(int x)
	{
		for (int i = 2; i < x; i++)
		{
			if (x % i == 0)
				return false;
		}
		return true;
	}
}
