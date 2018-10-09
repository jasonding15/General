package p4_18;

public class EasterSunday 
{
	private int year, month, day;
	public EasterSunday(int y)
	{
		year = y;
	}
	
	public int getEasterSundayMonth()
	{
		return month;
	}
	
	public int getEasterSundayDay()
	{
		return day;
	}
	
	private void calcEverything()
	{
		int a = year % 19;
		int b = year / 100;
		int c = year % 100;
	}
  
}
