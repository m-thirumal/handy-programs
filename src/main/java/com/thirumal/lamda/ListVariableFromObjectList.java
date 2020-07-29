/**
 * 
 */
package com.thirumal.lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Thirumal
 *
 */
public class ListVariableFromObjectList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<SamplePOJO> samplePOJOs = new ArrayList<SamplePOJO>();
		samplePOJOs.add(new SamplePOJO(1, "Thirumal"));
		samplePOJOs.add(new SamplePOJO(2, "Jessica Alba"));
		List<Integer> l = samplePOJOs.stream().map(s->s.getId()).collect(Collectors.toList());
		System.out.println(l);
	}

}
