
package com.BankApp;
import java.util.Scanner;
public class BankApplication{
    public static void main(String[]args){
        System.out.println("Please select the Account Type :\n 1. Saving Account"
        		+ "\n2.Current Account "
        		+ "\n3. Fixed Deposit Account");
        Scanner sc=new Scanner(System.in);
        int op=Integer.parseInt(sc.nextLine());
        System.out.println("Enter customer Name :");
        String name=sc.nextLine();
        System.out.println("Enter account no. :");
        String accn=sc.nextLine();
        System.out.println("Enter current balance :");
        double bal=Double.parseDouble(sc.nextLine());
        switch (op){
         case 1:
         SavingsAccount saving=new SavingsAccount(name,accn,bal);
         saving.calculateInterest();
         break;
         case 2:
        	 CurrentAccount current=new CurrentAccount(name,accn,bal);
        	 current.calculateInterest();
        	 current.checkOverdraftLimit();
         break;
         case 3:
        	 FixedDepositAccount fixed=new FixedDepositAccount(name,accn,bal);
         fixed.calculateInterest();
         break;
        }
        
    }

}


