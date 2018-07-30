package blackjack;

public class BlackjackRunner 
{
	
	public static void main(String[] args) 
	{
		Blackjack oneRound = new Blackjack(1000);
		
		oneRound.placeBetAndDealCards(50);
		System.out.println(oneRound.getPlayersHand());
		System.out.println("Dealers: " + oneRound.getDealersHand());
		
	}
}
