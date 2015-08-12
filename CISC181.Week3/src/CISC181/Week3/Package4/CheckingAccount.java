package CISC181.Week3.Package4;

import java.io.*;

public class CheckingAccount
{
   private double balance;
   private int number;
   /**
    * Instantiate a checking account
    * @param number
    */
   public CheckingAccount(int number)
   {
      this.number = number;
   }
   
   /**
    * Deposit funds to the instance's account number.  Note there isn't exception handling as there isn't a maximum amount for an account
    * @param amount
    */
   public void deposit(double amount)
   {
      balance += amount;
   }
   
   /**
    * Withdraw funds from instance's account number.  If there are not enough funds, build and throw the custom exception
    * @param amount
    * @throws InsufficientFundsException
    */
   public void withdraw(double amount) throws
                              InsufficientFundsException
   {
      if(amount <= balance)
      {
         balance -= amount;
      }
      else
      {
         double needs = amount - balance;
         throw new InsufficientFundsException(needs);
      }
   }
   
   /**
    * Get the balance of a given account (not a static method)
    * @return
    */
   public double getBalance()
   {
      return balance;
   }
   
   /**
    * Get the Checking Account number (not a static method)
    * @return
    */
   public int getNumber()
   {
      return number;
   }
}
