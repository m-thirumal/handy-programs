/**
 * 
 */
package com.thirumal.thread;

/**
 * @author thirumal
 *
 */
public class ThreadWrongOutput {

	public static int h = 0;
	
	/*public static void inc() {    //Wrong output
		h++;
	}
	*/
	/*public static synchronized void inc() { //block other other methods from other threads
		h++;
	}*/

	public static void inc() {
		synchronized (ThreadWrongOutput.class) {
			h++;
		}
	}

	public static void main(String[] args) {
		Thread thread1 = new Thread(() ->  {
			for (int i = 0; i < 3000; i++) {
				inc();
			}
		});
	
		Thread thread2 = new Thread(()-> {
			for (int i = 0; i < 3000; i++) {
				inc();
			
			}
		});
		
		Thread thread3 = new Thread(()-> {
			for (int i = 0; i < 3000; i++) {
				inc();
			}
		});
		thread1.start();
		thread2.start();
		thread3.start();
		try {
			thread1.join();
			thread2.join();
			thread3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("h: " + h);
	}

}


