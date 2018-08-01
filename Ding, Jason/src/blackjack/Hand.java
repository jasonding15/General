package blackjack;

import java.util.ArrayList;

public class Hand 
{
	private ArrayList<Card> cardArray;
	
	public Hand(Card firstCard, Card secondCard)
	{
		cardArray = new ArrayList<Card>();
		cardArray.add(firstCard);
		cardArray.add(secondCard);
	}
	
	public Card getFirstCard()
	{
		return cardArray.get(0);
	}
	
	public void addCard(Card newCard)
	{
		cardArray.add(newCard);
	}
	
	public int getNumericValue()
	{
		int totalSum = 0;
		boolean hasAce = false;
		for(int i = 0; i < cardArray.size(); i++)
		{
			totalSum += cardArray.get(i).getNumericValue();
			if( cardArray.get(i).getValue().equals("A"))
				hasAce = true;
		}
		if(hasAce && totalSum <= 11)
			totalSum += 10;
		return totalSum;
	}
	
	public boolean isBlackjack()
	{
		if(getNumericValue() == 21 && cardArray.size() == 2)
			return true;
		else
			return false;
	}
	
	public String toString()
	{
		String formattedHand = "";
		for(int i = 0; i < cardArray.size(); i++)
		{
			formattedHand += cardArray.get(i).getCard() + " ";
		}
		formattedHand += "(" + getNumericValue() + ")";
		
		return formattedHand;
	}
}
