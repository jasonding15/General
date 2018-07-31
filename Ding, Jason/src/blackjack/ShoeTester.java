package blackjack;

public class ShoeTester {

	public static void main(String[] args) 
	{
		Shoe testShoe = new Shoe(6);
//		testShoe.reset();
		System.out.println(testShoe.toString());
		System.out.println(testShoe.dealCard());
		System.out.println(testShoe.cardsLeft());
		System.out.println(testShoe.toString());
		System.out.println(testShoe.dealCard());
		System.out.println(testShoe.cardsLeft());
		System.out.println(testShoe.toString());
	}

}
