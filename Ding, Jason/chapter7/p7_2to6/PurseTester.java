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
		p.reverseCoins();
		System.out.println(p);
		Purse a = new Purse();
		a.addCoin("Quarter");
		a.addCoin("Nickel");
		a.addCoin("Penny");
		a.addCoin("Dime");
		System.out.println(a);
		System.out.println(a.sameCoins(p));
		System.out.println(a.sameContents(p));
//		Purse a = new Purse();
//		a.addCoin("Dime");
//		a.addCoin("Dime");
//		System.out.println(a);
//		p.transferPurse(a);
//		System.out.println(p);
//		System.out.println(a);
//		System.out.println(a.sameContents(p));
//		Purse b = new Purse();
//		b.addCoin("Dime");
//		b.addCoin("Penny");
//		b.addCoin("Nickel");
//		b.addCoin("Quarter");
//		b.addCoin("Dime");
//		b.addCoin("Dime");
//		System.out.println(p.sameContents(b));
		
	}

}
