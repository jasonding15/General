package characterMaker;

import java.util.Arrays;

public class CM_Tester 
{

	public static void main(String[] args) 
	{
		Jason_CM cm = new Jason_CM();
		char[][] arr = cm.createJ();
		System.out.println(Arrays.toString(arr));
	}

}
