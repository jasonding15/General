package p3_12;

/**
 * represents a voting machine that keeps track of votes for democrats and republicans
 * @author Jason Ding
 *
 */
public class VotingMachine 
{
	private int democratVotes, republicanVotes;
	
	/**
	 * creates an empty voting machine
	 */
	public VotingMachine()
	{
		democratVotes = 0;
		republicanVotes = 0;
	}
	
	/**
	 * places a vote for the democratic candidate
	 */
	public void voteForDemocrat()
	{
		democratVotes += 1;
	}
	
	/**
	 * places a vote for the republican candidate
	 */
	public void voteForRepublican()
	{
		republicanVotes += 1;
	}
	
	/**
	 * @return the number of democrat votes
	 */
	public int getDemocratVotes()
	{
		return democratVotes;
	}
	
	/**
	 * @return the number of republican votes
	 */
	public int getRepublicanVotes()
	{
		return republicanVotes;
	}
	
	/**
	 * resets the votes for all parties to 0
	 */
	public void clearMachine()
	{
		democratVotes = 0;
		republicanVotes = 0;
	}
}
