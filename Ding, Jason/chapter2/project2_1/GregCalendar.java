package project2_1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregCalendar 
{

	public static void main(String[] args) 
	{
		GregorianCalendar date = new GregorianCalendar();
		
		System.out.println("Today is " + getWeekday(date) + ", " + getMonth(date) + " " + getDay(date) + "th, " + getYear(date) + ".");
		
		date.add(Calendar.DAY_OF_MONTH, 100);
		
		System.out.println("100 days from today is " + getWeekday(date) + ", " + getMonth(date) + " " + getDay(date) + "th, " + getYear(date) + ".");
		
		date = new GregorianCalendar(2003, Calendar.JULY, 15);
		
		System.out.println("My birthday was " + getWeekday(date) + ", " + getMonth(date) + " " + getDay(date) + "th, " + getYear(date) + ".");
		
		date.add(Calendar.DAY_OF_MONTH, 10000);
		
		System.out.println("The day I turn 10,000 days old is " + getWeekday(date) + ", " + getMonth(date) + " " + getDay(date) + "th, " + getYear(date) + ".");



	}
	
	public static String getWeekday(GregorianCalendar day)
	{
		int weekday = day.get(Calendar.DAY_OF_WEEK);
		String dayOfWeek = "";
		if(weekday == 1)
			dayOfWeek = "Sunday";
		else if(weekday == 2)
			dayOfWeek = "Monday";
		else if(weekday == 3)
			dayOfWeek = "Tuesday";
		else if(weekday == 4)
			dayOfWeek = "Wednesday";
		else if(weekday == 5)
			dayOfWeek = "Thursday";
		else if(weekday == 6)
			dayOfWeek = "Friday";
		else
			dayOfWeek = "Saturday";
		return dayOfWeek;
	}
	
	public static String getMonth(GregorianCalendar day)
	{
		int month = day.get(Calendar.MONTH);
		String monthOfYear = "";
		if(month == 0)
			monthOfYear = "January";
		if(month == 1)
			monthOfYear = "Feburary";
		if(month == 2)
			monthOfYear = "March";
		if(month == 3)
			monthOfYear = "April";
		if(month == 4)
			monthOfYear = "May";
		if(month == 5)
			monthOfYear = "June";
		if(month == 6)
			monthOfYear = "July";
		if(month == 7)
			monthOfYear = "August";
		if(month == 8)
			monthOfYear = "September";
		if(month == 9)
			monthOfYear = "October";
		if(month == 10)
			monthOfYear = "November";
		if(month == 11)
			monthOfYear = "December";
		
		return monthOfYear;

	}
	
	public static int getDay(GregorianCalendar day)
	{
		return day.get(Calendar.DAY_OF_MONTH);
	}
	
	public static int getYear(GregorianCalendar day)
	{
		return day.get(Calendar.YEAR);
	}


}
