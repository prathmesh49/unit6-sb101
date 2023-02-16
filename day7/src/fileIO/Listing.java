	package fileIO;

import java.io.File;

public class Listing {

	public static void main(String[] args) {
		File f = new File("f://");
		String str[] =f.list();
		for( String el : str) System.out.println(el);
		
		File file[] = f.listFiles();
		for( File el : file) System.out.println(el);
	}

}
