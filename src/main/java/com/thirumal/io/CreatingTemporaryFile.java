/**
 * 
 */
package com.thirumal.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * @author Thirumal
 *
 */
public class CreatingTemporaryFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 try {
	         final Path path = Files.createTempFile("myTempFile", ".txt");
	         System.out.println("Temp file : " + path);
	         //Delete file on exit
	         path.toFile().deleteOnExit();
	      } catch (IOException e) {
	         e.printStackTrace();
	      }
	}

}
