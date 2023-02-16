package fileIO;

import java.io.File;

public class Main2 {

	public static void main(String[] args) throws Exception {
		File f = new File("F.txt");
		System.out.println(f.exists());
		System.out.println(f.createNewFile());
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		System.out.println(f.getName());
	}

}
