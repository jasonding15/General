package algorithmWorkbenchChapter5;

import java.util.Scanner;

public class Number12 {
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Please print 'yes' or 'no' exactly as written: ");
		String answer = input.nextLine();
		
		while ( ! answer.equals("no") && ! answer.equals("yes"))
		{
			System.out.println("Bruv, you had one job. Please follow directions this time.");
			System.out.println();
			
			System.out.print("Please print 'yes' or 'no' exactly as written: ");
			answer = input.nextLine();
		}
		System.out.println("Your answer is " + answer + ".");
		input.close();
	}

}
