package programmingChallengesCh7;

import java.util.ArrayList;

/*
 * What is you answer to number (1 through 20)?:A
 * You got 3 questions wrong.
 * You got 17 questions right.
 * You passed!
 */
public class DriversLicense 
{
	private String[] quiz;
	private String[] scores;
	
	public DriversLicense(String[] quz)
	{
		scores = new String[]{"A", "A", "A", "A", "A", "A", "A", "A", "A", "D","A", "B", "C", "D", "D", "C", "B", "C", "A", "D"};
		quiz = quz;
	}
	
	public int totalCorrect()
	{
		int totalCorrect = 0;
		for (int i = 0; i < scores.length; i++)
		{
			if (quiz[i].equals(scores[i]))
				totalCorrect++;
		}
		return totalCorrect;
	}
	
	public int totalIncorrect()
	{
		return scores.length - totalCorrect();
	}
	
	public boolean didPass()
	{
		if (totalCorrect() >= 15)
			return true;
		return false;
	}
	
	public ArrayList<Integer> gotWrong()
	{
		ArrayList<Integer> wrongOnes = new ArrayList<Integer>();
		for (int i = 0; i < scores.length; i++)
		{
			if (! scores[i].equals(quiz[i]) )
				wrongOnes.add(i + 1);
		}
		return wrongOnes;
	}
	
}
