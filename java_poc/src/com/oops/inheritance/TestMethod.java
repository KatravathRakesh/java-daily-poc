package com.oops.inheritance;

class Vehicle {
	int speed = 50;
	void display() {
		int dist = 10;
		double time = (double)dist/speed;
		
		System.out.println("Time : "+time);
	}
}

class Car extends Vehicle{
	int speed = 100;
	@Override
	void display() {
		int dist = 24;
		double time = (double)dist/speed;
		
		System.out.println("Time : "+time);
	}
}
public class TestMethod  {

	public static void main(String[] args) {
		System.out.println("main method started !!");
		Vehicle v = new Car();
		v.display();//child class
		System.out.println(v.speed);// parent class 

	}
																		
}
