package com.thirumal.lamda;

import java.util.function.Function;
import java.util.stream.IntStream;

public class Intermediate {

	public static void main(String[] args) {
		System.out.println(IntStream.rangeClosed(1, 10).map(s->s*2).sum());
		int i = 0;
		for (int j = 0; j <= 10; j ++) {
			i +=j*2;
		}
		System.out.println(i);
	}

}
