package critters;

import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import java.util.ArrayList;

public class KingCrab extends CrabCritter
{

	public void processActors(ArrayList<Actor> actors)
	{
		for (Actor a : actors)
		{
			boolean hasMoved = false;
			ArrayList<Location> locations = getGrid().getEmptyAdjacentLocations(a.getLocation());

			for(Location loc:locations)
			{
				if(distanceFrom(getLocation(), loc) > 1)
				{
					a.moveTo(loc);
					hasMoved = true;
				}
			}
			
			if (hasMoved == false)
				a.removeSelfFromGrid();
		}
	}
	
	public int distanceFrom(Location loc1, Location loc2)
	{
		return (int)Math.sqrt(Math.pow((loc1.getRow() - loc2.getRow()), 2) + Math.pow((loc1.getCol() - loc2.getCol()), 2));
	} 
	
} 