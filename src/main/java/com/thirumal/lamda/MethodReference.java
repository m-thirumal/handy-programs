/**
 * 
 */
package com.thirumal.lamda;

import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * @author Thirumal
 *
 */
public class MethodReference {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream.of(3, 1, 2).forEach(x->System.out.println(x));
		Stream.of(3, 1, 2).forEach(System.out::println);
		Consumer<Integer> printer = System.out::println;
		Stream.of(3, 1, 4, 1, 5, 9)
		.forEach(printer);
	}

}
