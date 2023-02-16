package problem3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product(4354, "goggle", 200, 500));
		list.add(new Product(5463, "laptop", 200, 4000));
		list.add(new Product(2346, "comptr", 200, 2342));
		list.add(new Product(1234, "mobile", 200, 2342));
		list.add(new Product(5674, "router", 200, 234));

		Collections.sort(list, new Comparator<Product>() {

			@Override
			public int compare(Product o1, Product o2) {
				// TODO Auto-generated method stub
				return o1.getPrice() - o2.getPrice();
			}

		});

		System.out.println(list);
	}

}
