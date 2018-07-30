package programmingChallengesCh7;

import java.util.Arrays;
import java.util.Scanner;

public class ChargeAccountValidationTester
{
	// create the array with all the correct answers
	// take input from user of a number
	// loop through the array with a binary sort, checking if the users number matches a number in the array
	// if it matches, return true, else return false
	
	public static void main(String[] args) 
	{
		int[] arr = {5658845, 8080152, 1005231, 4520125, 4562555, 6545231, 7895122, 5552012, 3852085, 8777541, 5050552, 7576651, 845127, 7825877, 788120, 1302850, 1250255, 4581002};
		Arrays.sort(arr);
		Scanner fromKeyboard = new Scanner(System.in);
		System.out.print("What is your charge account number?: ");
		int answer = fromKeyboard.nextInt();
		fromKeyboard.close();
		System.out.println(CAV.binarySearch(arr, answer));

	}

}
