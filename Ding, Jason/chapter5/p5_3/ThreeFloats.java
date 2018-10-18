package p5_3;

public class ThreeFloats 
{
	
	private double n1;
	private double n2;
	private double n3;
	
	private double first;
	private double second;
	private double third;

	
	public ThreeFloats(double num1, double num2, double num3) 
	{
		this.n1 = num1;
		this.n2 = num2;
		this.n3 = num3;
	}
	
	public String getOrder() {
		sort();
		return third + ", " + second + ", " + first;
	}
	
	
	private void sort() 
	{
		if(n1 > n2 && n1 > n3)
			first = n1;
		else if(n2 > n1 && n2 > n3)
			first = n2;
		else
			first =n3;
		
		if((n1 > n2 || n1 > n2) && first != n1)
			second = n1;
		else if((n2 > n3 || n2 > n1) && first != n2)
			second = n2;
		else
			second = n3;
		if(first != n1 && second != n1)
			third = n1;
		else if (first != n2 && second != n2)
			third = n2;
		else
			third = n3;
	}
}

