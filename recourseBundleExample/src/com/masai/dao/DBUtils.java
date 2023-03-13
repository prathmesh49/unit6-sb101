package com.masai.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DBUtils {
	static String URL;
	static String USERNAME;
	static String PASSWORD;
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {

		}
		ResourceBundle b = ResourceBundle.getBundle("dbDetails");
		URL = b.getString("url");
		USERNAME = b.getString("username");
		PASSWORD = b.getString("password");
	}

	static Connection connectToDB() throws SQLException {
		return DriverManager.getConnection(URL, USERNAME, PASSWORD);
	}

	static void closeConnection(Connection c) throws SQLException {
		c.close();
	}
}
