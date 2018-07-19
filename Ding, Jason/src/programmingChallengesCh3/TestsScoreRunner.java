package programmingChallengesCh3;

import java.util.Scanner;

public class TestsScoreRunner {

	public static void main(String[] args) 
	{
		TestScores TS = new TestScores();
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("What is the first test score?: ");
		TS.addFirstScore(keyboard.nextDouble());
		
		System.out.print("What is the second test score?: ");
		double secondTest = keyboard.nextDouble();
		TS.addSecondScore(secondTest);
		
		System.out.print("What is the third test score?: ");
		double thirdTest = keyboard.nextDouble();
		TS.addThirdScore(thirdTest);
		keyboard.close();
		
		System.out.println("The average test score is " + TS.getMean() + ".");
		
	}

}
