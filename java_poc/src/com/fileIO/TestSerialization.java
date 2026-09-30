package com.fileIO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	String username = "Rakesh";
	transient String password = "Rakey@2233";

	@Override
	public String toString() {
		return "Employee [username=" + username + ", password=" + password + "]";
	}

}

public class TestSerialization {

	public static void main(String[] args) throws IOException {

		Employee emp = new Employee();

		File f1 = new File("C:\\Users\\Rakesh\\OneDrive\\Desktop\\Vcube\\FileIO\\test1.ser");
		FileOutputStream fos = new FileOutputStream(f1);
		try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(emp);
		}

	}

}
