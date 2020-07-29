package com.thirumal.thread;

public class DeadLockInLine {
	
	public static void main(String[] arg) {
		System.out.println("before lock");
		try {
			Thread.currentThread().join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("After lock");
	}
}
