package primeNo;

import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		System.out.println(13%(Math.sqrt(13)));
		BigInteger b = BigInteger.ONE;
		BigInteger a = new BigInteger("2");
		System.out.println(b.compareTo(a));
		int counter = 1;
		
		for(counter =1 ; counter <=100 ; counter++) {
			b=b.multiply(BigInteger.valueOf(counter));
		}
		System.out.println(b);
		
	}

}
