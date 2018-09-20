package p2_5;

import java.awt.Color;

public class BrighterDemo //P2.5
{

	public static void main(String[] args) 
	{
		Color col = new Color(50, 100, 150);
		System.out.println(col);
		col = col.brighter();
		System.out.println(col);
	}

}
