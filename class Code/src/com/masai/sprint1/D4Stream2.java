package com.masai.sprint1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class D4Stream2 {

	public static void main(String[] args) {
		List<String> ls = Arrays.asList("1", "2", "4");

		System.out.println(ls.stream().map(Integer::parseInt).toList());

		Character[] carr = { '5', '2', '4' };
		Stream.of(carr).forEach(System.out::print);
		System.out.println();
		Stream.of(carr).flatMapToInt(IntStream::of).forEach(System.out::print);
		System.out.println();
		String str = "2 3 4 5 5";
		String[] sar = str.split(" ");
		List<Integer> list =  Stream.of(sar).map(Integer::parseInt).toList();
		
		System.out.println();
		List<List<Integer>> ddarr = new ArrayList<List<Integer>>();
//		ddarr.add(Arrays.asList(12,23,45));
//		ddarr.add(Arrays.asList(56,67,78));
//		System.out.println(ddarr);
		String str1 = "2 3 4 5 5";
		String[] sar1 = str1.split(" ");
		ddarr.add(Stream.of(sar1).map(Integer::parseInt).collect(Collectors.toList()));
		
	}

}
