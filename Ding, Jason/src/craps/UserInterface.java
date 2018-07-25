package craps;

import java.util.Scanner;

public class UserInterface {

	private Scanner fromKeyboard;
	private Game craps;
	private double totalMoney;
	
	public UserInterface()
	{
		fromKeyboard = new Scanner(System.in);
		craps = new Game();
		totalMoney = -1;
	}

	public void printInstructions()
	{
		System.out.println("Instructions");
		System.out.println("--------------");
		System.out.println("First, place a bet. Then roll two dice.");
		System.out.println("If the sum of the dice rolled is 7 or 11, you win!");
		System.out.println("If the sum of the dice rolled is 2, 3, or 12, you lose.");
		System.out.println("If you neither win nor lose on the first roll, then the sum of the dice rolled is your point, and you roll again.");
		System.out.println("Now, if you roll a 7, you lose. However, if you roll your point value, you win!");
		System.out.println("Continue rolling until one of these two events occurs.");
		System.out.println("If you win, you get twice your bet back!");
		
	}
	
	public void gamePlayInterface()
	{
		System.out.println("");
		System.out.print("With how much money are you starting? (minimum of $50 to play): ");
		totalMoney = fromKeyboard.nextDouble();
		fromKeyboard.nextLine();
		while (totalMoney < 50)
		{
			System.out.print("Do yOU eVEn WAnT tO PlaY? With how much money are you starting? (Sorry if you're broke, but you must have at least $50 to play): ");
			totalMoney = fromKeyboard.nextDouble();
			fromKeyboard.nextLine();
		}
		craps.setTotalMoney(totalMoney);
	}
	
	public void placeBet()
	{
		System.out.print("Please place a bet of at least $25: ");
		double bet = fromKeyboard.nextDouble();
		fromKeyboard.nextLine();
		craps.placeBet(bet);
		while(bet < 25 || bet > totalMoney)
		{
			System.out.print("Please place a bet of above $25 that you are capable of paying! How much are you betting?: ");
			bet = fromKeyboard.nextDouble();
			fromKeyboard.nextLine();
			craps.placeBet(bet);
		}
	}
	
	public void rollDice()
	{
		System.out.println("Now, please press the space bar to roll the dice!");
		String answer = fromKeyboard.nextLine();
		fromKeyboard.nextLine();
		while( ! answer.equals(" ") )
		{
			System.out.print("Bruh people be waitin for you. Please roll the dice by pressing space already!: ");
			answer = fromKeyboard.nextLine();
			fromKeyboard.nextLine()
		}
	}
	
	
}
