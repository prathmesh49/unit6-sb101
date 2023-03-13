package com.masai.sprint2.fileReader;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class Filereader {

	public static void main(String[] args) throws Exception {
		File f1 = new File("src/B.txt");
		if(!f1.exists()) {
			System.out.println("no file exist");
			return;
		}
		
			Reader read = new FileReader(f1);
		
		while(true) {
			int ch = read.read();
			if(ch == -1) break;
			System.out.println((char)ch);
		}
		
		char content[] = new char[(int)f1.length()];
		read.read(content);
		System.out.println(new String(content));
		read.close();
	}

}
