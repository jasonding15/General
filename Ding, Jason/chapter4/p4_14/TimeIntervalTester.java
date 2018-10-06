package p4_14;

import java.util.Scanner;

public class TimeIntervalTester 
{

	public static void main(String[] args) 
	{
		Scanner fromKeyboard = new Scanner(System.in);
		System.out.print("Input first military time: ");
		String first = fromKeyboard.nextLine();
		System.out.print("Input second military time: ");
		String second = fromKeyboard.nextLine();
		fromKeyboard.close();
		TimeInterval ti = new TimeInterval(first, second);
		System.out.println("Difference in times: " + ti.getHours() + " hours, " + ti.getMinutes() + " minutes.");
//		System.out.println(ti.convertToMinutes("2400"));
		
	}

}
