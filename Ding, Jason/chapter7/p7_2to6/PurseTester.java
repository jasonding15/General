package p7_2to6;

public class PurseTester 
{
	public static void main(String[] args) 
	{
		Purse p = new Purse();
		p.addCoin("Quarter");
		p.addCoin("Nickel");
		p.addCoin("Penny");
		p.addCoin("Dime");
		System.out.println(p.toString());
		p.reverseCoins();
		System.out.println(p.toString());
	}

}
