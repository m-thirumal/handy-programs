/**
 * 
 */
package com.thirumal.java8;

import java.util.ArrayList;
import java.util.List;

/**
 * @author thirumal
 *
 */
public class OptionalGetElse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> as = new ArrayList<>();
		System.out.println(as.stream().map(s -> Integer.valueOf(s.length())).reduce((x, y) -> x + (y)).orElseGet(()->Integer.valueOf(2)));
	}

}
