package com.masai.sprint2.fileDemo;

import java.io.File;
import java.io.IOException;

public class Intro {

	public static void main(String[] args) {
		File f1 = new File("B.txt");
		try {
			f1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(f1.exists());
		System.out.println("path" + f1.getAbsolutePath());
		
		File f2 = new File("F:");
		String[] list = f2.list();
		if(f2.exists()) System.out.println("true");
		for(String el : list) System.out.println(el);
	}

}
