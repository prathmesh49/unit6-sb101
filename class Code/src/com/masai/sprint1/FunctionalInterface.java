package com.masai.sprint1;

import static java.lang.System.out;

public class FunctionalInterface {

	public static void main(String[] args) {

		// Anonymous class
		Intr1 i1 = new Intr1() {

			@Override
			public void sayHello(String name) {
				out.print(name);

			}
		};
		i1.sayHello("prathmesh ");

		// Lambda Expression

		Intr1 i2 = (e) -> out.print(e);

		i2.sayHello("kurane");
	}

}

interface Intr1 {
	void sayHello(String name);
}
