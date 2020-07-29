package com.thirumal.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumericStream {

	public static void main(String[] args) {
		List<Integer> number1 = Arrays.asList(1, 2, 3);
		List<Integer> number2 = Arrays.asList(1, 2, 3);
		List<int[]> s = number1.stream().flatMap(i -> number2.stream().map(j-> new int[] {i, j})).collect(Collectors.toList());
		s.forEach(a->{
			System.out.println(a.toString());
		});
	}

	
}
