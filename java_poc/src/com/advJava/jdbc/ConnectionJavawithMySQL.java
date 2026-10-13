package com.advJava.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJavawithMySQL {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		
		//1.driver class path
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2.connection 
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Rakey@2233");
		
		//3.Statements
		Statement st = con.createStatement();
		
		//4.result set
		String query =
                "INSERT INTO users (sid, sname, age) " +
                "VALUES (1, 'Rakesh', 22)";

        int result = st.executeUpdate(query);

        if (result > 0) {
            System.out.println("Values inserted successfully!");
        } else {
            System.out.println("Insertion failed!");
        }
		
		//5.closing
		st.close();
		con.close();
		

	}

}
