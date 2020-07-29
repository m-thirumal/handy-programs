/**
 * 
 */
package com.thirumal.io.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Thirumal
 *
 */
public class FileRead {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("/Users/Thirumal/test.trace.db");
		System.out.println(path.getFileName());
		System.out.println(Files.readAllBytes(path));
	}

}
