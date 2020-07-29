package com.thirumal.thread;

public class Thread1 implements Runnable {

	public static void main(String[] args) {
		for (int i =0; i <10; i ++) {
			Thread1 thread1 = new Thread1();
		
			thread1.run();
		}
		
	}

	@Override
	public void run() {
		System.out.println();
	}

}
