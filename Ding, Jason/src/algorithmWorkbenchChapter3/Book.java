package algorithmWorkbenchChapter3;

public class Book //Number 2
{
	private String title;
	private String author;
	private String publisher;
	private int copiesSold;
	
	public Book(String ttle, String athor, String pblisher, int copSold)
	{
		title = ttle;
		author = athor;
		publisher = pblisher;
		copiesSold = copSold;
	}
	
	public void setTitle(String ttle)
	{
		title = ttle;
	}
	
	public void setAuthor(String athor)
	{
		author = athor;
	}
	
	public void setPublisher(String pblisher)
	{
		publisher = pblisher;
	}
	
	public void setCopiesSold(int copSold)
	{
		copiesSold = copSold;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	public String getPublisher()
	{
		return publisher;
	}
	
	public int getCopiesSold()
	{
		return copiesSold;
	}
	
	
}
