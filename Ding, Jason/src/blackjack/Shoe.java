package blackjack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * A multi-deck shoe that can deal cards and can be reset.
 *
 */
public class Shoe
{ 
	private final int decks;
	private ArrayList<Card> cards;
	
	/**
     * Constructs a shoe with the specified number of decks.
     * This shoe will be shuffled.
     * @param decks the number of decks
     */
    public Shoe(int decks)
    {
        this.decks = decks;
        cards = new ArrayList<Card>();
        reset();

    }
    
    /**
     * Removes and returns a card from this shoe
     * @return the card removed from this shoe.
     */
    public Card dealCard()
    {
    		Card temp = cards.get(0);
		cards.remove(temp);
		return temp;
    }
    
    /**
     * Returns the number of cards left in this shoe
     * @return the number of cards left in this shoe
     */
    public int cardsLeft()
    {
    		return cards.size();
    }
    
    /**
     * Resets this shoe to contain all of its original cards.
     * This shoe will be shuffled.
     */
    public void reset()
    {
        createShoe();
        shuffleShoe();
    }
    
    private void createShoe()
    {
    		cards.clear();
    	
    		String[] suits = {"S", "C", "H", "D"};
    		String[] faceCards = {"A", "K", "Q", "J"};
    		for(int i = 1; i <= decks; i++)
    		{
    			for(int suitIndex = 0; suitIndex < suits.length; suitIndex++)
    			{
    				for(int numCards = 2; numCards <= 10; numCards++)
    				{
    					Card kard = new Card("" + numCards, suits[suitIndex]);
    					cards.add(kard);
    				}
    				for(int faceCardIndex = 0; faceCardIndex < faceCards.length; faceCardIndex++)
    				{
    					Card chard = new Card(faceCards[faceCardIndex], suits[suitIndex]);
    					cards.add(chard);
    				}			
			}
		}
    }
    
    private void shuffleShoe()
    {
    		for(int i = 0; i < cards.size(); i++)
		{
			int randomNum = (int) (Math.random() * cards.size());
			Collections.swap(cards, i, randomNum);
		}
    }

    public String toString()
    {
    		return cards.toString();
    }
}

