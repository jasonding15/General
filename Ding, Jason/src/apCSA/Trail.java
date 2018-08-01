package apCSA;

public class Trail 
{
	private int[] markers;
	
	public Trail(int [] markrs)
	{
		markers = markrs;
	}
	
	public boolean isLevelTrailSegment(int start, int end)
	{
		int tallestPoint = markers[start];
		int lowestPoint = markers[start];
		for(int i = start; i <= end; i++)
		{
			if (markers[i] > tallestPoint)
				tallestPoint = markers[i];
			if (markers[i] < lowestPoint)
				lowestPoint = markers[i];
		}
		if (tallestPoint - lowestPoint > 10)
			return false;
		return true;
	}
	
	public boolean isDifficult()
	{
		int difficultCount = 0;
		for (int i = 0; i < markers.length - 1; i++)
		{
			int difference = markers[i] - markers[i + 1];
			if (Math.abs(difference) >= 30)
				difficultCount++;
		}
		
		if (difficultCount >= 3)
			return true;
		return false;
	}
}
