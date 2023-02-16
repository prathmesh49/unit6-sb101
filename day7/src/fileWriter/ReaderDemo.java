package fileWriter;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderDemo {

	public static void main(String[] args) throws IOException {
	
		Reader reader = new FileReader("f://F.txt");
		
		while(true) {
			int ch = reader.read();
			if(ch==-1) {
				break;
				
			}
			System.out.print((char)ch);
			
			
		}
		reader.close();
	}

}
