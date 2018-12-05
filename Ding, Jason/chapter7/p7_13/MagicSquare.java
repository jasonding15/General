package p7_13;

public class MagicSquare 
{
	private int side;
	public MagicSquare(int n)
	{
		side = n;
	}
	
	public int[][] constructSquare()
	{
		int[][] grid = new int[side][side];
		int index = 1;
		grid[side][side / 2 + 1] = index;
		return grid;
	}
}
