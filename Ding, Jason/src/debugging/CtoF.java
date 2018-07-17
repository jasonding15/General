package debugging;

public class CtoF //CH5 pc 13
{
    public static void main(String[] args)
    {
//      System.out.println(convertToFahrenheit(2));
    		System.out.println("Centigrade\tFahrenheit");
        for(double centigrade = 0.00; centigrade <= 20; centigrade++)
        {
        	double fahrenheit = convertToFahrenheit(centigrade);
        System.out.println(centigrade + "\t\t" + fahrenheit);
        }
    }
    
    private static double convertToFahrenheit(double centigrade)
    {
        return 9 * centigrade / 5 + 32;
    }
}
