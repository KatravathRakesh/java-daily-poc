package com.oops.inheritance;

class Student implements Cloneable {
	int sid;
	String sname;
	Address address;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	Student(int sid, String sname, Address address) {
		this.sid = sid;
		this.sname = sname;
		this.address = address;
	}
}

class Address {
	String city;

	Address(String city) {
		this.city = city;
	}
}

public class ShaollowCopy {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("Main Method Started :");
		Address address = new Address("Mumbai");
		Student s1 = new Student(101, "Rakesh Naik", address);
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.address.city);
		System.out.println("---------------------------");

		Student s2 = (Student) s1.clone();
		System.out.println(s2.sid);
		System.out.println(s2.sname);
		System.out.println(s2.address.city);
		System.out.println("---------------------------");
		System.out.println("**************************************");
		
		s2.address.city = "Pune";
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.address.city);
		System.out.println("---------------------------");

		System.out.println(s2.sid);
		System.out.println(s2.sname);
		System.out.println(s2.address.city);
		System.out.println("---------------------------");

		System.out.println("Main Method Ended : ");

	}

}
