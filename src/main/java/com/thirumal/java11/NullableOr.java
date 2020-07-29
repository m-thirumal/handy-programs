/**
 * 
 */
package com.thirumal.java11;

import java.util.Optional;

/**
 * @author thirumal
 *
 */
public class NullableOr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(Optional.ofNullable(null).or(()->Optional.empty()).get());
	}

}
