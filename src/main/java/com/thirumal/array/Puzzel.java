/**
 * 
 */
package com.thirumal.array;

/**
 * @author Thirumal
 *
 */
public class Puzzel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arrA = {3, 5, 0, 1, 6, 4, 2};
	    int[] arrB = {2, 0, 6, 4, 5, 3, 1};
	    System.out.println((arrA = arrB).length);
	    for (int i = 0; i < arrA.length; i ++ ) {
	    		System.out.println("i : " + arrA[i]);
	    }
	    System.out.println();
	    System.out.print(arrB[(arrA = arrB)[3]]);
	}

}
