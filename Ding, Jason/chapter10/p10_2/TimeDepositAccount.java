package p10_2;

public class TimeDepositAccount extends BankAccount
{
	public double interestRate;
	private int months;
	public static final double FEE = 140;
	public TimeDepositAccount(double initialBalance, double rate, int months)
	{
		super(initialBalance);
		interestRate = rate;
		this.months = months;
	}
	
	public void addInterest()
	{
		double interest = getBalance() * interestRate / 100;
		deposit(interest);
		months --;
	}
	
	public void withdraw(double amount)
	{
		if(months >0)
			balance -= (amount + FEE);
		else 
			balance -= amount;
	}
}
