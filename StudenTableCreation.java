package com.dbmsprj.studentmng;

import java.sql.*;

public class StudenTableCreation {
	public static void main(String[] args) {
		try {
			//1. register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2. to establish connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentbd", "root",
					"@Rambabu1999");
			// create statement
			Statement statement = connection.createStatement();
			// Execute query
			statement.execute(
					"CREATE TABLE student1 ( student_id INT AUTO_INCREMENT PRIMARY KEY, first_name VARCHAR(50) NOT NULL,last_name VARCHAR(50),email VARCHAR(100) UNIQUE)");
			System.out.println("created sucussfully");
			
			// close the connection
			connection.close();

		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException se) {

			System.out.println(se);
		}

	}
}
