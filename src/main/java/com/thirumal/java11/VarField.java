package com.thirumal.java11;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class VarField {

	public static void main(String[] args) {
		var name = "Thirumal";
		System.out.println("Name: " + name);
		List<Integer> num = Stream.of(1, 2, 3, 2, 1)
	    .dropWhile(n -> n < 3)
	    .collect(Collectors.toList());
		System.out.println(num);
	}

}
