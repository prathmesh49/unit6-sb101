package dserializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

import serializable.Human;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInput oi = new ObjectInputStream(new FileInputStream("human.ser"));
		
		Human human = (Human)oi.readObject();
		Human human2 = (Human)oi.readObject();
		
		System.out.println(human2);
		oi.close();
	}

}
