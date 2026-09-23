package com.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException, FileNotFoundException ,InterruptedException {
		//Checked Exception :IOException
		File f1 = new File("C:\\Users\\Rakesh\\OneDrive\\Desktop\\Vcube\\IOException\\file1.txt");
//		f1.createNewFile();///to file Create we use
		
		@SuppressWarnings("resource")// f2 remove warnings.......
		FileReader f2 = new FileReader(f1); //Checked Exception : FileNotFoundException and it Parent is IOException
		int i = f2.read();
		
		while(i !=-1) {
			System.out.print((char)i);
			i = f2.read();//Checked Exception :IOException
			Thread.sleep(700);
		}

	}

}
