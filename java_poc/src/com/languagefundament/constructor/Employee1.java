package com.languagefundament.constructor;

public class Employee1 {
	int id;
	String ename;
	double sal;

	Employee1() {
		System.out.println("No-argument constructor");
		this(22);
	}

	Employee1(int id) {
		this(id,"Rahul");

	}
	
	Employee1(int id,String ename) {
		this(id,ename,10000.0);

	}
	
	Employee1(Employee1 e){
		this(e.id,e.ename,e.sal);
	}
	Employee1(int id,String ename,double sal){
		this.ename = ename;
		this.sal = sal;
		this.id  =id;
	}

	void display() {
		System.out.println("Employee ID : " + id);
		System.out.println("Employee Name : " + ename);
		System.out.println("Employee Salary :" + sal);
		System.out.println("---------------------------------");
	}

	public static void main(String[] args) {
		System.out.println("Main Method started !!");

		Employee1 e2 =new Employee1();
		e2.display();
		
		Employee1 e1 = new Employee1(101,"Rakesh");
		e1.display();
		
		Employee1 e = new Employee1(e1);
		e.display();
		
		
		
		
		

	}

}
