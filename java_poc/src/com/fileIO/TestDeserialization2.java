package com.fileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestDeserialization2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		File f1 = new File("C:\\Users\\Rakesh\\OneDrive\\Desktop\\Vcube\\FileIO\\md.txt");
		FileInputStream fis = new FileInputStream(f1);
		try (ObjectInputStream ois = new ObjectInputStream(fis)) {
			Book b1 = (Book)ois.readObject();
			
			System.out.println(b1);
			
		}
		
	}

}
