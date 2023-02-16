package problem2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		System.out.println("enter city names");
	
		List<String> list = new ArrayList<>();
		list.add("kolhaput");
		list.add("sangli");
		list.add("nagpur");
		list.add("pune");
		list.add("kagal");
		list.add("vadgav");
		list.add("bengluru");
		list.add("ahmadabad");
		list.add("mumbai");
		
		
		
		Collections.sort(list,new Comparator<String>() {
			@Override
			public int compare(String o1,String o2) {
				return o1.compareTo(o2);
			}
		});
		System.out.println(list);
	}

}
