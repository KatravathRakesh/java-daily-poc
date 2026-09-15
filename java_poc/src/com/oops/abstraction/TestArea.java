package com.oops.abstraction;

class Circle extends Shape {

	double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	@Override
	double area() {
		return Math.PI * radius * radius;
	}
}

class Rectangle extends Shape {

	double width;
	double heigth;

	Rectangle(double width, double heigth) {
		this.width = width;
		this.heigth = heigth;
	}

	@Override
	double area() {
		return width * heigth;
	}
}


class Triangle extends Shape {
	
	double base;
	double heigth;
	
	Triangle(double base, double heigth){
		this.base = base;
		this.heigth = heigth;
	}
	@Override
	double area() {
		return 0.5*base*heigth;
	}
}
public class TestArea {

	public static void main(String[] args) {
		Shape a1 = new Circle(5);
		System.out.println("Area of Circle : "+a1.area());
		Shape a2 = new Rectangle(3.5,6.8);
		System.out.println("Area of Rectangle : "+a2.area());
		Shape a3 = new Rectangle(3.5,6);
		System.out.println("Area of Triangle : "+a3.area());

	}

}
