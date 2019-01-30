package p10_6;

public class Worker 
{
	private String name;
	private double salaryRate;
  
    public Worker(String name, double salaryRate)
    {
	    this.name = name;
	    this.salaryRate = salaryRate;
    }
  
    public String getName()
    {
	    return name;
    }
    
    public String toString()
    {
    	return name + " " + salaryRate;
    }
  
    public double getSalaryRate()
    {
    	return salaryRate;
    }
}
