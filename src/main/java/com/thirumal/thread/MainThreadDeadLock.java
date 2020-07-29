/**
 * 
 */
package com.thirumal.thread;

/**
 * @author Thirumal
 *
 */
public class MainThreadDeadLock {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		Thread.currentThread().join();
	}

}
