package algorithmWorkbenchCh3;

public class Pet //Number 1
{
	private String name, animal;
	private int age;
	
	public Pet (String nme, String anmal, int ag)
	{
		name = nme;
		animal = anmal;
		age = ag;
	}
	
	public void setName(String nme)
	{
		name = nme;
	}
	
	public void setAnimal(String anmal)
	{
		animal = anmal;
	}
	
	public void setAge(int ag)
	{
		age = ag;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getAnimal()
	{
		return animal;
	}
	
	public int getAge()
	{
		return age;
	}
}
