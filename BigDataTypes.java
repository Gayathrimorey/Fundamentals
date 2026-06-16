package com.langfundamentals;
import java.math.BigDecimal;
import java.math.BigInteger;
public class BigDataTypes {
	BigDecimal bd1 = new BigDecimal("67486453728984657686");
	BigDecimal bd2 = new BigDecimal("7563265587628984657686");
	BigInteger bi1 = new BigInteger("75637299872648898377627");
	BigInteger bi2 = new BigInteger("9846275829856248898377627");
	
	public static void main(String[] args) {
		 BigDataTypes t = new BigDataTypes();
		 System.out.println(t.bd1.add(t.bd2));
		 System.out.println(t.bd1.multiply(t.bd2));
		 System.out.println(t.bi1.add(t.bi2));
		 System.out.println(t.bi1.multiply(t.bi2));
	}

}
