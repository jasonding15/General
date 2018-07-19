package blackjack;

public class Card 
{
	private String value, suit;
	// val can be "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"
	// st can be "S", "C", "H", "D"
	public Card(String val, String st)
	{
		value = val.toUpperCase();
		suit = st.toUpperCase();
	}
	
	public String getCard()
	{
		return value + suit;
	}
	
	public int getNumericValue()
	{
		int totalValue = 0;
		if (value.equals("A"))
			totalValue += 1;
		else if (value.equals("J") || value.equals("Q") || value.equals("K"))
			totalValue += 10;
		else //if (! value.equals("J") && value.equals("Q") && ! value.equals("K"))
			totalValue += Integer.parseInt(value);
		return totalValue;
	}
}
