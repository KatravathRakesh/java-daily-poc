package com.oops.inheritance;

class Employee {
	void work() {
		System.out.println("Working.");
	}
}

class Doctor extends Employee {

	@Override
	void work() {
		System.out.println("Doctor");
	}
}

class Nurse extends Employee {

	@Override
	void work() {
		System.out.println("Nurse");
	}
}

class Receptionist extends Employee {
	@Override
	void work() {
		System.out.println("Receptionist");
	}
}

public class TestEmployee {

	public static void main(String[] args) {
		Employee e1 = new Doctor();
		e1.work();
		Employee e2 = new Nurse();
		e2.work();
		Employee e3 = new Receptionist();
		e3.work();

	}

}
