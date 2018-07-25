package blackjack;

public class Hand 
{
	private Card[] cardArray;
	private int numCards;
	
	public Hand(Card firstCard, Card secondCard)
	{
		cardArray = new Card[15];
		cardArray[0] = firstCard;
		cardArray[1] = secondCard;
		numCards = 2;
	}
	
	public void addCard(Card newCard)
	{
		cardArray[numCards] = newCard;
		numCards++;
	}
	
	public int getNumericValue()
	{
		int totalSum = 0;
		boolean hasAce = false;
		for(int i = 0; i < numCards; i++)
		{
			totalSum += cardArray[i].getNumericValue();
			if( cardArray[i].getValue().equals("A"))
				hasAce = true;
		}
		if(hasAce && totalSum <= 11)
			totalSum += 10;
		return totalSum;
	}
	
	public String toString()
	{
		String formattedHand = " ";
		for(int i = 0; i <= numCards; i++)
		{
			formattedHand += cardArray[i].getCard() + "\t";
		}
		
		return formattedHand;
	}
}
