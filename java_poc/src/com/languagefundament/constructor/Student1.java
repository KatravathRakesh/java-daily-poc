package com.languagefundament.constructor;

public class Student1 {
	int id;
	String name;
	String couse;
	
	public Student1() {
		this(1);
	}
	public Student1(int id) {
		this(id,"unknow");
	}
	
	
	public Student1(int id, String name) {
		this(id,name,"unknow");
	}


	public Student1(int id, String name, String couse) {
		this.id = id;
		this.name = name;
		this.couse = couse;
	}


	void show() {
		System.out.println("Student ID : "+id);
		System.out.println("Student Name : "+name);
		System.out.println("Student Couse : "+couse);
		System.out.println("--------------------------------------");
	}
	public static void main(String[] args) {
		Student1 s1 = new Student1();
		s1.show();
		Student1 s2 = new Student1(79);
		s2.show();
		Student1 s3 = new Student1(75,"Rakesh");
		s3.show();
		Student1 s4 = new Student1(89,"Gopal","JFS");
		s4.show();

	}

}
