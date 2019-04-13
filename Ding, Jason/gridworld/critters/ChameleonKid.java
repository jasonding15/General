package critters;

import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;
import java.util.ArrayList;

public class ChameleonKid extends ChameleonCritter
{
	public ArrayList<Actor> getActors()
	{
		ArrayList<Actor> actors = new ArrayList<Actor>();
		int[] d = { Location.AHEAD, Location.HALF_CIRCLE };
		for (Location l : getLocationsInDirections(d))
		{
			Actor act = getGrid().get(l);
			if (act != null)
				actors.add(act);
		}
		return actors;
	}
	
	public ArrayList<Location> getLocationsInDirections(int[] directions)
	{
		 ArrayList<Location> locs = new ArrayList<Location>();
		 Grid<Actor> gr = getGrid();
		 Location l = getLocation();

		 for (int d : directions)
		 {
			 Location neighborLoc = l.getAdjacentLocation(getDirection() + d);
			 if (gr.isValid(neighborLoc))
				 locs.add(neighborLoc);
		 }
		 return locs;
	}
} 
