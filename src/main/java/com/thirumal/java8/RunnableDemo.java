/**
 * 
 */
package com.thirumal.java8;

/**
 * @author thirumal
 *
 */
public class RunnableDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Thread(()-> System.out.println("inside runnable using an anonymous inner class")).start();
	}

}
