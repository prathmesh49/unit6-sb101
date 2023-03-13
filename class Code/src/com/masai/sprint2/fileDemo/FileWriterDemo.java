package com.masai.sprint2.fileDemo;

import java.io.FileWriter;
import java.io.Writer;

public class FileWriterDemo {

	public static void main(String[] args) throws Exception {
		Writer write = new FileWriter("src/A.txt",true);
		
		write.write(100);
		write.write("\n");
		write.write("I am Prathmesh");
		write.write("\n");
		char[] charar = {'j','a','v','a'};
		
		write.write(charar);
		write.write("\n");
		write.flush();
		write.close();
		
	}

}
