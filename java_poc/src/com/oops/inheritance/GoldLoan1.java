package com.oops.inheritance;

public class GoldLoan1 extends Loan1Impl{

	void GoldLoanDocInfo() {
		System.out.println("Person Loan document have been receive Successfully !");
	} 
	
	@Override
	public double getLoneROI() {
		int cibil = getCibilScore();
		double roi = 5.5;
		if (cibil >= 300 && cibil < 550) {
			System.out.println(" Poor credit-- loans are rarely approved");
			return roi + 1;
		} else if (cibil >= 550 && cibil < 650) {
			System.out.println("Fair credit-- some lenders may hesitate.");
			return roi;
		} else if (cibil >= 650 && cibil < 750) {
			System.out.println("Very good credit--high probability of loan approval.");
			return roi - 2;
		} else if (cibil >= 750 && cibil < 900) {
			System.out.println("Excellent creditworthiness -- best chances for loans and pre-approved offers.");
			return roi - 4;
		} else {
			System.out.println("Invaild Cibil Score ! ");
			return roi + 10;
		}
	}
	public static void main(String[] args) {
		System.out.println("Welcome to V-Cube Gold Loan Banking : ");

		GoldLoan1 gl = new GoldLoan1();
		String name = gl.getUserName();
		System.out.println("Hello !,"+name+" How can, I help you ?");
		
		if (gl.isAadharVaild() && gl.isPhoneVaild() && gl.isPANVaild()) {
			System.out.println("Given Information are Vaild, We can Continue for their information ! ");
			double sal = gl.getSalary();
			int age = gl.getAge();
			int cibil = gl.getCibilScore();
			double roi = gl.getLoneROI();
			if (sal >= 400000.0 && age >= 27 && (cibil >= 300 && cibil <= 900)) {
				System.out.println("Congratulations , Your Eligible for Gold Loan !");
				System.out.println("Your Rate of Interest : "+roi);
				gl.GoldLoanDocInfo();
			}
		}else {
			System.out.println("Something Invaild in Given Info !");
		}

	}

}
