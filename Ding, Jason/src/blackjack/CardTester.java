package blackjack;

public class CardTester 
{
	public static void main(String[] args) 
	{
		Card firstCard = new Card("a", "h");
		System.out.println(firstCard.getCard());
		System.out.println("Value: " + firstCard.getNumericValue());
		System.out.println("");
		
		Card secondCard = new Card("j", "d");
		System.out.println(secondCard.getCard());
		System.out.println("Value: " + secondCard.getNumericValue());
		System.out.println("");
		
		Card thirdCard = new Card("2", "c");
		System.out.println(thirdCard.getCard());
		System.out.println(thirdCard.getNumericValue());
		System.out.println("");
		
		Card fourthCard = new Card("10", "s");
		System.out.println(fourthCard.getCard());
		System.out.println(fourthCard.getNumericValue());
		System.out.println("");
	}

}
