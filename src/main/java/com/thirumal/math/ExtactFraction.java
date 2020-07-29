package com.thirumal.math;

import java.math.BigDecimal;
import java.math.BigInteger;

public class ExtactFraction {

	public static void main (String[] str) {
		BigDecimal bd = new BigDecimal( "23452.452" );
		System.out.println(bd.remainder(BigDecimal.ONE));
		System.out.println(bd.remainder(BigDecimal.ONE).multiply(new BigDecimal(10).pow(bd.remainder(BigDecimal.ONE).precision())).toBigInteger());
		BigDecimal fract = bd.remainder(BigDecimal.ONE).multiply(new BigDecimal(10).pow(bd.remainder(BigDecimal.ONE).precision()));
		System.out.println(fract);
		System.out.println(new BigDecimal(bd.toBigInteger()));
	}
}
