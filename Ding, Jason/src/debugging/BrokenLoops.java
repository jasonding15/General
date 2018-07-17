package debugging;

import java.util.Scanner;

public class BrokenLoops
{
    public static void main(String[] args)
    {
//        method1();
//        method2();
        method3();
    }
    
    /*
     * Intent:
     * Print the sum and the product of the numbers
     * 10, 9, 8 ... 1
     */
    public static void method1()
    {
        int sum = 0;
        int product = 0;
        
        for(int number = 10; number > 1; number++)
        {
            sum = number;
            product *= number;
        }
        
        System.out.println("sum: " + sum);
        System.out.println("product: " + product);
    }

    /*
     * Intent:
     * Accept positive values from the user. Keep track of the smallest
     * value. Stop when the user enters a non-positive (0 or negative) number. 
     */
    public static void method2()
    {
        Scanner fromKeyboard = new Scanner(System.in);
        
        int smallest = 0;
        
        while(smallest > 0)
        {
            System.out.print("Enter positive value (negative to quit): ");
            int input = fromKeyboard.nextInt();
            fromKeyboard.nextLine();
            
            if(input < smallest)
                smallest = input;
        }
        
        fromKeyboard.close();
        
        System.out.println("Smallest: " + smallest);
    }
    
    /*
     * Intent:
     * Accept valid input in the range -50 up to and including 150.
     */
    public static void method3()
    {
        Scanner fromKeyboard = new Scanner(System.in);
        
        System.out.print("Enter number (-50 to 150): ");
        int input = fromKeyboard.nextInt();
        fromKeyboard.nextLine();
        
        while(input < -50 || input > 150)
        {
            System.out.println("\n" + input + " is not in the range -50 to 150.");
            System.out.print("Enter number (-50 to 150): ");
            input = fromKeyboard.nextInt();
            fromKeyboard.nextLine();
            
        }
        
        fromKeyboard.close();
        
        System.out.println("Valid input: " + input);
    }
}