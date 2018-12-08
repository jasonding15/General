package p7_13;

public class MagicSquare 
{
	private int[][] grid;
	public MagicSquare(int side)
	{
		grid = new int[side][side];
		int index = 0;
		int row = side - 2;
		int col = side / 2 - 1;
		for( int i = 0; i < side * side; i++)
		{
			if(row == side - 1 && col == side - 1)
			{
				row = side - 2;
				col = side - 1;
			}
			else
			{
				if(row < side - 1)
					row++;
				else
					row = 0;
				if(col < side - 1)
					col++;
				else
					col = 0;
			}
			if (grid[row][col] != 0)
			{
				row -= 2;
				col--;
				if(row >= side || row < 0)
					row = 0;
				if(col >= side || col < 0)
					col = 0;
			}
			index ++;
			grid[row][col] = index;
		}
	}
	
	public int[][] getGrid()
	{
		return grid;
	}
	
	
}
