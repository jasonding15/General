package characterMaker;

public class CM_Tester 
{

	public static void main(String[] args) 
	{
		Jason_CM cm = new Jason_CM();
		char[][] arr = cm.characterToAscii('J');
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}

}
