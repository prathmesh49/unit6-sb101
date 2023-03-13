package com.masai.resourseDemo;

import java.util.ResourceBundle;

public class ResourseDemo {

	public static void main(String[] args) {
		ResourceBundle bundle = ResourceBundle.getBundle("com.masai.resourseDemo.dbDetails");
		String  name = bundle.getString("name");
		String rno = (String)bundle.getObject("rno");
		System.out.println(name+", "+rno);
	}

}
