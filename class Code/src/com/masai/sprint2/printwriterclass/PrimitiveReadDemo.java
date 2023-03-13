package com.masai.sprint2.printwriterclass;

import java.io.FileInputStream;
import java.util.Scanner;

public class PrimitiveReadDemo {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new FileInputStream("src/student.txt"));
		System.out.println(sc.next()+" "+sc.nextInt()+" "+sc.nextDouble()+" "+sc.nextBoolean()+" "+ sc.nextLine());
		sc.close();
	}

}
