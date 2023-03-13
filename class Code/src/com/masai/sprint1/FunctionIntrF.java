package com.masai.sprint1;

import java.io.PrintStream;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionIntrF {

	public static void main(String[] args) {
		Function<String, Double> c6 =Double::parseDouble;
		Exception ex = new ArrayIndexOutOfBoundsException("Not a Valid index");
		Supplier<String> c7 = ex::toString;
		c7.get();
		
		Exception ex1 = new ArrayIndexOutOfBoundsException(2);
		Consumer<PrintStream> c8 = ex1::printStackTrace;
		c8.accept(System.out);
		
		Set<Integer> set= new LinkedHashSet<>();
		Consumer<Integer> c9 = set::add;
		c9.accept(9);
		
		List<String> list = null;
		list.add("One");
		Consumer<String> c10 = list::add;
		c10.accept("ontwo");
		
		Map<Integer, String> map = new LinkedHashMap<>();
		BiFunction<Integer, String, String> c11 = map::putIfAbsent; 
		c11.apply(3, "three");
		StringBuilder sb = new StringBuilder();
		Function<String, StringBuilder> bif= (s)-> new StringBuilder(s); 
		StringBuilder s1 = bif.apply("sd");
	}

}
