package blackjack;

public class HandTester {

	public static void main(String[] args) 
	{
		Card c1 = new Card("A", "D");
		Card c2 = new Card("8", "S");
		Hand firstHand = new Hand(c1, c2);
		
//		System.out.println(firstHand.getNumericValue());
		firstHand.addCard(new Card("J", "S"));
		firstHand.addCard(new Card("2", "S"));
		System.out.println(firstHand.getNumericValue());
		
//		System.out.println(firstHand.toString());
		System.out.println(firstHand);

	}

}
