package p3_8;

/**
 * creates a letter formatter with a recipient, sender, and text
 * @author jding
 */
public class Letter 
{
	private String mail, from, to;
	/**
	 * creates a letter class with a sender and recipient
	 * @param from is the sender
	 * @param to is the recipient
	 */
	public Letter(String from, String to)
	{
		mail = "";
		this.from = from;
		this.to = to;
	}
	/**
	 * @param line adds a string to the letter on a new line
	 */
	public void addLine(String line)
	{
		mail += line + "\n";
	}
	/**
	 * @return the entire letter properly formatted
	 */
	public String getText()
	{
		return "Dear " + to + ",\n" + mail + "Sincerely,\n" + from;
	}
	
	
}
