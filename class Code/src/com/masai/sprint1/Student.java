package com.masai.sprint1;

public class Student {
	private int rno;
	private String name;
	private int marks;

	public Student(int rno, String name, int marks) {
		super();
		this.rno = rno;
		this.name = name;
		this.marks = marks;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
}
