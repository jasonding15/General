package p10_5;

public class Executive extends Manager
{
	public Executive(String name, double salary, String department)
	{
		super(name, salary, department);
	}
	
	public String toString()
	{
		return "The executive " + super.toString();
	}

}
