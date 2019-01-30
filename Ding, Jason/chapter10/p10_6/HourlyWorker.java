package p10_6;

public class HourlyWorker extends Worker
{
	public HourlyWorker(String name, double rate)
	{
		super(name, rate);
	}
	
	public double computePay(int hours)
	{
		double pay = 0;
		if (hours <= 40)
			pay = hours * super.getSalaryRate();
		else
		{
			int extra = hours - 40;
			pay += extra * super.getSalaryRate() * 1.5 + 40 * super.getSalaryRate();
		}
		return pay;
	}
}
