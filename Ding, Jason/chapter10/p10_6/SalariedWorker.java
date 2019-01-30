package p10_6;

public class SalariedWorker extends Worker
{
	public SalariedWorker(String name, double salaryRate)
	{
		super(name, salaryRate);
	}
	
	public double computePay()
	{
		return super.getSalaryRate() * 40;
	}
}
