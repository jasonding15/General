package p4_14;

public class TimeInterval 
{
	private String time1, time2;
	
	/**
	 * returns the time between two military times
	 * @param time1 the first time
	 * @param time2 the latter time
	 */
	public TimeInterval(String time1, String time2)
	{
		this.time1 = time1;
		this.time2 = time2;
	}
	
	/**
	 * @return the hours difference between the two times
	 */
	public int getHours()
	{
		return getTotalDifference() / 60;
	}
	
	/**
	 * @return the minutes difference between the two times
	 */
	public int getMinutes()
	{
		return getTotalDifference() % 60;
	}
	
	/**
	 * @return the total minutes difference between the two times
	 */
	private int getTotalDifference()
	{
		int timeDifference = convertToMinutes(time2) - convertToMinutes(time1);
		if(timeDifference <= 0)
			timeDifference += convertToMinutes("2400");
		return timeDifference;
	}
	
	/**
	 * calculates the total time in minutes for a military time
	 * @param time is the military time to be converted
	 * @return the total minutes in the time
	 */
	private int convertToMinutes(String time)
	{
		int hours = Integer.parseInt(time.substring(0, 2));
		int minutes = Integer.parseInt(time.substring(2,4));
		hours *= 60;
		return hours + minutes;
	}
}
