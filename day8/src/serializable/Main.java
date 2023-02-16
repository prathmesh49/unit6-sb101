package serializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		Human h1 = new Human("prathmesh", 23);
		Human h2 = new Human("Ritesh", 43);
		ObjectOutput oo=new ObjectOutputStream(new FileOutputStream("human.ser"));
		
		oo.writeObject(h1);
		oo.writeObject(h2);
		
		oo.close();
		
		System.out.println(h1);
		System.out.println();
	}

}
