package p6_7;

import java.util.Scanner;

public class PrimePrinter 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Input number: ");
		PrimeGenerator pg = new PrimeGenerator(input.nextInt());
		input.close();
		while(pg.nextPrime() >= 0)
			System.out.println(pg.nextPrime());
	}

}
