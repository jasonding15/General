package programmingChallenge;

public class LandCalc {

	public static void main(String[] args) 
	{
//		 purpose, calculate the number of acres in the land
//		 input land (in sq ft), sq ft in acre, divide land by sq ft acre, output quotient
	
		double land = 389767, acre = 43560;
		double acres_in_land = land / acre;
		System.out.println("There are " + acres_in_land + " acres in the land.");
	}

}
