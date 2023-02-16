package set;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Set<Integer> s = new TreeSet<>();
		s.addAll(Arrays.asList(9,4,5,1,2,3));
		
		System.out.println(s);
	
	}

}
