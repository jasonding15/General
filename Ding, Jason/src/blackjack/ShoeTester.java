package blackjack;

import java.util.Arrays;

public class ShoeTester {

	public static void main(String[] args) 
	{
		OldShoe testShoe = new OldShoe(6);
		testShoe.shuffleShoe();
		System.out.println(testShoe.toString());
		System.out.println(testShoe.giveCard());
		System.out.println(testShoe.getShoeSize());
		System.out.println(testShoe.toString());
		System.out.println(testShoe.giveCard());
		System.out.println(testShoe.getShoeSize());
		System.out.println(testShoe.toString());
	}

}
