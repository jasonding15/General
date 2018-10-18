package p5_3;

import java.util.Scanner;

public class TFRunner 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter three doubles(separated by returns): ");
		double n1 = in.nextDouble();
		double n2 = in.nextDouble();
		double n3 = in.nextDouble();
		in.close();
		ThreeFloats tf = new ThreeFloats(n1, n2, n3);
		System.out.println(tf.getOrder());

		
	}

}
