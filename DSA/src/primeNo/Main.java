package primeNo;

import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		System.out.println(13%(Math.sqrt(13)));
		String l = "2367495770217142995264827948666809233066409497699870112003149352380375124855230068487109373226251983";
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
