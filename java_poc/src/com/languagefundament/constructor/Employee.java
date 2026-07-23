package com.languagefundament.constructor;

public class Employee {

	int id;
	String name;
	double sal;
	
	
	public Employee() {
		this(2);
	}


	public Employee(int id) {
		this(id,"unknow");
		
	}


	public Employee(int id, String name) {
		this(id,name,300000.0);
	}


	public Employee(int id, String name, double sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	void show() {
		System.out.println("Employee ID : "+id);
		System.out.println("Employee Name : "+name);
		System.out.println("Employee Salary : "+sal);
		System.out.println("-------------------------------");
	}

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.show();
		
		Employee e2 = new Employee(88);
		e2.show();
		
		Employee e3 = new Employee(79,"Ganesh");
		e3.show();
		
		Employee e4 = new Employee(343,"Rakesh",400000);
		e4.show();
		
	}

}
