package fileWriter;

import java.io.FileWriter;

public class FileWriterDemo {

	public static void main(String[] args) throws Exception {
		FileWriter f = new FileWriter("f://F.txt");
		
		f.write(100);
		f.write("Prathmesh\nwelcome");
		f.write("\n");
		f.write("india");
		f.write("\n");
		char ch[]={'a','b','c'};
		f.write(ch);
		f.flush();
		f.close();
		
	}

}
