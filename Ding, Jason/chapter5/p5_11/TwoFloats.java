package p5_11;

public class TwoFloats
{

	private double num1;
	private double num2;
	
	public TwoFloats(double n1, double n2) 
	{
		num1 = n1;
		num2 = n2;
	}
	
	public boolean areEqual() 
	{
		double number1 = Math.round(num1 * 100) / 100.0;
		double number2 = Math.round(num2 * 100) / 100.0;
		
		if(number1 == number2)
			return true;
		else
			return false;
	}
	
	public boolean differBy() 
	{
		if(Math.round(Math.abs(num1 - num2)) / 100.0 <= 0.01)
			return true;
		else
			return false;
	}
}
