package com.tnsif.interfacedemo;

public class BankImple implements Bank{

	@Override
	public void withdraw(Account account, double amount) {
           if(account.getBalance()-amount>MINBAL) {
        	   account.setBalance(account.getBalance()-amount);
        	   System.out.println("withdrawn rupees of"+amount);
           }
		else{
			System.err.println("Insufficient balance to withdraw");
		}
	}

	@Override
	public void deposit(Account account, double amount) {
         
		    if(amount>DEPOSITLIMIT) {
		    	System.out.println("The deposit limit is exceeding");
		    }
		    else {
		    	account.setBalance(account.getBalance()+amount);
		    	System.out.println("The amount after deposit"+account.getBalance());
		    }
		
	}

}
