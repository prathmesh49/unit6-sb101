package fileIO;

import java.io.File;

public class Main {

	public static void main(String[] args) throws Exception {
		File f = new 	File("F:\\unit - 6\\MyNew");
		System.out.println(f.exists());
		f.mkdir();
		System.out.println(f.exists());
		File f1 = new 	File("F:\\unit - 6\\MyNew\\F.txt");
		f1.createNewFile();
		System.out.println(f1.exists());
	}

}
