package p4_5and6;

public class DataSetTester {

	public static void main(String[] args) {
		DataSet ds = new DataSet();
		ds.addValue(4);
//		System.out.println(ds.getLargest());
//		System.out.println(ds.getSmallest());
		ds.addValue(11);
//		System.out.println(ds.getSum());
//		System.out.println(ds.getAverage());
		ds.addValue(10);
		ds.addValue(-20);
		ds.addValue(104);
		System.out.println(ds.getSum());
		System.out.println(ds.getAverage());
		System.out.println(ds.getLargest());
		System.out.println(ds.getSmallest());
	}

}
