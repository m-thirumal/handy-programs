/**
 * 
 */
package com.thirumal.methodhandle;

import static org.junit.Assert.assertEquals;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

import org.junit.Test;

/**
 * @author Thirumal
 *
 */
public class BookTest {

	 @Test
	 public void givenConcatMethodHandle_whenInvoked_thenCorrectlyConcatenated() throws Throwable {

		MethodHandles.Lookup publicLookup = MethodHandles.publicLookup();
		MethodType mt = MethodType.methodType(String.class, String.class);
		MethodHandle concatMH = publicLookup.findVirtual(String.class, "concat", mt);

		String output = (String) concatMH.invoke("Effective ", "Java");

		assertEquals("Effective Java", output);
	}
	 
}
