package com.oops.encapsulation;

public class TestStudent {

	public static void main(String[] args) {
		Student s1 = new Student();

		s1.setId(9);
		s1.setName("Rakesh");
		s1.setMarks(77);
		s1.setcollegeName("VCube");
		
		System.out.println(s1);
		
		
		Student s2 = new Student();
		System.out.println(s2);
		
		Student s3 = new Student();

		s3.setId(7);
		s3.setName("Gopal Naik");
		s3.setMarks(45);
		s3.setcollegeName("MRCET");
		
		System.out.println(s3);

	}

}
