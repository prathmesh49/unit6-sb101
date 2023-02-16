package serializable;

import java.io.Serializable;

public class Human implements Serializable {
	String name;
	int age;
	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + "]";
	}
	
}
