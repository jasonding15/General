package blackjack;

public class BlackjackRunner 
{
	
	public static void main(String[] args) 
	{
		Blackjack oneRound = new Blackjack(1000);
		
		oneRound.placeBetAndDealCards(50);
		System.out.println("Players: " + oneRound.getPlayersHand());
		System.out.println("Dealers: " + oneRound.getDealersHand());
		System.out.println(oneRound.isPlayerBlackjack());
//		oneRound.hit();
//		System.out.println("Hit: " + oneRound.getPlayersHand());
//		oneRound.hit();
//		System.out.println(oneRound.getPlayersHand());
//		oneRound.playDealersHand();
//		System.out.println(oneRound.getDealersHand());
		
		System.out.println(oneRound.isPlayerWin());
		oneRound.resolveBetsAndReset();
		System.out.println("Player's Money: " + oneRound.getPlayersMoney());

		
		
	}
}