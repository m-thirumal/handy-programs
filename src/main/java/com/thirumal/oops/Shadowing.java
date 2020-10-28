/**
 * 
 */
package com.thirumal.oops;

/**
 * @author thirumal
 *
 */
public class Shadowing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Child2 c = new Child2();
		c.show();
	}

}

class Parent2 {

}

class Child2 extends Parent2 {
	private int age = 1;

	public void show() {
		int age = 5;
		System.out.println("age: " + age);
		System.out.println("age field value: " + this.age);
	}
}
