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
	public int compareTo(Human a, Human b)
	{
		if (a.socialClass.compareTo(b.socialClass) < 0)
			return -1;
	}
}
