package com.thirumal.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

	public static void main(String[] args) {
		List<String> names = List.of("Superman", "Batman", "Wonder Woman");
		List<String> likes = List.of("good1", "good2", "good3");
		List<String> dislikes = List.of("bad1", "bad2", "bad3");

		List<String> statements = new ArrayList<>();
		for (String r : names) {
		  for (String s : likes) {
		    for (String t : dislikes) {
		      statements.add(r + " likes " + s + " and dislikes " + t);
		    }
		  }
		}
		//statements.stream().forEach(System.out::println);
		
		names.stream().flatMap(r->
	    likes.stream().peek(r1->System.out.println(r))
	        .flatMap(s -> dislikes.stream()
	            .map(t -> r + " likes " + s + " and dislikes " + t))
				).collect(Collectors.toList()).forEach(System.out::println);;
	}

}
