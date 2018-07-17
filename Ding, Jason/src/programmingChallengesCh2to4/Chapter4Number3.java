package programmingChallengesCh2to4;

import java.util.Scanner;

public class Chapter4Number3 
{
	public static void main(String[] args)
	{ 
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is the first test score?: ");
		double score1 = input.nextDouble();
		
		System.out.print("What is the second test score?: ");
		double score2 = input.nextDouble();
		
		System.out.print("What is the last test score?: ");
		double score3 = input.nextDouble();
		
		double average = (score1 + score2 + score3) / 3;
		char averageLetter;
		
		if (average < 60)
			averageLetter = 'F';
		else if (average< 70)
			averageLetter = 'D';
		else if (average< 80)
			averageLetter = 'C';
		else if (average< 90)
			averageLetter = 'B';
		else if (average <= 100)
			averageLetter = 'A';
		else
			averageLetter = 'E';
		
		System.out.println("The average grade is a(n) " + average + ", which is the letter grade " + averageLetter + ".");
		
		input.close();
	
			
			
			
		
	}
}
 