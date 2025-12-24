package com.BankApp;
	class SavingsAccount extends CustomerDetails{
		   protected double interestRate=4.0;
		   SavingsAccount(String accountHolderName,String accountNumber,double balance){
		    super(accountHolderName,accountNumber,balance);
		    this.interestRate=interestRate;
		   }
		   @Override
		   public void calculateInterest(){
		    balance=balance+(balance*4.0/100);
		    System.out.println("Savings Account Interest RS :"+balance);
		   }
		}

