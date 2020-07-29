/**
 * 
 */
package com.thirumal.regex;

import java.util.regex.Pattern;

/**
 * @author Thirumal
 *
 */
public class RegularExpression {

	/**
	 * 
	 */
	public RegularExpression() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//System.out.println(indianCompanyCin("u72900Tn2001ptC047020"));
		System.out.println(iu("IBBI/IU/99"));
	}
	
	public static boolean indianCompanyCin(String cin) {
		Pattern cinPattern = Pattern.compile("(^|)(U|u|L|l)[0-9]{5}[A-Za-z]{2}[0-9]{4}[A-Za-z]{3}[0-9]{6}");
		if (cinPattern.matcher(cin).matches()) {
			return true;
		}
		return false;
	}
	
	public static boolean iu(String iu) {
		if (Pattern.compile("IBBI/IU/[0-9]{2}").asMatchPredicate().test(iu)) {
			return true;
		}
		return false;
	}


}
