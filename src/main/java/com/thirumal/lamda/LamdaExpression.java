/**
 * 
 */
package com.thirumal.lamda;

import java.util.function.BiConsumer;

/**
 * @author Thirumal
 *
 */
public class LamdaExpression {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 BiConsumer<String, String> bi = (a, b) -> System.out.println(a + b);
	        bi.accept("Thirumal ", "----------");
	}

}
