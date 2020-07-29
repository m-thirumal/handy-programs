package com.enkindle.pattern;

import java.util.Random;
import java.util.stream.Stream;

public class RandomColor {

	public static void main(String[] args) {
		System.out.println(String.format("#%06x", new Random().nextInt(0xffffff + 1)));
		
		String[] arr = Stream.generate(() ->String.format("#%06x", new Random().nextInt(0xffffff + 1)))
			.limit(5).toArray(String[]::new);
		for (String a: arr) {
			System.out.println(a);
		}
	}

}
