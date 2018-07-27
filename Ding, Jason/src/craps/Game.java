package craps;

public class Game 
{
	private double theBet, totalMoney;
	private boolean isWinner;
	private int point;
	private boolean isGameOver;
	/*
	 * Bleh bleh instructions
	 * With how much money are you starting? $1000
	 * How much are you betting? $50
	 * "click mouse to roll the dice"
	 * You rolled a 8
	 * 8 is your point
	 * click mouse to roll again
	 * you rolled a 7, sorry you lose.
	 * You now have 950 dollars.
	 */
	
	public Game()
	{
		theBet = -1;
		isWinner = false;
		isGameOver = false;
		point = -1;
		totalMoney = -1;
	}
	
	public void setTotalMoney(double ttalMoney)
	{
		totalMoney = ttalMoney;
	}
	
	public int rollDie()
	{
		int dieRoll1 = (int) (Math.random() * 6) + 1;
		int dieRoll2 = (int) (Math.random() * 6) + 1;
		int sumOfDie = dieRoll1 + dieRoll2;
		
		if (point == -1)
			handleFirstRoll(sumOfDie);
		else
			handleSubsequentRolls(sumOfDie);
		
		return sumOfDie;
		
	}

	private void handleFirstRoll(int sumOfDie) 
	{
		if (sumOfDie == 7 || sumOfDie == 11)
		{
			isWinner = true;
			isGameOver = true;
		}
		else if (sumOfDie == 2 || sumOfDie == 3 || sumOfDie== 12)
		{
			isWinner = false;
			isGameOver = true;
		}
		else
		{
			isGameOver = false;
			isWinner = false;
			point = sumOfDie;
		}
	}

	private void handleSubsequentRolls(int sumOfDie) 
	{
		if (sumOfDie == 7)
		{
			isWinner = false;
			isGameOver = true;
		}
		else if (sumOfDie == point)
		{
			isWinner = true;
			isGameOver = true;
		}
		else
			isGameOver = false;
	}
	
	public boolean checkIfGameEnds()
	{
		return isGameOver;
	}
	
	public int getPoint()
	{
		return point;
	}
	
	public void setPoint( int pont)
	{
		point = pont;
	}
	
	public void resetGame()
	{
		isGameOver = false;
		isWinner = false;
		point = -1;
		theBet = -1;
	}
	
	public void placeBet(double bet)
	{
		theBet = bet;
		totalMoney -= theBet;
	}
	
	public boolean hasWon()
	{
		return isWinner;
	}
	
	public double getTotalMoney()
	{
		return totalMoney;
	}
	
	public void resolveBets()
	{
		if (isWinner)
		{
			totalMoney += theBet * 2;
		}
	}
	
}
