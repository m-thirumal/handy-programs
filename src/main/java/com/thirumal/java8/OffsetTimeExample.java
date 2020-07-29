/**
 * 
 */
package com.thirumal.java8;

import java.text.SimpleDateFormat;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author thirumal
 *
 */
public class OffsetTimeExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		OffsetDateTime currentDateTime = OffsetDateTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println(currentDateTime);
		//Format
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm E a x");
		System.out.println(currentDateTime.format(formatter));
		//Parse
		System.out.println(OffsetDateTime.parse("2019-01-04T13:04:36.983848+05:30"));
		//
		System.out.println(new Date(2019, 01, 04).after(new Date()));
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm a").format(new Date()));
	}

}
