package p10_5;

public class Employee 
{
	private String name;
	private double salary;
	
	public Employee(String name, double salary)
	{
		this.name = name;
		this.salary = salary;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public String toString()
	{
		return "The employee " + name + " makes $" + salary;
	}
}
