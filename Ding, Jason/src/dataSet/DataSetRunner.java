package dataSet;

public class DataSetRunner {

	public static void main(String[] args) 
	{
		DataSet dS1 = new DataSet(9);
		DataSet dS2 = new DataSet();
		
		dS1.addValue(4.4);
		dS1.addValue(5);
		System.out.println(dS1.getMean());
		
		dS2.addValue(0);
		dS2.addValue(5);
		System.out.println(dS2.getSum());
	}

}
