package com.masai.sprint1;

import java.util.function.ToIntFunction;

public class D4Stream3 {

	public static void main(String[] args) {
		 ToIntFunction<Double> ob =new ToIntFunction<Double>() {
			
			@Override
			public int applyAsInt(Double value) {
				
				return (int) (value * 2);
			}
		};
		  
	        // Applying the above function
	        // using applyAsInt()
	        System.out.println(ob.applyAsInt(3.2));
	}

}
