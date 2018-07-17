package montyHall;

public class PlayYourself 
{

	
	public static void main(String[] args) 
	{
		playXRounds(10000000);
	}

	private static int playOneRound() 
	{
		int prizeDoor = chooseRandomDoor();
		
		int initialPick = getInitialPick();
		
		int otherDoor = openOtherDoor(initialPick, prizeDoor);

		int finalDecision = stayOrSwitch(initialPick, otherDoor);
		
		if(initialPick == finalDecision && finalDecision == prizeDoor)
			return 1;
		
		if (initialPick == finalDecision && finalDecision != prizeDoor)
			return 2;
		
		if (initialPick != finalDecision && finalDecision == prizeDoor)
			return 3;
		
		if (initialPick != finalDecision && finalDecision != prizeDoor)
			return 4;
		
		return -1;
	}
	
	public static int chooseRandomDoor() 
	{
		int r = (int) (Math.random() * 3 + 1);
		return r;
	}
	
	public static int getInitialPick()
	{
		int initialPick = chooseRandomDoor();
		
		return initialPick;
	}
	
	public static int openOtherDoor(int initialPick, int prizeDoor)
	{
		int otherDoor = chooseRandomDoor();
		if (initialPick == prizeDoor)
		{
			while (otherDoor == prizeDoor)
				otherDoor = chooseRandomDoor();
		}
		else 
		{
			while(otherDoor == initialPick || otherDoor == prizeDoor)
				otherDoor = chooseRandomDoor();
		}
		return otherDoor;
	}
	
	public static int stayOrSwitch(int initialPick, int otherDoor) 
	{
		int finalDecision = chooseRandomDoor();
		
		int r = (int) (Math.random() * 2 + 1);		
		
		if (r == 1)
			finalDecision = initialPick;
		else  
		{
			while (finalDecision == initialPick || finalDecision == otherDoor)
				finalDecision = chooseRandomDoor();
		}
		return finalDecision;
	}
		
	public static void playXRounds(int numberOfRounds)
	{
		double stayCountWins = 0;
		double stayCountTotal = 0;
		double switchCountWins = 0;
		double switchCountTotal = 0;
	
		for (int x = 1; x <= numberOfRounds; x++)
		{
			int result = playOneRound();
			
			if (result == 1)
			{
				stayCountWins ++;
				stayCountTotal++;
			}
			
			else if (result == 2)
				stayCountTotal++;
			
			else if (result == 3)
			{
				switchCountWins++;
				switchCountTotal++;
			}
			
			else if(result == 4)
				switchCountTotal++;
			
		}		
		
		
		
		double stayWinPercentage = stayCountWins / stayCountTotal;
		double switchWinPercentage = switchCountWins / switchCountTotal;
		
		
	
//		System.out.println("Thank you for playing! Enjoy your prize(s)!");
		System.out.println("Win percentage after staying: " + stayCountWins + " / " + stayCountTotal + ". This is " + stayWinPercentage + ".");
		System.out.println("Win percentage after switching: " + switchCountWins + " / " + switchCountTotal + ".This is " + switchWinPercentage + ".");
		
	}
}	
