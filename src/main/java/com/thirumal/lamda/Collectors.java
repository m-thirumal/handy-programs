/**
 * 
 */
package com.thirumal.lamda;

import java.util.Arrays;
import java.util.List;

/**
 * @author Thirumal
 *
 */
public class Collectors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object[]> splitUpNames = Arrays.asList("John Woo", "Jeff Dean", "Josh Bloch", "Josh Long").stream()
                .map(name -> name.split(" "))
                .collect(java.util.stream.Collectors.toList());
		splitUpNames.forEach(action -> {
			System.out.println(action);
		});
	}

}
