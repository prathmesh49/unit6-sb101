package com.masai.sprint2.serialise;

import java.io.Serializable;

public class Human implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int age;
	String name;
	int weight;

	public Human(int age, String name, int weight) {
		super();
		this.age = age;
		this.name = name;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Human [age=" + age + ", name=" + name + ", weight=" + weight + "]";
	}

}
