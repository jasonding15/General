package p9_2;

public class DataSetTester
{
	public static void main(String[] args)
	{
		Quiz q = new Quiz("A+", 98);
		DataSet ds = new DataSet();
		ds.add(q);
		q = new Quiz("A-", 92);
		ds.add(q);
		q = new Quiz("C+", 79);
		ds.add(q);
		System.out.println("Average " + ds.getAverage());
		System.out.println("Max: " + ds.getMaximum());
		
	}
}
