/**
 * 
 */
package com.thirumal.database;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Thirumal
 *
 */
public class SanitazieDatabaseTableName2JavaClassName {
	
	private static final String FILE_PATH = "conf/databaseTableNames.properties";
	
	public static void main(String[] str) {
		List<String> sqlformat = readFile();
		printInJavaClassFormat(sqlformat);
		printForYAML(sqlformat);
	}
	
	private static void printForYAML(List<String> sqlformat) {
		List<String> javaformat = new ArrayList<>();
		sqlformat.forEach(tableName -> {
			javaformat.add("\t" + saniziteForClassName(tableName) + ":" + tableName);
		});
		javaformat.forEach(action -> {
			System.out.println(action);
		});
	}
	
	private static void printInJavaClassFormat(List<String> sqlformat) {
		List<String> javaformat = new ArrayList<>();
		sqlformat.forEach(tableName -> {
			javaformat.add(saniziteForClassName(tableName));
		});
		javaformat.forEach(action -> {
			System.out.println("private String " + action + ";");
		});
	}

	private static List<String> readFile() {
		List<String> list = new ArrayList<>();
		try (Stream<String> stream = Files.lines(Paths.get(FILE_PATH))) {
			list = stream
					.filter(s -> !(s.contains("_locales")))
					.collect(Collectors.toList());	
		} catch (IOException e) {
			e.printStackTrace();
		}
		//list.forEach(System.out::println);
		return list;
	}
	
	public static final String saniziteForClassName(String className){
		StringBuilder result = new StringBuilder();
		String[] classNameAsStrArray = className.split("_");
		for(String str : classNameAsStrArray) {			
			result.append(str.substring(0, 1).toUpperCase());
			result.append(str.substring(1));
		}		
		return result.toString();
	}
	
}
