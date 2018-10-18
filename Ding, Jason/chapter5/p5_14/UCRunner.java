package p5_14;

import java.util.Scanner;

public class UCRunner 
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Convert from:");
		String fromUnit = in.nextLine();
		
		System.out.print("Convert to: ");
		String toUnit = in.nextLine();
		
		UnitConverter from = new UnitConverter(fromUnit);
		UnitConverter to = new UnitConverter(toUnit);
		
		System.out.print("Value: ");
		double val = in.nextDouble();
		
		double meters = from.toMeters(val);
		double converted = to.fromMeters(meters);
		in.close();

		System.out.println("Converted Unit in specified Units: " + converted);
	}

}

