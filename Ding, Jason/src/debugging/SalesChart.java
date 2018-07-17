package debugging;

import java.util.Scanner;

public class SalesChart //Ch 5 cp 12
{
    public static void main(String[] args)
    {
        Scanner fromKeyboard = new Scanner(System.in);
        
        System.out.print("Enter today's sales for store 1: ");
        int store1Sales = fromKeyboard.nextInt();
        
        System.out.print("Enter today's sales for store 2: ");
        int store2Sales = fromKeyboard.nextInt();
        
        System.out.print("Enter today's sales for store 3: ");
        int store3Sales = fromKeyboard.nextInt();
        
        System.out.print("Enter today's sales for store 4: ");
        int store4Sales = fromKeyboard.nextInt();
        
        fromKeyboard.close();
        
        System.out.println("SALES BAR CHART");
        
        printBar(1, store1Sales);
        printBar(2, store2Sales);
        printBar(3, store3Sales);
        printBar(4, store4Sales);
    }
    
    private static void printBar(int storeNum, int sales)
    {
        System.out.print("Store " + storeNum + ": ");
        
        int asterisks = sales / 100;
        for(int a = 1; a <= asterisks; a++)
        {
            System.out.print("*");
        }
        
        System.out.println();
    }
}
