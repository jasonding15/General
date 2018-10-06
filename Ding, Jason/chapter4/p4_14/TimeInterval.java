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
	
	public int getHours()
	{
		return getTotalTime() / 60;
	}
	
	public int getMinutes()
	{
		return getTotalTime() % 60;
	}
	
	private int getTotalTime()
	{
		int timeDifference = convertToMinutes(time2) - convertToMinutes(time1);
		if(timeDifference <= 0)
			timeDifference += convertToMinutes("2400");
		return timeDifference;
	}
	
	private int convertToMinutes(String time)
	{
		int hours = Integer.parseInt(time.substring(0, 2));
		int minutes = Integer.parseInt(time.substring(2,4));
		hours *= 60;
		return hours + minutes;
	}
}
