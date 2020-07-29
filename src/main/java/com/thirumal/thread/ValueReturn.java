/**
 * 
 */
package com.thirumal.thread;

/**
 * @author thirumal
 *
 */
public class ValueReturn implements Runnable {

	private int a;
	private int b;
	private long sleepTime;
	private int sum;
	//
	private static int count = 0;
	private int instanceNumber;
	private String taskId;
	//

	public ValueReturn(int a, int b, long sleepTime) {
		this.a = a;
		this.b = b;
		this.sleepTime = sleepTime;
		//
		this.instanceNumber = ++count;
		this.taskId = "Value Re:  " + instanceNumber;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
