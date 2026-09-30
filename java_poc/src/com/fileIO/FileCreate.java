package com.fileIO;

import java.io.File;
import java.io.IOException;

public class FileCreate {

	public static void main(String[] args) throws IOException {
		
		File f1 = new File("C:\\Users\\Rakesh\\OneDrive\\Desktop\\Vcube\\IOException\\file2.txt");
		
		if(!f1.exists()) {
			f1.createNewFile();
			System.out.println("File is Create Successfully !");
		}else {
			System.out.println("File is Already created with same name!");
		}
		

	}

}
