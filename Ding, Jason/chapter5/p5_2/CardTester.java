package p5_2;

public class CardTester 
{

	public static void main(String[] args) 
	{
		Card c1 = new Card("KD");
		System.out.println(c1.getDescription());
		Card c2 = new Card("QH");
		System.out.println(c2.getDescription());		
		Card c3 = new Card("14B");
		System.out.println(c3.getDescription());
		Card c4 = new Card("BS");
		System.out.println(c4.getDescription());
//		String str = "Aello";
//		boolean isChar = str.substring(0,1).contains("A");
//		System.out.println(isChar);
	}

}
