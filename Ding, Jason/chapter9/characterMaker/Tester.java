package characterMaker;


public class Tester 
{

	public static void main(String[] args) 
	{
		Jason_CM j = new Jason_CM();
		char[][] arr = j.createJ();
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}

}
