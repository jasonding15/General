package critters;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import java.util.ArrayList;
import java.awt.Color;

public class BlusterCritter extends Critter
{
	private int courageLevel;

	public BlusterCritter(int c)
	{
		super();
		courageLevel = c;
	}
 
	public ArrayList<Actor> getActors()
	{
		ArrayList<Actor> actors = new ArrayList<Actor>();

		Location loc = getLocation();
		for(int r = loc.getRow() - 2; r <= loc.getRow() + 2; r++ )
			for(int c = loc.getCol() - 2; c <= loc.getCol() + 2; c++)
			{
				Location temp = new Location(r,c);
				if(getGrid().isValid(temp))
				{
					Actor a = getGrid().get(temp);
					if(a != null && a != this)
						actors.add(a);
				}
			}
		return actors;
	} 
	
	public void processActors(ArrayList<Actor> actors)
	{
		int count = 0;
		for(Actor a: actors)
			if(a instanceof Critter)
				count++;
		
		if(count < courageLevel)
			lighten();
		else
			darken();
	}
	
	private void darken()
	{
		double f = 0.9;
		Color c = getColor();
		int red = c.getRed();
		int green = c.getGreen();
		int blue = c.getBlue();
		if(red > 0) 
			red *= f;
		if(green > 0) 
			green *= f;
		if(blue > 0) 
			blue*= f;
		setColor(new Color(red, green, blue));
	 } 
	
	 private void lighten()
	 {
		 double f = 1.1;
		 Color c = getColor();
		 int red = c.getRed();
		 int green = c.getGreen();
		 int blue = c.getBlue();
		 if(red < 255) 
			 red *= f;
		 if(green < 255) 
			 green *= f;
		 if(blue < 255)
	 		blue *= f;
	 	setColor(new Color(red, green, blue));
	 } 
}