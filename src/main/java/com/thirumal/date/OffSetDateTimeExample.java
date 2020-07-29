package com.thirumal.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.TimeZone;

public class OffSetDateTimeExample {

	public static void main(String[] args) throws ParseException {
//		String date= "2020-06-18 16:15:38+05:30".replace(" ", "T").replace("+05:30", "");
//		System.out.println(OffsetDateTime.parse(date));
//		System.out.println(Instant.parse(date));
		
		SimpleDateFormat default_date_formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSS");
		//default_date_formatter.setTimeZone(TimeZone.getTimeZone("GMT"));
		System.out.println(default_date_formatter.parse("2010-01-01T00:43:54.776000"));

		Date now = new Date(2021, 03, 1);
		
		
		System.out.println(objectNullableEqual(now, new Date()));
	}
	
	static boolean objectNullableEqual(Object o1, Object o2) {
		return (o1 == null ? o2 == null : o1.equals(o2));
	}

}
