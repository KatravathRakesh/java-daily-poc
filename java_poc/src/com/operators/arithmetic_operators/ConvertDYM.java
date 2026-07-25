package com.operators.arithmetic_operators;
//Convert days into years, months, and days.
public class ConvertDYM {

	public static void main(String[] args) {
		int totalDays = 2323;
		
		int years = totalDays/365;//2
		int remainingDays = totalDays%365;//70
		
		int months = remainingDays/30;//2
		int days = remainingDays%30;//10
		
		System.out.println("Years : "+years);
		System.out.println("Months : "+months);
		System.out.println("Days : "+days);

	}

}
