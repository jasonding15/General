package p5_13;

public class PayCheck 
{
	private double hourlyWage;
	private double hoursWorked;
	
	public PayCheck(double wage, double work) 
	{
		hourlyWage = wage;
		hoursWorked = work;
	}
	
	public double getPay() 
	{
		if(hoursWorked > 40) 
		{
			double overtime = hoursWorked - 40;
			double paycheck = (overtime * hourlyWage) * 1.5;
			paycheck = paycheck + ((hoursWorked - overtime) * hourlyWage);
			return paycheck;
		}
		else
			return (hourlyWage * hoursWorked);
	}
}


