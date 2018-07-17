package montyHall;

import java.util.Scanner;

public class TextBased 
{
	private static Scanner fromKeyboard = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		printInstructions();
		playUntilQuit();
//		playOneRound();
	}

	private static int playOneRound() 
	{
		int prizeDoor = chooseRandomDoor();
		
		int initialPick = getInitialPick();
		
		int otherDoor = openOtherDoor(initialPick, prizeDoor);

		int finalDecision = stayOrSwitch(initialPick, otherDoor);

		revealPrize(finalDecision, prizeDoor);
		
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
	
	public static void printInstructions()
	{
		System.out.println("WELCOME to the Monty Hall Game!");
		System.out.println("Behind one of these three doors is a marvelous prize!");
		System.out.println("Behind the other two... goats!");
		System.out.println("");
	}
	
	public static int chooseRandomDoor() 
	{
		int r = (int) (Math.random() * 3 + 1);
		return r;
	}
	
	public static int getInitialPick()
	{
		System.out.print("Pick a door, any door! (Door 1, 2, or 3): ");
		int initialPick = fromKeyboard.nextInt();
		fromKeyboard.nextLine();
		
		while(initialPick < 1 || initialPick > 3)
		{
			System.out.print("What do you think this is? A GAME??? \nPlease act professionally and comply with our quite simple request of choosing either door 1, door 2, or door 3: ");
			initialPick = fromKeyboard.nextInt();
			fromKeyboard.nextLine();
		}
		
		
		System.out.println("Door " + initialPick + ", GREAT pick!");
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
		
		System.out.println("");
		System.out.print("Behind door " + otherDoor + " is a goat. Do you want to switch doors? Last chance! (enter 'yes' or 'no'): ");
		String decision = fromKeyboard.nextLine();
		decision = decision.toLowerCase();
		
		while (! decision.equals("no") && ! decision.equals("yes"))
			{
				System.out.print("REALLY? C'mon man, just enter either 'yes' or 'no': ");
				decision = fromKeyboard.nextLine();
				decision = decision.toLowerCase();				
			}
		
		if (decision.equals("no"))
			finalDecision = initialPick;
		else  
		{
			while (finalDecision == initialPick || finalDecision == otherDoor)
				finalDecision = chooseRandomDoor();
		}
		System.out.println("Your final pick is door " + finalDecision + ". Fingers crossed!");
		return finalDecision;
	}
	
	public static void revealPrize(int finalDecision, int prizeDoor)
	{
		System.out.println("");
		System.out.println("Lets see what is behind door " + finalDecision + "!");
		if (finalDecision == prizeDoor)
			System.out.println("*opens door " + finalDecision + "* You have won a new car! Congratulations!");
		else 
			System.out.println("*opens door " + finalDecision + "* YOU GOT a goat. Enjoy your goat, and better luck next time.");
	}
	
	public static void playUntilQuit()
	{
		double stayCountWins = 0;
		double stayCountTotal = 0;
		double switchCountWins = 0;
		double switchCountTotal = 0;
		
		String playAgain = "yes";
		while(playAgain.equals("yes"))
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
			
			System.out.print("Would you like to play again? (yes/no): ");
			playAgain = fromKeyboard.nextLine();
			playAgain= playAgain.toLowerCase();
			System.out.println();
		}		
		
		
		
		double stayWinPercentage = stayCountWins / stayCountTotal;
		double switchWinPercentage = switchCountWins / switchCountTotal;
		
		
		while (! playAgain.equals("no") && ! playAgain.equals("yes"))
		{
			System.out.print("REALLY? C'mon man, just enter either 'yes' or 'no': ");
			playAgain = fromKeyboard.nextLine();
			playAgain = playAgain.toLowerCase();		
			
		}

	
		System.out.println("Thank you for playing! Enjoy your prize(s)!");
		System.out.println("Win percentage after staying: " + stayCountWins + " / " + stayCountTotal + ". This is " + stayWinPercentage + ".");
		System.out.println("Win percentage after switching: " + switchCountWins + " / " + switchCountTotal + ".This is " + switchWinPercentage + ".");
		
	}
}	
