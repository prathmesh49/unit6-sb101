package com.jdbc.day14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatement {
	// you are here means Driver class is loaded
	static final String url = "jdbc:mysql://localhost/sb101_b22_db1";
	static final String username = "root";
	static final String password = "4355";

	static {
		// code to load Driver class
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException ex) {
			System.out.println("Driver class not found, check jar file");
		}
	}

	static Connection connectToDatabase() throws SQLException {
		return DriverManager.getConnection(url, username, password);
	}

	static void CloseConnection(Connection connection) throws SQLException {
		if (connection != null)
			connection.close();
	}

	static boolean updateStudent() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("please check for jar file or path");
			System.out.println();
		}
		return true;
	}

	static boolean deleteStudent() {
		return false;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int choice;
		System.out.println("Enter selections\n 1. update stu details \n 2. delet stu1");
		choice = s.nextInt();
		if (choice == 1) {
			updateStudent();
		} else {
			deleteStudent();
		}
	}

}
