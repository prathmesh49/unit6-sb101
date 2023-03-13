package com.masai.sprint1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class D3Stream1 {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(10, "Name1", 850));
		students.add(new Student(12, "Name2", 750));
		students.add(new Student(13, "Name3", 650));
		students.add(new Student(14, "Name4", 950));
		students.add(new Student(15, "Name5", 750));
		students.stream().forEach(s -> System.out.println(s.getMarks()));
		int x=students.stream().collect(Collectors.summingInt(s->s.getMarks()));
		System.out.println(x);
	}

}
