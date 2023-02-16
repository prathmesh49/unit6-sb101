package fileWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("f://F.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(100);//d will be added
		bw.newLine(); //inserting a new line
		bw.write("ritesh");
		bw.newLine();
		bw.write("india");
		bw.newLine();
		char ch[]={'a','b','c'};
		bw.write(ch);
		bw.flush();
//		bw.close();
		System.out.println("done");

	}

}
