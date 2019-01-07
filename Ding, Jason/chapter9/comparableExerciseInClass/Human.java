package comparableExerciseInClass;

public class Human implements Comparable<Human>
{
	private String socialClass, name;
	private Double wealth;
	public Human(String name, String socialClass, Double wealth)
	{
		this.name = name;
		this.socialClass = socialClass;
		this.wealth = wealth;
	}
	
	public int compareTo(Human other) // based off class first, then wealth, then name (alphabetically)
	{
		if (this.socialClass.compareTo(other.socialClass) != 0)
			return this.socialClass.compareTo(other.socialClass);
		if(this.wealth.compareTo(other.wealth) != 0)
			return this.wealth.compareTo(other.wealth);
		return this.name.compareTo(other.name);
		
	}
	
	public String toString()
	{
		return name + ", Social Class: " + socialClass + ", Wealth: " + wealth;
	}
	
}
