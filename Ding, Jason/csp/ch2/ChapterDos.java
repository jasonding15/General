package ch2;

import java.util.Scanner;

public class ChapterDos 
{

	public static void main(String[] args) 
	{
//		System.out.println("Jason Ding \n8 Dogwood Lane, Boonton Township, NJ, 07005 \n973-567-8396 \nUndecided"); //number 3
//
//		double land = 389767, acre = 43560; //programming challenges #7
//		double acres_in_land = land / acre;
//		System.out.println("There are " + acres_in_land + " acres in the land.");
//		
//		NumberFormat nf = NumberFormat.getCurrencyInstance(); //number 11
//		Scanner keyboard = new Scanner(System.in);
//		System.out.print("What is the retail price of the circuit board?: ");
//		double retail = keyboard.nextDouble();
//		double profit = retail * 0.4;
//		System.out.println("The profit is " + nf.format(profit));
//		keyboard.close();
//		
		Scanner input = new Scanner(System.in); //number 13
		
		System.out.print("What is your name?: ");
		String name = input.nextLine();
		
		System.out.print("How old are you?");
		int age = input.nextInt();
		input.nextLine();
		
		System.out.print("What city do you live in?");
		String city = input.nextLine();
		
		System.out.print("Which college do/did you attend?");
		String college = input.nextLine();
		
		System.out.print("What is your profession?");
		String profession = input.nextLine();
		
		System.out.print("What is your favorite animal?");
		String animal = input.nextLine();
		
		System.out.print("What is the name of your pet?");
		String petName = input.nextLine();
		
		System.out.println("There once was a person named " + name + " who lived in " + city + ". At the age of " + 
		age + ", " + name + " went to college at " + college + ". " + name + " graduated and went to work as a " + profession + ". Then, " 
		+ name + " adopted a(n) " + animal + " named " + petName + ". They both lived happily every after!");
		
		input.close();
		
		
		

	}

}
