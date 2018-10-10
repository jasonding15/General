package p4_11;


/**
   A cash register totals up sales and computes change due.
*/
public class CashRegister
{
   /**
      Constructs a cash register with no money in it.
   */
   public CashRegister()
   {
      purchase = 0;
      payment = 0;
   }

   /**
      Records the purchase price of an item.
      @param amount the price of the purchased item
   */
   public void recordPurchase(double amount)
   {
      purchase = purchase + amount;
   }
   
   /**
      Enters the payment received from the customer.
      @param dollars the number of dollars in the payment
      @param quarters the number of quarters in the payment
      @param dimes the number of dimes in the payment
      @param nickels the number of nickels in the payment
      @param pennies the number of pennies in the payment
   */
   public void enterPayment(int dollars, int quarters, 
         int dimes, int nickels, int pennies)
   {
      payment = dollars + quarters * QUARTER_VALUE + dimes * DIME_VALUE
            + nickels * NICKEL_VALUE + pennies * PENNY_VALUE;
   }
   
   /**
      Computes the change due and resets the machine for the next customer.
      @return the change due to the customer
   */
   public double giveChange()
   {
      change = payment - purchase;
      purchase = 0;
      payment = 0;
      change *= 100.0;
      change = Math.round(change) / 100.0;
      return change;
   }

   public int giveDollars()
   {
	   int giveDollars = (int) (change/1);
	   change -= giveDollars * DOLLAR_VALUE;
	   return giveDollars;
   }
   
   public int giveQuarters()
   {
	   int giveQuarters = (int) (change/0.25);
	   change -= giveQuarters * QUARTER_VALUE;
	   return giveQuarters;
   }
   
   public int giveDimes()
   {
	   int giveDimes = (int) (change/0.10);
	   change -= giveDimes * DIME_VALUE;
	   return giveDimes;
   }
   
   public int giveNickels()
   {
	   int giveNickels = (int) (change/0.5);
	   change -= giveNickels * NICKEL_VALUE;
	   return giveNickels;
   }
   
   public int givePennies()
   {
	   int givePennies = (int) (change*100);
	   change -= givePennies * PENNY_VALUE;
	   return givePennies;
   }
   
   public static final double DOLLAR_VALUE = 1;
   public static final double QUARTER_VALUE = 0.25;
   public static final double DIME_VALUE = 0.1;
   public static final double NICKEL_VALUE = 0.05;
   public static final double PENNY_VALUE = 0.01;

   private double purchase;
   private double payment;
   private double change;
}
