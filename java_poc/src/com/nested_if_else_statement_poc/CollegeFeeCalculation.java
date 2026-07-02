package com.nested_if_else_statement_poc;

import java.util.Scanner;
//Calculate fee based on category and scholarship.
public class CollegeFeeCalculation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Student Category : ");
		String category = s.nextLine();
		System.out.print("Enter the scholarship % : ");
		int per = s.nextInt();
		int base_fee = 0 ;
		
		if(category.equals("General")) {
			base_fee = 50000;
		}else if(category.equals("OBC")) {
			base_fee = 40000;
		}else if(category.equals("SC")) {
			base_fee = 30000;
		}else if(category.equals("ST")) {
			base_fee = 25000;
		}else {
			System.out.println("Not in the Category !");
			return;
		}
		
		if(per >=0 && per <=100) {
		int scholarship_amount = (base_fee *per)/100;
		
		int final_fee = base_fee - scholarship_amount;
		System.out.println("Base Fee : "+base_fee);
		System.out.println("Scholarship Amount : "+scholarship_amount);
		System.out.println("Final Fee : "+final_fee);
		}else {
			System.out.println("Invalid Scholarship Percentage!");
		}
		

	}

}
