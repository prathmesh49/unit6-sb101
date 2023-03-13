package com.masai.sprint2.serialise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Main {
	public static void main(String[] args) throws Exception, IOException {
		Human human = new Human(26, "kapil", 70);

		ObjectOutput oo = new ObjectOutputStream(new FileOutputStream("src/human.ser"));
		oo.writeObject(human);
		oo.close();

		ObjectInput oi = new ObjectInputStream(new FileInputStream("src/human.ser"));
		Human hum1 = (Human) oi.readObject();
		oi.close();
		System.out.println(hum1);
	}
}
