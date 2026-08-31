package com.oops.encapsulation;

public class TestBank {

	
	public static void main(String[] args) {
		Bank b = new Bank(5000.0);
		System.out.println("*********Bank Account *********");
		b.setAccountNum("213411786123");
		b.setHolderName("Rakesh");
		System.out.println("Account Number : "+b.getAccountNum());
		System.out.println("Account Holder Name : "+b.getHolderName());
		System.out.println("Account Balance : "+b.getBalance());
		
		System.out.println("----------------------------------");
		b.deposit(3000.0);
		System.out.println("Total Balance : "+b.getBalance());
		b.withdrawal(1500.0);
		System.out.println("Total Balance : "+b.getBalance());
		b.withdrawal(7000.0);
		System.out.println("Total Balance : "+b.getBalance());
		
		
	}

}
