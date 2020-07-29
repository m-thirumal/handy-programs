/**
 * 
 */
package com.thirumal.thread;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author Thirumal
 *
 */
public class Adder {
	
	private String inFile, outFile;

	public Adder(String inFile, String outFile) {
		this.inFile = inFile;
		this.outFile = outFile;
	}
	
	public void doAddd() {
		int total = 0;
		String line = null;
		try (BufferedReader bufferedReader = Files.newBufferedReader(Paths.get(inFile))) {
			while ((line = bufferedReader.readLine()) != null) {
				total += Integer.parseInt(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try (BufferedWriter bufferedWriter = Files.newBufferedWriter(Paths.get(outFile))) {
			bufferedWriter.write("Total: " + total);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
