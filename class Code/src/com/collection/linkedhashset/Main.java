package com.collection.linkedhashset;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<>();
		set.add(1);
		set.add(1);
		set.add(7);
		set.add(4);
		set.add(5);
		set.add(6);
		set.stream().forEach(System.out::println);
		System.out.println();
		set.parallelStream().forEach(System.out::println);
		
		set.removeIf(e->e>5);
		System.out.println(set);
		set.removeAll(set);
		System.out.println(set);
	}

}
