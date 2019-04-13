package critters;

import info.gridworld.grid.Location;
import java.util.ArrayList; 

public class QuickCrab extends CrabCritter
{

	public ArrayList<Location> getMoveLocations()
	{
		ArrayList<Location> locs = new ArrayList<Location>();
		
        Location currentLoc = getLocation();
        
        if (getDirection() == Location.EAST || getDirection() == Location.WEST)
        {
        	Location locLeft = new Location(currentLoc.getCol(), currentLoc.getRow() - 2);
        	if (getGrid().get(locLeft) == null)
                locs.add(locLeft);
        	
        	Location locRight = new Location(currentLoc.getCol(), currentLoc.getRow() + 2);
        	if (getGrid().get(locRight) == null)
                locs.add(locRight);
        }
        
        if(getDirection() == Location.SOUTH || getDirection() == Location.NORTH)
        {
        	Location locLeft = new Location(currentLoc.getCol() - 2, currentLoc.getRow());
        	if (getGrid().get(locLeft) == null)
                locs.add(locLeft);
        	
        	Location locRight = new Location(currentLoc.getCol() + 2, currentLoc.getRow());
        	if (getGrid().get(locRight) == null)
                locs.add(locRight);
        }
       

        return locs;
	 }
}