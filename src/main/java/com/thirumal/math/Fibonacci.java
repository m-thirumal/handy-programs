/**
 * 
 */
package com.thirumal.math;

import java.math.BigInteger;

/**
 * @author thirumal
 *
 */
public class Fibonacci {

	private static BigInteger TWO = BigInteger.valueOf(2);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (var i = 0; i < 40; i++) {
			System.out.println(" i = " + i + " ==> " + calculate(BigInteger.valueOf(i)));
		}
	}
	
	private static BigInteger calculate(BigInteger number) {
		if (number.equals(BigInteger.ONE) || number.equals(BigInteger.ZERO)) {
			return number;
		} else {
			return calculate(number.subtract(BigInteger.ONE)).add(calculate(number.subtract(TWO)));
		}
	}

}
