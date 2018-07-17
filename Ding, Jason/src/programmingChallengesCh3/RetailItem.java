package programmingChallengesCh3;

public class RetailItem 
{
	private String description;
	private int unitsOnHand;
	private double price;
	
	public RetailItem(String descript, int uOH, double prce)
	{
		description = descript;
		unitsOnHand = uOH;
		price = prce;
	}
	
	public void setDescription (String descript)
	{
		description = descript;
	}
	
	public void setUnitsOnHand(int units)
	{
		unitsOnHand = units;
	}
	
	public void setPrice(double pricee)
	{
		price = pricee;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public int getUnitsOnHand()
	{
		return unitsOnHand;
	}
	
	public double getPrice()
	{
		return price;
	}
	

}
