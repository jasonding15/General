package p13_9;

import java.util.ArrayList;

public class SubstringGenerator
{
	public static void main(String[] args)
	{
		System.out.println(getSubstrings("rum"));
	}

	public static ArrayList<String> getSubstrings(String x)
	{
		ArrayList<String> arr = new ArrayList<String>();
		if (x.length() == 0)
		{
			arr.add("");
			return arr;
		}
		
		for(int i = 0; i <= x.length(); i++)
			arr.add(x.substring(0, i));
		
		for(int i = 1; i < x.length(); i++)
		{
			ArrayList<String> shorterSubstrings = getSubstrings(x.substring(i));
			for(String shorterSubstring : shorterSubstrings)
				arr.add(shorterSubstring);
		}
		
		return arr;
		
		
	}
}