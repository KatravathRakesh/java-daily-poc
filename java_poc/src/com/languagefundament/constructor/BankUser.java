package com.languagefundament.constructor;

public class BankUser {
	String bank = "SBI";
	String UserName;
	static long AccNo = 20345612345L;
	String IFSC_NO;

	public BankUser() {
		System.out.println("No Argument");
		bank = "SBI";
		UserName = "John";
		IFSC_NO = "SBIH90345";
	}

	public BankUser(String UserName, String IFSC_NO) {
		AccNo++;
		this.UserName = UserName;
		this.IFSC_NO = IFSC_NO;
		
	}

	void show() {
		System.out.println("Bank Name : " + bank);
		System.out.println("Bank UserName : " + UserName);
		System.out.println("Bank Account No : " + AccNo);
		System.out.println("Bank IFSC No : " + IFSC_NO);
		System.out.println("**************************");
	}

	public static void main(String[] args) {
		BankUser b1 = new BankUser();
		b1.show();
		
		BankUser b2 = new BankUser("Rakesh", "SBIH80345");
		b2.show();

		BankUser b3 = new BankUser("Suresh", "SBIM89345");
		b3.show();

		BankUser b4 = new BankUser("Gopal", "SBIA90305");
		b4.show();

		BankUser b5 = new BankUser("Rahul", "SBIH90345");
		b5.show();

		BankUser b6 = new BankUser("Ram", "SBIH90345");
		b6.show();

	}

}
