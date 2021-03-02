package com.thirumal.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;
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
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'+'SS:SZ");
        Instant date1 = Instant.parse("2020-07-26T18:52:24+05:30");
        System.out.println("DATE="+date1);
        findDifference();
	}
	
	static boolean objectNullableEqual(Object o1, Object o2) {
		return (o1 == null ? o2 == null : o1.equals(o2));
	}
	
	static void findDifference() {
		System.out.println("----Find Difference ----");
		OffsetDateTime off = OffsetDateTime.parse("2021-02-11T11:05:30+05:00");
		System.out.println(off.until(OffsetDateTime.now(), ChronoUnit.SECONDS));
	}

}
