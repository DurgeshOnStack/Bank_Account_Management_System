
	package com.BankApp;
	class CurrentAccount extends CustomerDetails{
		protected double overdraftLimit=5000.0;
		CurrentAccount(String accountHolderName,String accountNumber,double balance){
		    super(accountHolderName,accountNumber,balance);
		    this.overdraftLimit=overdraftLimit;
		}
		@Override
		public void calculateInterest(){
		    System.out.println("Current accounts do not earn interest.");
		}
		public void checkOverdraftLimit(){
		    System.out.println("Overdraft limit RS : "+overdraftLimit);
		}
		}
