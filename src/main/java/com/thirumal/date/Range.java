/**
 * 
 */
package com.thirumal.date;

import java.util.Date;

/**
 * @author thirumal
 *
 */
public class Range {

	/**
	 * 
	 */
	public Range() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Date checkDate = new Date(2019, 07, 01);
		System.out.println(checkDate);
		Date startDate = new Date(2019, 01, 01);
		Date endDate = new Date(2019, 10, 01);
		System.out.println(checkDate.after(startDate));
		System.out.println(checkDate.before(endDate));
		System.out.println(checkDate.after(startDate) && checkDate.before(endDate));
	}

}
