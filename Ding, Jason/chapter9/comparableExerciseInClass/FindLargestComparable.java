package comparableExerciseInClass;

public class FindLargestComparable 
{

	public static void main(String[] args) 
	{
		Integer a = 1;
		Integer b = 2;
		Integer c = 3;
		System.out.println("Largest int : " + findLargest(a, b, c));
		
		String strB = "alexander";
		String strC = "justin";
		String strA = "span";
		System.out.println("Largest String: " + findLargest(strC, strB, strA));
		
		Human hA = new Human("James", "upper", 130.0);
		Human hB = new Human("Jamal", "upper", 120.0);
		Human hC = new Human("Jones", "lower", 99.0);
		System.out.println("Humans: " + findLargest(hA, hB, hC));

		
	}
	
	public static Comparable findLargest(Comparable a, Comparable b, Comparable c)
	{
		Comparable x;
		if(a.compareTo(b) <= 0)
			x = b;
		else
			x = a;
		if(x.compareTo(c) < 0)
			x = c;
		return x;
	}

}
