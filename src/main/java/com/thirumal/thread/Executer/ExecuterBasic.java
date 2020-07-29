
/**
 * 
 */
package com.thirumal.thread.Executer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author thirumal
 *
 */
public class ExecuterBasic {
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		for ( int i = 0; i < 10; i ++ ) {
			System.out.println("Sequential: " + i); //outputs are  sequential
			executorService.submit(() -> {
				try {
					TimeUnit.SECONDS.sleep(5);
				} catch(InterruptedException exception) {
					
				}// Outputs are not sequential. threads has no coordination 
				System.out.println("Parallel Thread name: " + Thread.currentThread().getName());
			});
		}
		executorService.shutdown();
	}
	
	

}
