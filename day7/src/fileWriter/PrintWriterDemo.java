package fileWriter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PrintWriterDemo {

	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter("f://F.txt");
		pw.write(100);
		pw.println();
		pw.write(100);
		pw.print(100);
		pw.println();
		pw.print(false);
		pw.println();
		pw.print("Hi Iam prathmesh");
		pw.close();
		
		
		Scanner sc = new Scanner(new FileInputStream("A.txt"));
			System.out.println(sc.next());
	}

}
