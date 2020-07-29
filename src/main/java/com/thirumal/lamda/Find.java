/**
 * 
 */
package com.thirumal.lamda;

import java.util.Arrays;
import java.util.List;

/**
 * @author Thirumal
 *
 */
public class Find {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<A> list = Arrays.asList(new A(false, "thirum3al"), new A(true, "Sample"), new A(false, "thirumal"));
		A a = list.stream()
		            .peek(num -> System.out.println("will filter " + num.name))
		            .filter(x -> x.name.equalsIgnoreCase("thirumasl"))
		            .findFirst()
		            .orElse(null);
		System.out.println(a);
	}

}

class A {
	boolean app;
	String name;
	public A(boolean app, String name) {
		this.app = app;
		this.name = name;
	}
	/**
	 * @return the app
	 */
	public boolean isApp() {
		return app;
	}
	/**
	 * @param app the app to set
	 */
	public void setApp(boolean app) {
		this.app = app;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
