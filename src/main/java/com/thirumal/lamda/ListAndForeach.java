/**
 * 
 */
package com.thirumal.lamda;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Thirumal
 *
 */
public class ListAndForeach {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		if(list.isEmpty()) {
			System.out.println("hi");
		}
		list.add("Thirumal");
		list.add("Jessica");
		list.add("Thirumal");
		list.add("Thirumal");
		list.stream().forEach(n->{
			//list.removeIf("Thirumal"::equals);
			System.out.println(n);
			if (n.equals("Thirumal")) {
				list.remove(n);
			}
		});
	}

}
