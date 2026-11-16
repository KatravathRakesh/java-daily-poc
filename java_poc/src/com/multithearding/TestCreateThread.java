package com.multithearding;

public class TestCreateThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Run Thread : " + i);
		}

	}

	public static void main(String[] args) {

		System.out.println("Main Method Started !!");

		TestCreateThread t1 = new TestCreateThread();
		t1.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread : " + i);

		}

		System.out.println("Main Method Ended !!");

	}

}
