package blackjack;

import java.util.ArrayList;
import java.util.Collections;

public class OldShoe
{
	private final int decks;
	private ArrayList<Card> cards;
	
	public OldShoe(int dcks)
	{
		decks = dcks;
		cards = new ArrayList<Card>();
		resetShoe();
	}
	
	public void resetShoe()
	{
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
	
	public String toString()
	{
		return cards.toString();
	}
	
	public Card giveCard()
	{
		Card temp = cards.get(0);
		cards.remove(temp);
		return temp;
	}
	
	public void shuffleShoe()
	{
		
		for(int i = 0; i < cards.size(); i++)
		{
			int randomNum = (int) (Math.random() * cards.size());
			Collections.swap(cards, i, randomNum);
		}
		
		
	}
	
	public int getShoeSize()
	{
		return cards.size();
	}
	
	public double penetrationPercentage()
	{
		return cards.size();
	}
}

