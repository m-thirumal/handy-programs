package com.thirumal.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

public class DateSort {

	public static void main(String[] args) {
		List<String> datre = List.of("02/12/2002", "12/16/2019", "12/11/2019", "11/11/2019", "10/28/2019", "07/17/2020", "07/15/2020", "06/27/2020", "06/18/2020");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
	    
		datre.stream().sorted((o1, o2) -> LocalDate.parse(o1, formatter).compareTo(LocalDate.parse(o2, formatter))).collect(Collectors.toList());

	}

}
