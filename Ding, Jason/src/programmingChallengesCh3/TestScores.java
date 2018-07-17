package programmingChallengesCh3;

public class TestScores //number 7
{
	/*
	 * Visualization:
	 * What is your first test score? 80
	 * What is your second test score? 90
	 * What is your third test score? 70
	 * Your average is 80. 
	 */
	private double test1, test2, test3;
	public TestScores()
	{
		test1 = 0;
		test2 = 0;
		test3 = 0;
	}
	
	public void addFirstScore(double firstTest)
	{
		test1 = firstTest;
	}
	
	public void changeFirstScore(double firstTest)
	{
		test1 = firstTest;
	}
	
	public void addSecondScore(double secondTest)
	{
		test2 = secondTest;
	}
	
	public void changeSecondScore (double secondTest)
	{
		test2 = secondTest;
	}
	
	public void addThirdScore(double thirdTest)
	{
		test3 = thirdTest;
	}
	
	public void changeThirdScore(double thirdTest)
	{
		test3 = thirdTest;
	}
	public double getMean()
	{
		return (test1 + test2 + test3) / 3;
	}
}
