package blackjack;

import java.util.ArrayList;

public class Shoe
{
	private final int decks;
	private ArrayList<Card> cards;
	
	public Shoe(int dcks)
	{
		decks = dcks;
		cards = new ArrayList<Card>();
		resetShoe();
	}
	
	public void resetShoe()
	{
		String[] suits = {"S", "C", "H", "D"};
//		String suitPlace = "";
		String[] faceCards = {"A", "K", "Q", "J"};
		for(int i = 1; i <= decks; i++)
		{
			for(int suitIndex = 0; suitIndex < suits.length; suitIndex++)
			{
				for(int numCards = 2; numCards <= 10; numCards++)
				{
					new Card("" + numCards, suits[suitIndex] );
				}
				for(int faceCardIndex = 1; faceCardIndex <= 4; faceCardIndex++)
				{
					
				}
					
//				suitPlace += suits[suit];
			}
		}
		
	}
	
	public Card giveCard()
	{
		
	}
	
	public double penetrationPercentage()
	{
		
	}
}

