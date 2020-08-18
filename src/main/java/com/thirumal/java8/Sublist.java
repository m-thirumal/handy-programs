package com.thirumal.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sublist {

	public static void main(String[] args) {
		String str = "1,2,3,11,#5,#7,9";
		Stream<String> list = Arrays.asList(str.split(",")).stream();
		List<String> s = list.filter(a->a.startsWith("#")).map(a->a.replace("#", "")).collect(Collectors.toList());
		System.out.println(s);
		str = list.filter(a->!a.startsWith("#")).collect(Collectors.joining(","));
		System.out.println(str);
	}

}
