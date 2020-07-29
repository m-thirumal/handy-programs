/**
 * 
 */
package com.thirumal.ascii;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Thirumal
 *
 */
public class AsciidoctorDemoTest {
	
	@Test
	public void givenString_whenConverting_thenResultingHTMLCode() {
		final AsciidoctorDemo asciidoctorDemo = new AsciidoctorDemo();
		Assert.assertEquals(asciidoctorDemo.generateHTMLFromString("Fuck you God!"),
				"<div class=\"paragraph\">\n<p>Fuck you God!>!</p>\n</div>");
	}
	
}
