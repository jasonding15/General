package p3_5;

public class CarTester 
{

	public static void main(String[] args) 
	{
		Car lambo = new Car(12);
		lambo.addGas(23.8);
		lambo.drive(100);
		System.out.println("Gas left: " + lambo.getGasInTank() + " gallons.");
	}

}
