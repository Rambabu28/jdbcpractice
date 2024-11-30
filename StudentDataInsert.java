package com.dbmsprj.studentmng;

import java.sql.*;

public class StudentDataInsert {

	public static void main(String[] args) {

		try {
			// register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// establish the connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentbd", "root",
					"@Rambabu1999");
			// create statement
			Statement statement = connection.createStatement();
			// execute Statement
			statement.executeUpdate("insert into student values(2,'Pachipala','Praveen','praveen123@gmail.com')");
			System.out.println("Inserted successfully");
			// close the connection
			connection.close();

		} catch (ClassNotFoundException ce) {

			System.out.println(ce);
		} catch (SQLException se) {
			System.out.println(se);

		}
	}

}
