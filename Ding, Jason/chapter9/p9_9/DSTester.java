package p9_9;

public class DSTester 
{

	public static void main(String[] args) 
	{
		String str1 = "hello there";
		DataSet ds = new DataSet();
		ds.add(str1);
		String str2 = "what is up";
		ds.add(str2);
		String str3 = "the sun! haha";
		ds.add(str3);
		System.out.println(ds.getMaximum());
		
	}

}
