package p3_4;

/**
 * able to keep track of employees name and manage his salary
 * @author Jason Ding
 *
 */
public class Employee 
{
	private String employeeName;
	private double salary;
	
	/**
	 * creates a new tab on an employee
	 * @param employeeName is the name of the employee
	 * @param salary is the yearly income of the employee
	 */
	public Employee(String employeeName, double salary)
	{
		this.employeeName = employeeName;
		this.salary = salary;
	}
	
	/**
	 * @return the employee's name
	 */
	public String getName()
	{
		return employeeName;
	}
	
	/**
	 * @return the employee's salary
	 */
	public double getSalary()
	{
		return salary;
	}
	
	/**
	 * gives the employee a raise
	 * @param byPercent percentage to raise the employee's annual income
	 */
	public void raiseSalary(double byPercent)
	{
		salary += salary * byPercent / 100.0;
	}
}
