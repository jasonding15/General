package r7_7;

import java.util.Arrays;

public class R7_7 
{

	public static void main(String[] args) 
	{
		int[] a = new int[10];
		//a)
		for (int i = 0; i < a.length; i++)
		{
			a[i] = i + 1;
		}
		System.out.println(Arrays.toString(a));
		
		//b)
		a = new int[11];
		for (int i = 0; i < a.length; i++)
		{
			a[i] = i * 2;
		}
		System.out.println(Arrays.toString(a));
		//c)
		a = new int[10];
		for (int i = 0; i < a.length; i++)
		{
			a[i] = (int) Math.pow(i + 1, 2);
		}
		System.out.println(Arrays.toString(a));
		
		//d)
		for (int i = 0; i < a.length; i++)
		{
			a[i] = 0;
		}
		System.out.println(Arrays.toString(a));
		
		//e)
		a = new int[]{1, 4, 9, 16, 9, 7, 4, 9, 11};
		System.out.println(Arrays.toString(a));
	}

}
