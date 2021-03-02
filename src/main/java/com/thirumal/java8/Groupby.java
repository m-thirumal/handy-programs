package com.thirumal.java8;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Groupby {

	public static void main(String[] args) {
		System.out.println(LocalDateTime.now());
		List<String> intList = List.of("T", "sdfd", "dsdsf", "sdfdsfd", "dsaas");
		 
	    List<List<String>> subSets = MyPartition.partition(intList, 3);
	 
	     for (List<String> i : subSets) {
	    	 System.out.println(i);
	     }
	     s();
	}


private static void s() {
	 List<Integer> intList = List.of(1, 2, 3, 4, 5, 6, 7, 8);
	 
	    Map<Integer, List<Integer>> groups = 
	      intList.stream().collect(Collectors.groupingBy(s -> s/3));
	    System.out.println(groups);
	    List<List<Integer>> subSets = new ArrayList<>(groups.values());

	     for (List<Integer> i : subSets) {
	    	 System.out.println(i);
	     }
		 
}

}