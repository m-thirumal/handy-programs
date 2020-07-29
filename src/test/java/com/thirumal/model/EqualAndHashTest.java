/**
 * 
 */
package com.thirumal.model;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author thirumal
 *
 */
public class EqualAndHashTest {
	
	@Test
	public void equalTest(){
		EqualAndHash equalAndHash = new EqualAndHash("Thirumal", 26);
		Assert.assertEquals(new EqualAndHash("Thirumal", 26), equalAndHash);
	}
	
	@Test
	public void equalTest1(){
		EqualAndHash equalAndHash = new EqualAndHash("Thirumal", 27);
		Assert.assertEquals(new EqualAndHash("Thirumal", 26), equalAndHash);
	}
	
	@Test
	public void equalTest2(){
		EqualAndHash equalAndHash = new EqualAndHash("Thirumal", 26);
		EqualAndHash equalAndHash1 = new EqualAndHash("Thirumal", 27);
		System.out.println(equalAndHash.equals(equalAndHash1));
	}
	
}
