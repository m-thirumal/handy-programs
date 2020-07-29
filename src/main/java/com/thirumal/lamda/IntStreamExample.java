/**
 * 
 */
package com.thirumal.lamda;

import java.io.IOException;

/**
 * @author Thirumal
 *
 */
public class IntStreamExample {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		java.util.stream.IntStream.range(0, 4).forEach(System.out::println);
		System.out.println("Waiting");
	//	System.in.read();
		//Sum  of arithmetic series
		var a = java.util.stream.IntStream.rangeClosed(0, 4).sum();
		System.out.println(a);
	}

}
