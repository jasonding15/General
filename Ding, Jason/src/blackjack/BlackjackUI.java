package blackjack;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * A text based user interface that allows the user to
 * play a game of blackjack.
 */
public class BlackjackUI
{
	private Blackjack bj; 
	private Scanner fromKeyboard;
	private NumberFormat nf;
	
	/**
	 * Constructs a blackjack game with $1,000 in player bankroll
	 */
	public BlackjackUI()
	{
	    bj = new Blackjack(1000);
	    fromKeyboard = new Scanner(System.in);
	}
	
	/**
     * Returns a valid numerical bet obtained from the player
     * @return a valid numerical bet obtained from the player
     */
    private double getValidBet()
    {
        System.out.print("Please place a bet (at least $20 to play): ");
        int bet = fromKeyboard.nextInt();
        fromKeyboard.nextLine();
        while (bet < 20)
        {
        		System.out.print("Please bet at least 20 bucks to play, AIGHT CUH?: ");
        		bet = fromKeyboard.nextInt();
        		fromKeyboard.nextLine();
        }
    		return bet; 
    }
    
	/**
	 * Plays a single hand of blackjack
	 */
    public void playHand()
    {
    		playPlayersHand();
    }
    
    /**
     * Plays blackjack hands until the user chooses to quit
     */
    public void playHandsUntilQuit()
    {
        // TODO: implement
    }

    /**
     * Allows the player to hit until it is no longer possible
     * to do so or until the player chooses to stand
     */
	private void playPlayersHand()
	{
		boolean wantsToHit = true;
		bj.placeBetAndDealCards(getValidBet());
		System.out.println("Your cards are: " + bj.getPlayersHand() + ".");
		while(bj.canHit() && wantsToHit)
		{
			System.out.print("Please press 'h' to hit and anything else to stand: ");
			String ans = fromKeyboard.nextLine();
			ans = ans.toUpperCase();
			while (! ans.equals("H") && ! ans.equals("S"))
			{
				System.out.print("Please hit or stand, kind sir. We do not have all day. Press h or s please to hit or stand, respectively: ");
				ans = fromKeyboard.nextLine();
			}
			if (ans.equals("H"))
			{
				bj.hit();
				System.out.println("Your hand is now: " + bj.getPlayersHand());
			}
			if (! ans.equals("H"))
			{
				System.out.println("Your final hand is: " + bj.getPlayersHand());
				wantsToHit = false;
			}
		}
		
		
		if(bj.isPlayerWin())
		{
			if(bj.isPlayerBlackjack())
				System.out.println("Blackjack! You win!");
			
			System.out.println("You win!");
			bj.resolveBetsAndReset();
			System.out.println(bj.getPlayersMoney());
		}
		else if(! bj.isPlayerWin())
		{
			System.out.println("You lose. Better luck next time!");
			bj.resolveBetsAndReset();
			System.out.println(bj.getPlayersMoney());
		}
	
		else if(bj.isPush())
			System.out.println("You tied with the dealer. You get your bet back.");
			
		
	}

	/**
	 * Displays the result of the hand (push, player win, player blackjack or loss)
	 */
	private void displayResult()
	{
	    // TODO: implement
	}

	/**
	 * Returns the numeric representation of input or -1 if input is not numeric
	 * @param input the value to be converted to a number
	 * @return numeric representation or -1
	 */
	private double stringToNumber(String input)
	{
		try
		{
			return Double.parseDouble(input);
		}
		catch(NumberFormatException e)
		{
			return -1;
		}
	}
}
