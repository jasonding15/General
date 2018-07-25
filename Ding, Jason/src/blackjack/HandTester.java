package blackjack;

public class HandTester {

	public static void main(String[] args) 
	{
		Card c1 = new Card("A", "D");
		Hand firstHand = new Hand(c1, new Card("8", "C"));
		
		System.out.println(firstHand.getNumericValue());
		firstHand.addCard(new Card("J", "S"));
		firstHand.addCard(new Card("2", "S"));
		System.out.println(firstHand.getNumericValue());
		
		System.out.println(firstHand.toString());

	}

}
