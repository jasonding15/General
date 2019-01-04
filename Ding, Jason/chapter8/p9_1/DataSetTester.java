package p9_1;

public class DataSetTester
{
	public static void main(String[] args)
	{
		Die d1 = new Die(6);
		Die d2 = new Die(7);
		Die d3 = new Die (8);
		System.out.println(d1.getMeasure());
		System.out.println(d2.getMeasure());
		System.out.println(d3.getMeasure());
		DataSet ds = new DataSet();
		ds.add(d1);
		ds.add(d2);
		ds.add(d3);
		d1.cast();
		System.out.println(d1.getMeasure());
		ds.add(d1);
		System.out.println("Average : " + ds.getAverage());
		
	}
}
