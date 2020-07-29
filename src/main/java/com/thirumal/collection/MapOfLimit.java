/**
 * 
 */
package com.thirumal.collection;

import java.util.Map;

/**
 * @author thirumal
 *
 */
public class MapOfLimit {

	/**
	 * 
	 */
	public MapOfLimit() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Maximum only 10
		Map<Integer, String> map = Map.of(1, "1", 2, "2", 3, "3", 4, "4", 5, "5", 6, "6", 7, "7", 8, "8", 9, "9", 10, "10");
		map.forEach((k, v)->{
			System.out.println("K: " + k + " & V: " + v);
		});
		System.out.println("---------------");
		//
		Map<Integer, String> mapEntries = Map.ofEntries(Map.entry(1, "1"), Map.entry(2, "2"));
		mapEntries.forEach((k, v)->{
			System.out.println("K: " + k + " & V: " + v);
		});
	}

}
