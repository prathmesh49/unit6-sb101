package com.masai.sprint2.fileDemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferDemo {

	public static void main(String[] args) throws Exception {
		File f1 = new File("src/D.txt");
		if(!f1.exists()) {
			System.out.println("no file exist");
			return;
		}
		
		BufferedReader br = new BufferedReader(new FileReader(f1));
		BufferedWriter bw = new BufferedWriter(new FileWriter("src/E.txt"));
		while(true) {
			String line = br.readLine();
			if(line == null) break;
			bw.write(line);
			bw.newLine();
			System.out.println(line);
		}
		System.out.println();
		br.close();
		bw.close();
	}

}
