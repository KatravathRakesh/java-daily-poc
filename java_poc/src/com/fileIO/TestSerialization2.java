package com.fileIO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Book implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name = "MD_Book";
	transient int bookid = 1234;//0
	 String pwd = "Md@123";//null
	 @Override
	 public String toString() {
		return "Book [name=" + name + ", bookid=" + bookid + ", pwd=" + pwd + "]";
	 }
	
	
	
}
public class TestSerialization2 {

	public static void main(String[] args) throws IOException {
		
		Book b1 = new Book();
		
		File f1 = new File("C:\\Users\\Rakesh\\OneDrive\\Desktop\\Vcube\\FileIO\\md.txt");
		FileOutputStream fos = new FileOutputStream(f1);
		try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(b1);
		}
		
		
	}

}
