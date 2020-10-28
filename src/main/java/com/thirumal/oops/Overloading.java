package com.thirumal.oops;
/**
 * 
 * @author Thirumal
 *
 */
public class Overloading {
	
	public static void main(String[] args) {
		Overloading overloading = new Overloading();
		
		overloading.show("Thirumal");
		overloading.show(12);
		
	}
	
	public void show(String message) {
	    System.out.println("String: " + message);
	}

	public void show(int content) {
	   System.out.println("int: " + content);
	}

}
