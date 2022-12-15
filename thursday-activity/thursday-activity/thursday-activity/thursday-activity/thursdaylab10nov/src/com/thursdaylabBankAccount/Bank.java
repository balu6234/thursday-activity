package com.thursdaylabBankAccount;

public class Bank {
	private String name;
	private int Accountnum;
	private double balance;

	 Bank()
	{
		super();
	}

   Bank(String n,int Act,double bal)
 {
	this.name=n;
	this.Accountnum=Act;
	this.balance=bal;
 }

public String getName() {
	return name;
}

public int getAccountnum() {
	return Accountnum;
}

public double getBalance() {
	return balance;
}

public void setName(String name) {
	this.name = name;
}

public void setAccountnum(int accountnum) {
	Accountnum = accountnum;
}

public void setBalance(double balance) {
	this.balance = balance;
}
}
