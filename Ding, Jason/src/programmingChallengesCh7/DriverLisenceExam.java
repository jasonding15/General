package programmingChallengesCh7;

import java.util.Scanner;

public class DriverLisenceExam 
{

	public static void main(String[] args) 
	{
		Scanner fromKeyboard = new Scanner(System.in);
		String[] answer = new String[20];
		for (int i = 1; i <= answer.length; i++)
		{
			System.out.print("What is the answer to question " + i + "? ('A', 'B', 'C', or 'D'): ");
			String ans = fromKeyboard.nextLine();
			answer[i - 1] = ans;
		}
		fromKeyboard.close();
		DriversLicense dl = new DriversLicense(answer);
		
		System.out.println("You got " + dl.totalCorrect() + " questions right.");
		System.out.println("You got " + dl.totalIncorrect() + " questions wrong.");
		System.out.println("You got these questions wrong: " + dl.gotWrong());
		if (dl.didPass())
			System.out.println("You passed, congradulations!");
		else 
			System.out.println("Sorry, you did not pass.");
	}

}
