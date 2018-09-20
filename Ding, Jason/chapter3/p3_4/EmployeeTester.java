package p3_4;

public class EmployeeTester 
{

	public static void main(String[] args) 
	{
		Employee harry = new Employee("Hacker, Harry", 50000);
		harry.raiseSalary(10); // Harry gets a 10% raise
		System.out.println(harry.getName() + " makes " + harry.getSalary() + " dollar(s) an hour.");
		
		Employee navin = new Employee("Navin", 10);
		navin.raiseSalary(50);
		System.out.println(navin.getSalary());
		
		Employee leon = new Employee("Leon", 1);
		leon.raiseSalary(1);
		System.out.println(leon.getName() + " makes " + leon.getSalary() + " dollars an hour.");
	}

}
