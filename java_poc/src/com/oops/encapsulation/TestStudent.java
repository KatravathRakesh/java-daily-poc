package com.oops.encapsulation;

public class TestStudent {

	public static void main(String[] args) {
		Student s1 = new Student();

		s1.setId(9);
		s1.setName("Rakesh");
		s1.setMarks(77);

		System.out.println(s1);
		
		Student s2 = new Student();
		System.out.println(s2);

	}

}
