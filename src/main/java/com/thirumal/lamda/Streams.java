/**
 * 
 */
package com.thirumal.lamda;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author thirumal
 *
 */
public class Streams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		concat();
	}

	public static void concat() {
		Stream<Integer> stream1 = Stream.of(1, 3, 5);
		Stream<Integer> stream2 = Stream.of(2, 4, 6);
		Stream<Integer> resultingStream = Stream.concat(stream1, stream2);
		/*resultingStream.forEach(action->{
			System.out.println("action: " + action);
		});
*/		System.out.println(resultingStream.collect(Collectors.toList()));
	}
}
