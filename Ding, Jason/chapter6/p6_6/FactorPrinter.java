package p6_6;

import java.util.Scanner;

public class FactorPrinter 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Input number: ");
		FactorGenerator fg = new FactorGenerator(input.nextInt());
		int nextPrime = fg.nextFactor();
		if (nextPrime == -1)
			System.out.println("Number is prime. ");
		while(nextPrime >= 0)
		{
			System.out.println(nextPrime);
			nextPrime = fg.nextFactor();
		}
		
		input.close();
	}

}
