package algorithmWorkbenchChapter5;

import java.util.Scanner;

public class Number11 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number 1 through 5: ");
		int age = input.nextInt();
		
		while (age < 1 || age > 5)
			{
				System.out.println("Dang your bad at following directions. Please comply with the request to 'enter a number 1 through 5'!");
				System.out.println();
				
				System.out.print("Please enter a number 1 through 5: ");
				age = input.nextInt();
			}
		System.out.println("Your number is " + age + ".");
		input.close();
	}

}
