package com.oops.encapsulation;

public class Bank {

	private String accountNum;
	private String holderName;
	private double balance ;
	private double amount;

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setAmount(double amount) {
		if(amount > 0) {
			this.amount = amount;
		}else {
			System.out.println("Invaild Amount you Entered !");
		}
	}

	public double getAmount() {
		return amount;
	}

	public double deposit(double amount) {
		balance += amount;
		return balance;
	}
	
	public double withdrawal(double amount) {
		if(balance >= amount) {
			balance -= amount;
			return balance;
		}else {
			System.out.println("Insufficient Balance , Check Account Balance !");
			return 0;
		}
	}
	
	public Bank(double balance){
		this.balance = balance;
	}

}
