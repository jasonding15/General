package p10_6;

public class Tester {

	public static void main(String[] args) {
		Worker w = new HourlyWorker("bert", 1);
		double d = ((HourlyWorker) w).computePay(4);
		System.out.println(d);
	}

}
