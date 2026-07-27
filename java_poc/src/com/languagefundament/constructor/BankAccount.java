package com.languagefundament.constructor;

public class BankAccount {
	String name;
	long accNum;
	double balance;



	public BankAccount() {
		this("Unknown");
	}

	public BankAccount(String name) {
		this(name,100000000201L);

	}

	public BankAccount(String name, long accNum) {
		this(name,accNum,500.0);
	}


	public BankAccount(String name, long accNum, double balance) {
		this.name = name;
		this.accNum = accNum;
		this.balance = balance;
	}

	void show() {
		System.out.println("Account Holder : "+name);
		System.out.println("Account Number : "+accNum);
		System.out.println("Account Balance : "+balance);
		System.out.println("-------------------------------------");
	}


	public static void main(String[] args) {
		BankAccount b1 = new BankAccount();
		b1.show();
		
		BankAccount b2 = new BankAccount("Rahul");
		b2.show();
		
		BankAccount b3 = new BankAccount("Gopal",234671567342L);
		b3.show();
		
		BankAccount b4 = new BankAccount("Katravath Rakesh",211301006730L,30000.0);
		b4.show();
		
		
	}

}
