package craps;

public class CrapsMain 
{

	public static void main(String[] args) 
	{
		Game test = new Game();
		test.placeBet(50);
		System.out.print(test.rollDie() + "  ");
		System.out.println("Game over? " + test.checkIfGameEnds());
//		System.out.println(test.hasWon());
//		System.out.println(test.getPoint());
		while (test.checkIfGameEnds() == false)
		{
			System.out.println(test.rollDie() + "  " + test.hasWon());
		}
		System.out.println("Game over! Did you win? " + test.hasWon());
		test.resolveBets();
		System.out.println("you now have: " + test.getTotalMoney());
		
		
		
		test.resetGame();
		test.placeBet(50);
		System.out.println(test.rollDie());
		System.out.println(test.checkIfGameEnds());
		while (test.checkIfGameEnds() == false)
		{
			
			System.out.print(test.rollDie() + "  ");
			System.out.println(test.hasWon() + "  ");
		}
		System.out.println(test.hasWon() + " ");
		test.resolveBets();
		System.out.println("You now have: " + test.getTotalMoney());
	}

}