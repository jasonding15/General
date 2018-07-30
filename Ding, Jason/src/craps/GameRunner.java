package craps;

public class GameRunner 
{
	
	public static void main(String[] args) 
	{	
		UserInterface test = new UserInterface();
		
		test.printInstructions();
		test.setTotalMoney();
		test.playUntilQuit();
	}

}
