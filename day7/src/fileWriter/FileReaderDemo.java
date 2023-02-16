package fileWriter;

import java.io.File;
import java.io.FileReader;

public class FileReaderDemo {

	public static void main(String[] args) throws Exception {
		File f = new File("f://F.txt");
		FileReader fr = new FileReader("f://F.txt");
		
//		char[] chr=new char[(int)f.length()];
//		fr.read(chr);
//		for(char c:chr){
//		System.out.print(c);
//		}
		
		int i=fr.read();
		while( i != -1) {
		System.out.print((char) i);
		i = fr.read();
		}
	}

}
