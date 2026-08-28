package com.oops.inheritance;

class Student1 {

	int sid;
	String sname;
	Address1 address;

	Student1(int sid, String sname, Address1 address) {

		this.sid = sid;
		this.sname = sname;
		this.address = address;

	}

	Student1(Student1 s1) {

		this.sid = s1.sid;
		this.sname = s1.sname;
		this.address = new Address1(s1.address);

	}

}

class Address1 {

	String city;

	Address1(String city) {
		this.city = city;

	}

	Address1(Address1 address) {
		this.city = address.city;

	}

}

public class DeepCopy {

	public static void main(String[] args) {

		Address1 address = new Address1("Delhi");
		Student1 s1 = new Student1(101, "Ramesh", address);

		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.address.city);
		System.out.println("---------------------------");

		Student1 s2 = new Student1(s1);
		System.out.println(s2.sid);
		System.out.println(s2.sname);
		System.out.println(s2.address.city);
		System.out.println("---------------------------");

		System.out.println("***************************************");
		
		s2.address.city = "Goa";
		
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.address.city);
		System.out.println("---------------------------");

		System.out.println(s2.sid);
		System.out.println(s2.sname);
		System.out.println(s2.address.city);
		System.out.println("---------------------------");

	}

}