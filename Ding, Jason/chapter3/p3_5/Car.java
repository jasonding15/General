package p3_5;

/**
 * represents a car that has fuel and can drive 
 * @author Jason Ding
 */
public class Car 
{
	private double mpg, gasInTank;
	
	/**
	 * constructs a car object with a specified efficiency
	 * @param mpg is the amount of miles the car can travel per gallon of gas
	 */
	public Car(double mpg)
	{
		this.mpg = mpg;
	}
	
	/**
	 * @return the amoun of gas in the tank
	 */
	public double getGasInTank()
	{
		return gasInTank;
	}
	
	/**
	 * adds gas to tank
	 * @param gas is the amount of gas added to the tank
	 */
	public void addGas(double gas)
	{
		gasInTank += gas;
	}
	
	/**
	 * calculates the gas left after driving a set amount of miles
	 * @param miles is the amount of miles the car traveled
	 */
	public void drive(double miles)
	{
		gasInTank -= miles / mpg;
	}
}
