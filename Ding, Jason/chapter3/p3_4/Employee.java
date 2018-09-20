package p3_4;

public class Employee 
{
	private String employeeName;
	private double salary;
	public Employee(String employeeName, double salary)
	{
		this.employeeName = employeeName;
		this.salary = salary;
	}
	public String getName()
	{
		return employeeName;
	}
	public double getSalary()
	{
		return salary;
	}
	
	public void raiseSalary(double byPercent)
	{
		salary += salary * byPercent / 100.0;
	}
}
