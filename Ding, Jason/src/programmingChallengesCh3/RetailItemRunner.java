package programmingChallengesCh3;

public class RetailItemRunner // Number4
{

	public static void main(String[] args) 
	{
		RetailItem Item1 = new RetailItem("jacket", 12, 59.95);
		RetailItem Item2 = new RetailItem("designer jeans", 40, 34.95);
		RetailItem Item3 = new RetailItem("shirt", 20, 24.95);
		
		System.out.println("Description \t\t Units On Hand \t\t Price");
		System.out.println("------------------------------------------------------");
		System.out.println("Item 1 \t\t" + Item1.getDescription() + "\t\t" + Item1.getUnitsOnHand() + "\t\t " + Item1.getPrice());
		System.out.println("Item 2 \t\t" + Item2.getDescription() + "\t" + Item2.getUnitsOnHand() + "\t\t " + Item2.getPrice());
		System.out.println("Item 3 \t\t" + Item3.getDescription() + "\t\t" + Item3.getUnitsOnHand() + "\t\t " + Item3.getPrice());


	}

}
