package com.multithearding;

class Thread1 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Thread1 : " + i);
		}

	}

}

class Thread2 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Thread2 : " + i);
		}

	}

}

class Thread3 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Thread3 : " + i);
		}

	}

}

public class CreateMultipleThread {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3();
		System.out.println(Thread.currentThread());

		System.out.println(t1.getName());
		System.out.println(t2.getName());
		System.out.println(t3.getName());
		
		System.out.println("--------------------------");

		t1.start();
		t2.start();
		t3.start();

	}

}
