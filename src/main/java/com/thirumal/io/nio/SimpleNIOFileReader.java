package com.thirumal.io.nio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SimpleNIOFileReader {
	 
    /**
     * @param args
     */
    public static void main(String[] args) {
        Path file = null;
        BufferedReader bufferedReader = null;
        try {
            file = Paths
                    .get("/User/Thirumal/test.trace.db");
            InputStream inputStream = Files.newInputStream(file);
            bufferedReader = new BufferedReader(new InputStreamReader(
                    inputStream));
            System.out.println("Reading Line: "
                    + bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }
 
}
