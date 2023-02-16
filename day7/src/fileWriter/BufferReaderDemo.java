package fileWriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDemo {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("f://F.txt");
		BufferedReader br=new BufferedReader(fr);
//		br.lines.forEach(System.out::println);
		//or
		String line=br.readLine();
		while(line != null){
		System.out.println(line);
		line=br.readLine();
		}
		br.close();
	}

}
