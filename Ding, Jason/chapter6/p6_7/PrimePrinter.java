package p6_7;

import java.util.Scanner;

public class PrimePrinter 
{

	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		System.out.print("Input number: ");
		PrimeGenerator pg = new PrimeGenerator(input.nextInt());
		int nextPrime = pg.nextPrime();
		if (nextPrime == -1)
			System.out.println("Number has no prime numbers less than it. ");
		while(nextPrime >= 0)
		{
			System.out.println(nextPrime);
			nextPrime = pg.nextPrime();
		}
		
		input.close();
	}

}
