package com.fileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestDeSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		File f1 =new  File("C:\\Users\\Rakesh\\OneDrive\\Desktop\\Vcube\\FileIO\\test1.ser");
		FileInputStream  fis = new FileInputStream(f1);
		try (ObjectInputStream ois = new ObjectInputStream(fis)) {
			Employee obj = (Employee)ois.readObject();
			
			System.out.println(obj);
		}

	}

}
