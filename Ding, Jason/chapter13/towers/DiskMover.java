package towers;

public class DiskMover
{
	public static void main(String[] args)
	{
		move(5, 2, 3);
	}
	
    public static void move(int disks, int source, int target)
    {
        if (disks == 1)
        {
        		System.out.println("Move peg " + source + " to peg " + target);
        		return;
        }
        
        int nonPeg = 6 - source - target;
//        if (source + target == 3)
//        		nonPeg = 3;
//        else
//        		nonPeg = Math.abs(target - source);
        
//        System.out.println("Move peg " + source + " to peg " + target);

        move(disks - 1, source, nonPeg);
//        move(1, source, target);
        System.out.println("Move peg " + source + " to peg " + target);
        move(disks - 1, nonPeg, target);
    }
}