package com.BankApp;

	class FixedDepositAccount extends CustomerDetails{
	    protected double interestRate=6.5;
	    protected int depositeTerm;
	    FixedDepositAccount(String accountHolderName,String accountNumber,double balance){
	        super(accountHolderName,accountNumber,balance);
	        this.interestRate=interestRate;
	        setDepositeTerm(depositeTerm);
	    }
	    
	    public double getInterestRate() {
			return interestRate;
		}

		public void setInterestRate(double interestRate) {
			this.interestRate = interestRate;
		}

		public int getDepositeTerm() {
			return depositeTerm;
		}


		public void setDepositeTerm(int depositeTerm){
	        if(depositeTerm<0){
	            System.out.println("DepositeTerm cannot be negative.");
	        }
	    }
		@Override
	    public void calculateInterest(){
	        balance=balance+(balance*6.5);
	        System.out.println("Fixed Deposite Interest for 5 years RS ; "+balance);
	    }
	}

