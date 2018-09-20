package p3_5;

public class Car 
{
	private double mpg, gasInTank;
	
	public Car(double mpg)
	{
		this.mpg = mpg;
	}
	
	public double getGasInTank()
	{
		return gasInTank;
	}
	
	public void addGas(double gas)
	{
		gasInTank += gas;
	}
	
	public void drive(double miles)
	{
		gasInTank -= miles / mpg;
	}
}
