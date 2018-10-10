package p4_18;

public class EasterCalculator 
{

	public static void main(String[] args) 
	{
		EasterSunday es = new EasterSunday(2019);
		System.out.println("Easter falls on " + es.getEasterSundayMonth() + " / " + es.getEasterSundayDay() + ".");
	}

}
