/**
 * 
 */
package com.thirumal.timer;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author Thirumal
 *
 */
public class Later {
	
	public static void main(String[] args) {
		Timer t = new Timer("TimerThread");
		t.schedule(new TimerTask() {
			public void run() {
				System.out.println("This is later");
				System.exit(0);
			}
		}, 6 * 1000);
		System.out.println("Exiting main()");
	}

}
