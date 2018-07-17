package algorithmWorkbenchChapter5;

import java.util.Scanner;

public class Number1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		int input = keyboard.nextInt();
		keyboard.close();
		
		while (input < 100)
		{
			input *= 10;
		}
		System.out.println("The value after the program is " + input + ".");
	}

}
