package p10_5;

public class Tester {

	public static void main(String[] args) {
		Employee e = new Employee("bert", 1);
		System.out.println(e.toString());
		e = new Executive("bert", 1, "health");
		System.out.println(e.toString());
	}

}
