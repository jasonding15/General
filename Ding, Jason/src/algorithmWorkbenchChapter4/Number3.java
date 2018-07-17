package algorithmWorkbenchChapter4;

public class Number3 
{
	public static void main(String[] args)
	{
		double sales, commission;
		sales = 18000;
		
		if (sales < 10000)
			commission = 0.1;
		else if (sales <= 15000)
			commission = 0.15;
		else 
			commission = 0.2;
		
		System.out.println("commission: " + commission);
	}
}
