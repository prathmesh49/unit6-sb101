package com.collection.treeset;


import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		TreeSet<Integer> s1 = new TreeSet<>((a, b) -> b - a);
		s1.add(1);
		s1.add(2);
		s1.add(5);
		s1.add(4);
		s1.add(2);
		s1.add(4);
		System.out.println(s1.ceiling(1));

		TreeSet<Student> s2 = new TreeSet<>((a, b) -> a.name.compareTo(b.name));
		s2.add(new Student(2, "a"));
		s2.add(new Student(2, "d"));
		s2.add(new Student(5, "w"));
		s2.add(new Student(1, "b"));
		s2.add(new Student(3, "j"));
		System.out.println(s2);

		System.out.println(s2.ceiling(new Student(1, "b")));
	}

}

class Student {
	int rno;
	String name;

	public Student(int rno, String name) {
		this.rno = rno;
		this.name = name;
	}

	@Override
	public String toString() {
		return rno + "\s" + name;
	}

}