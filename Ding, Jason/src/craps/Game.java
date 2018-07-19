package craps;

public class Game 
{
	private double theBet;
	private boolean isWinner;
	private int point;
	private boolean isGameOver;
	/*
	 * Bleh bleh instructions
	 * "click mouse to roll the dice"
	 * You rolled a 8
	 * 8 is your point
	 * click mouse to roll again
	 * you rolled a 7, sorry you lose.
	 */
	
	public Game()
	{
		theBet = -1;
		isWinner = false;
		isGameOver = false;
		point = -1;
	}
	
	
	public int rollDie()
	{
		int dieRoll1 = (int) (Math.random() * 6) + 1;
		int dieRoll2 = (int) (Math.random() * 6) + 1;
		
		if (point == -1)
		{
			if (rollDie() == 7 || rollDie() == 11)
			{
				isWinner = true;
				isGameOver = true;
			}
			else if (rollDie() == 2 || rollDie() == 3 || rollDie() == 12)
			{
				isWinner = false;
				isGameOver = true;
			}
		}
		return dieRoll1 + dieRoll2;
		
	}
	
	public boolean checkIfGameEnds()
	{
		
	}
	
	public double placeBet(double bet)
	{
		
	}
	
	public boolean hasWon()
	{
		
	}
}
