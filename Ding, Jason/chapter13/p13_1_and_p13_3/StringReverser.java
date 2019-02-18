package p13_1_and_p13_3;

public class StringReverser
{
	public static void main(String[] args)
	{
	    System.out.println(reverseIteratively("whatsup!"));
	    System.out.println(reverse("whatsup!"));
	}
	
	public static String reverse(String toReverse)
	{
		if (toReverse.length() <= 1)
			return toReverse;
		return reverse(toReverse.substring(1)) + toReverse.substring(0,  1);
	}
	
	public static String reverseIteratively(String toReverse)
	{
		char[] arr = toReverse.toCharArray();
		for (int i = 0; i < arr.length / 2; i++)
		{
			char temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - 1 - i] = temp;
		}
		String str = "";
		for (int j = 0; j < arr.length; j++)
			str += arr[j];
		return str;
	}
}