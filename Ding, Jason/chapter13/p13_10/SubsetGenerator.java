package p13_10;

import java.util.ArrayList;

public class SubsetGenerator
{
	public static void main(String[] args)
	{
		System.out.println(getSubsets("rum"));
	}

	public static ArrayList<String> getSubsets(String x)
	{
		ArrayList<String> permutations = new ArrayList<String>();
		
		if(x.length() == 0)
		{
			permutations.add(""); // line doesn't seem to get runned
			return permutations;
		}
		
		permutations.add(""); // this adds four more subsets ???
		
		for(int i = 0; i < x.length(); i++)
		{
			ArrayList<String> shorterSubsets = getSubsets(x.substring(i + 1));
			for(String shorterSubset : shorterSubsets)
				permutations.add(x.substring(i, i + 1) + shorterSubset);
		}
		
		return permutations;
	}
}