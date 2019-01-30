package p10_5;

public class Manager extends Employee
{
	private String department;
	public Manager(String name, double salary, String department)
	{
		super(name, salary);
		this.department = department;
	}
	
	public String toString()
	{
		return "Manager named " + getName() + " makes $" + getSalary() + " in the " + department + " department.";
	}
}
