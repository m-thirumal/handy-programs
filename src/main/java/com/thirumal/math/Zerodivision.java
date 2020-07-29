/**
 * 
 */
package com.thirumal.math;

/**
 * @author Thirumal
 *
 */
public class Zerodivision {

	public static final double ZERO = 0;
	public static final double HALF = 0.5;
	/**
	 * 
	 */
	public Zerodivision() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String... args) {
		System.out.println(ZERO / HALF);
		System.out.println(ZERO / HALF / ZERO);
		System.out.println(0 / ZERO);
	}

}
