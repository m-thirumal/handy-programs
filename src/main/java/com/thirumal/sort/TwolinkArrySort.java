package com.thirumal.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TwolinkArrySort {

	public static void main(String[] args) {
		List<String> array1= new ArrayList<>();
		array1.addAll(List.of("b","d","a","c"));
		List<Double> array2= new ArrayList<>();
		array2.addAll(List.of(2.0,4.0,1.0,3.0));
		Map<Double, String> map = IntStream.range(0, array2.size()).boxed()
			    .collect(Collectors.toMap(i -> array2.get(i), i -> array1.get(i)));
		Collections.sort(array2, Collections.reverseOrder());
		System.out.println(map);
		List<String> array11 = new ArrayList<>();
		for (Double d : array2) {
			array11.add(map.get(d));
		}
		System.out.println(array11);
	}

}
