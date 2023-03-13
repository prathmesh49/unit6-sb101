package com.masai.sprint2.printwriterclass;

import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		// create obj of printwriter class
		PrintWriter pw = new PrintWriter("src/A.txt");
		pw.write(100);
		pw.println();
		pw.write(100);
		pw.println();
		pw.print("aall is well");
		pw.println();
		pw.print(false);
		pw.println();
		pw.print(50.50);
		pw.println();
		pw.print('z');
		pw.println();
		pw.print(100);
		pw.close();
		

		
	}

}
