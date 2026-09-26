package com.fileIO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CheckedException {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		
//		1.Loading Class Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
//		2.Establish the Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch75","root","Rakey@2233");
		
//		3.Create Statement 
		Statement stmt = con.createStatement();
		
//		4.create ResultSet Object
		String s = "select * from dept";
		ResultSet rs = stmt.executeQuery(s);
		
//		Represent the ResultSet
		while(rs.next()) {
			System.out.print(rs.getInt(1)+" | ");
			System.out.print(rs.getString(2)+" | ");
			System.out.print(rs.getString(3)+" ");
			System.out.println();
		}

	}

}
