/**
 * 
 */
package com.thirumal.math;

/**
 * @author thirumal
 *
 */
public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		printPalindrome();
		findHowManyPalindrome("12");
	}

	private static void findHowManyPalindrome(String numberInString) {
		//int[] list = {10, 19, 109, 199, 1099, 1999};
		
	}

	public static void printPalindrome() {
		int j = 0;
		for (int i = 0; i <= 10000000; i++) {
			if (i == reverse(i)) {
				j++;
				System.out.println(i);
			}
		}
		System.out.println("Total : " + j++);
	}
	 /**
     * Returns the number whose digits (base 10) are the reverse
     * of number's (with no leading zeros).
     * @param number the number to reverse
     * @return the reversed number
     */
    public static int reverse( int number ) { 
		int result = 0;
		while (number > 0) {
			result = result * 10 + (number % 10);
			number = number / 10;
		}
		return result;
    }
    
}
