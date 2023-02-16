package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InsertJDBCdEOMO {

	public static void main(String[] args) {
		Connection con = null;
		// step - 1
		// write code to load driver class
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			// call the get connection method using driver manager class
			String url = "jdbc:mysql://localhost/sb101_b22_db1";
			String userName = "root";
			String pass = "4355";
			con = DriverManager.getConnection(url, userName, pass); // step - 2
			System.out.println("Connection successfull");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} finally {
			if (con != null) {
				try {
					con.close();
					System.out.println("connection closed");
				} catch (SQLException e2) {
					// TODO: handle exception
				}
			}
		}

	}
}
