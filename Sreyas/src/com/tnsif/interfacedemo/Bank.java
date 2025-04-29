package com.tnsif.interfacedemo;
//Demo for interface
//only abstract methods+constants(final)
public interface Bank {
	
	double MINBAL=1000;
	double DEPOSITLIMIT=25000;
	
	
	void withdraw(Account account,double amount);
	void deposit(Account account,double amount);
	
}
