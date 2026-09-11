package com.oops.abstraction;

public class BankingOperation extends Bankingabc {

	double balance = 10000.0;
	@Override
	public void deposit(double amount) {
		checkBalance();
		if(amount<0) {
			System.out.println("Invaild Amount Entered : ");
		}else {
			balance += amount;
			System.out.println("Deposit amount : "+amount);
			checkBalance();
		}
		
	}

	@Override
	public void withdraw(double amount) {
		if(amount <= balance) {
			balance -= amount;
			System.out.println("Withdraw amount : "+amount);
			checkBalance();
		}else {
			System.out.println("insufficient  Amount you want withdraw ad check balance !");
		}
		
	}

	@Override
	public void checkBalance() {
		System.out.println("Total final balance : "+balance);
		
	}
}
