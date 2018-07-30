package blackjack;

import java.util.ArrayList;

/**
 * The Blackjack class allows a single player to play a game of blackjack.
 * The class tracks the player's bankroll but makes no attempt to prevent
 * a negative bankroll.
 *
 */
public class Blackjack
{
	private static final int DECKS = 6, CARDS_PER_DECK = 52;
	private static final double SHOE_PENETRATION = 0.75;
	
    private Shoe shoe;
    
    private double playersMoney;
    
    private Hand playersHand;
    private double playersBet;
    
    private Hand dealersHand;
    
    /**
     * Constructs a blackjack object that is ready to play.
     * @param playersMoney the player's starting bankroll (all values, including 0 and negative values, are permitted)
     */
    public Blackjack(double playersMoney)
    {
	    	this.playersMoney = playersMoney;
	    	reset();
	    	shoe = new Shoe(6);
    }
    
    /**
     * Resets for another round, including resetting shoe if necessary
     */
    private void reset()
    {
    		playersHand = null;
    		playersBet = -1;
        dealersHand = null;
        int totalAmountOfCards = CARDS_PER_DECK * DECKS;
        if(shoe.cardsLeft() / totalAmountOfCards >= SHOE_PENETRATION)
        		shoe.reset();
    }
    
    /**
     * Returns the player's money (can be negative)
     * @return the player's money
     */
    public double getPlayersMoney()
    {
        return playersMoney; // TODO: implement
    }
    
    /**
     * Returns the player's bet
     * @return the player's bet for the hand
     */
    public double getPlayersBet()
    {
        return playersBet; // TODO: implement
    }
    
    /**
     * Places a bet at the start of a round. Deals cards to the player and dealer.
     * @param amount the amount to bet
     */
    public void placeBetAndDealCards(double amount)
    {
        playersBet = amount;
        Card card1 = shoe.dealCard();
        Card card2 = shoe.dealCard();
        Card card3 = shoe.dealCard();
        Card card4 = shoe.dealCard();

        playersHand = new Hand(card1, card3);
        dealersHand = new Hand(card2, card4);
    }
    
    /**
     * Returns the player's hand
     * @return the player's hand
     */
    public Hand getPlayersHand()
    {
        return playersHand; 
    }
    
    /**
     * Returns the dealer's hand
     * @return the dealer's hand
     */
    public Hand getDealersHand()
    {
        return dealersHand;
    }
    
    /**
     * Returns true if the player can hit, false otherwise
     * @return true if the player can hit, false otherwise
     */
    public boolean canHit()
    {
        if (playersHand.getNumericValue() <= 21)
        		return true;
    		return false;
    }
    
    /**
     * Deals another card to the player's hand.
     * 
     * Precondition: canHit()
     */
    public void hit()
    {
        if( ! canHit() )
        		throw new IllegalStateException("can't hit");
        
        playersHand.addCard(shoe.dealCard());
    }
    
    /**
     * Plays the dealer's hand.
     */
    public void playDealersHand()
    {
        // TODO: implement
    }
    
    /**
     * Returns true if the player's hand is a push, false otherwise
     * @return true if the player's hand is a push, false otherwise
     */
    public boolean isPush()
    {
        return false; // TODO: implement
    }
    
    /**
     * Returns true if the player's hand is a player win, false otherwise
     * @return true if the player's hand is a player win, false otherwise
     */
    public boolean isPlayerWin()
    {
        return false; // TODO: implement
    }
    
    /**
     * Returns true if the player has blackjack, false otherwise
     * @return true if the player has blackjack, false otherwise
     * 
     * Precondition: isPlayerWin()
     */
    public boolean isPlayerBlackjack()
    {
        return false; // TODO: implement
    }
    
    /**
     * Resolves the player's bets (updates player's money based on the
     * results of the round) and resets for another round
     */
    public void resolveBetsAndReset()
    {
        // TODO: implement
    }
}
