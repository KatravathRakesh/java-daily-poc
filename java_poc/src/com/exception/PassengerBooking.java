package com.exception;

import java.util.Scanner;

public class PassengerBooking {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Enter the Passenger ID : ");
		String pid = s.nextLine();
		System.out.print("Enter the Passenger Age : ");
		String age = s.nextLine();
		try {
			System.out.println("Passenger ID : " + Integer.parseInt(pid));
			System.out.println("Passenger Age : " + Integer.parseInt(age));

		} catch (NumberFormatException e1) {
			System.out.println(e1.toString());
		}
		System.out.println("------------------------------");

		System.out.print("Enter the Total Baggage : ");
		int baggage = s.nextInt();
		System.out.print("Enter the Number Passenger : ");
		int numpassenger = s.nextInt();

		try {
			System.out.println("Avager Baggage : " + (baggage / numpassenger));
		} catch (ArithmeticException e2) {
			System.out.println(e2.toString());
		}

		System.out.println("----------Search Arrays-----------");
		String[] name = { "Rakesh", "Suresh", "Ramesh", "Gopal" };
		try {
			System.out.println(name[5]);

		} catch (ArrayIndexOutOfBoundsException e3) {
			System.out.println(e3.toString());
		}
		System.out.println("------------------------------");
		System.out.print("Enter the Name : ");
		String name1 = s.nextLine();
		s.nextLine();
		try {
			System.out.println(name1.charAt(10));
		} catch (StringIndexOutOfBoundsException e4) {
			System.out.println(e4.toString());
		}

		System.out.println("--------------------------------");
		Object[] obj = { "Ram", 75, "Nikhil" };
		try {
			System.out.print("Enter the Index for check ClassCastException : ");
			int i = s.nextInt();
			System.out.println((String) obj[i]);
		} catch (ClassCastException e5) {
			System.out.println(e5.toString());
		}

		System.out.println("-----------------------");

		String str = null;
		try {
			System.out.println("Length : " + str.length());
		} catch (NullPointerException e6) {
			System.out.println(e6.toString());
		}
		
		System.out.println("---------------------------------------");
		
		s.close();
	}

}
