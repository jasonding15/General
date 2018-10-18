package p5_2;

public class Card 
{
	private String cardNotation;
	public Card(String cardNotation)
	{
		this.cardNotation = cardNotation;
	}
	
	public String getDescription()
	{
		if (getValue().equals("unknown") || getSuit().equals("unknown"))
			return "Unknown";
		return getValue() + " of " + getSuit();
	}
	
	private String getValue() 
	{
		String cardValue = cardNotation.substring(0, cardNotation.length() - 1);
		if(cardValue.equals("J"))
			return "jack";
		if(cardValue.equals("Q"))
			return "queen";
		if(cardValue.equals("K"))
			return "king";
		if(cardValue.equals("A"))
			return "ace";
		else
		{
			if (!cardValue.contains("A") && !cardValue.contains("J") && !cardValue.contains("Q") && !cardValue.contains("K"))
				return "unknown";
			if( Double.parseDouble(cardValue) <= 2 || Double.parseDouble(cardValue) >= 10)
				return "unknown";
			if((Double.parseDouble(cardValue) == 2))
				return "two";
			if((Double.parseDouble(cardValue) == 3))
				return "three";
			if((Double.parseDouble(cardValue) == 4))
				return "four";
			if((Double.parseDouble(cardValue) == 5))
				return "five";
			if((Double.parseDouble(cardValue) == 6))
				return "six";
			if((Double.parseDouble(cardValue) == 7))
				return "seven";
			if((Double.parseDouble(cardValue) == 8))
				return "eight";
			if((Double.parseDouble(cardValue) == 9))
				return "nine";
			if((Double.parseDouble(cardValue) == 10))
				return "ten";
			else 
				return "unkown";
		}			
	}
	
	private String getSuit()
	{
		String cardValue = cardNotation.substring(cardNotation.length() - 1);
		if(!(cardValue.contains("S") || cardValue.contains("D") || cardValue.contains("H") || cardValue.contains("C")))
			return "unknown";
		if(cardValue.equals("S"))
			return "spades";
		if(cardValue.equals("D"))
			return "diamonds";
		if(cardValue.equals("H"))
			return "hearts";
		if(cardValue.equals("C"))
			return "clubs";
		else
			return "unknown";

	}
}
