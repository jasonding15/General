package p4_18;

public class EasterSunday 
{
	private int year, month, day;
	/**
	 * constructs a program that calculates the day of the specified year easter is on
	 * @param y the year that easter's date would be calculated on
	 */
	public EasterSunday(int y)
	{
		year = y;
	}
	
	/**
	 * @return the month as an integer of the year that Easter Sunday is on
	 */
	public int getEasterSundayMonth()
	{
		calcEverything();
		return month;
	}
	
	/**
	 * @return the day as an integer of the month that Easter Sunday is on
	 */
	public int getEasterSundayDay()
	{
		calcEverything();
		return day;
	}
	
	/**
	 * calculates the month and day Easter Sunday is on of the specified year
	 */
	private void calcEverything()
	{
		int a = year % 19;
		int b = year / 100;
		int c = year % 100;
		int d = b / 4;
		int e = b % 4;
		int g = (b * 8 + 13) / 25;
		int h = (19 * a + b - d - g + 15) % 30;
		int j = c / 4;
		int k = c % 4;
		int m = (a + 11 * h) / 319;
		int r = (2 * e + 2 * j - k - h + m + 32) % 7;
		month = (h - m + r + 90) / 25;
		day = (h - m + r + month + 19) % 32;
	}
  
}
