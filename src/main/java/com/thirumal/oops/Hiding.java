/**
 * 
 */
package com.thirumal.oops;

/**
 * @author Thirumal
 *
 */
public class Hiding {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Child1 c = new Child1();
	    c.age();
	}

}

class Parent1 {
	int age = 30;
}

class Child1 extends Parent1 {
	int age = 4;

	public void age() {
		System.out.println("just age: " + age);
		System.out.println("Parent's age: " + super.age);
		System.out.println("Child's age: " + this.age);
	}
}

