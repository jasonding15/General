package algorithmWorkbenchChapter2;

import java.text.NumberFormat;
import java.util.Scanner;

public class Chapter2 
{
	public static void main(String[] args)
	{
//		double temp, weight, age; //number 1
		
//		int months = 2, days, years = 3; //number 2
		
		double a = 2, b = 3; //number 3
		b = a + 2;
		a = 4 * b;
		b = a / 3.14;
		a = b - 8;
//		char c ='K';
//		c = 'B'; 
		
		double speed = 20, time = 10; //number 7
		double distance = speed * time;
		System.out.println(distance);
		
		double force = 172.5, area = 27.5; //number 8
		double pressure = area / force;
		System.out.println(pressure);
		

		NumberFormat nf = NumberFormat.getCurrencyInstance();
		Scanner fromKeyboard = new Scanner(System.in); //number 11
		System.out.print("What is your desired annunal income?: ");
		double income = fromKeyboard.nextDouble();
		System.out.println("Your desired annunal income is " + nf.format(income));
		fromKeyboard.close();
		
	}
}
