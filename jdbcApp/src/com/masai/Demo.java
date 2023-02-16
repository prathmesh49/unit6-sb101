package com.masai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Demo {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sb101_b22_db1","root","4355");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from pratham");
			while(rs.next()) {
				System.out.println("name : "+ rs.getString("name"));
				System.out.println("Roll no : "+ rs.getInt("rollno"));
			}
			
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			System.out.println(e.getMessage());
		}
		System.out.println("bye bye");

	}

}
