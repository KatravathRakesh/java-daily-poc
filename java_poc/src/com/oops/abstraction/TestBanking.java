package com.oops.abstraction;

public class TestBanking {

	public static void main(String[] args) {
		Banking b = new BankingOperation();
		System.out.println("*********************"+Banking.name+"*************************");
		System.out.println(Bankingabc.b);
		b.deposit(5000.0);
		b.withdraw(7000.0);
		b.checkBalance();

	}

}
