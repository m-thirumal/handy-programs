/**
 * 
 */
package com.thirumal.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

/**
 * @author Thirumal
 *
 */
public class PropertyFileReading {
	
	private static final Logger LOGGER = Logger.getLogger(PropertyFileReading.class.getName());
	
	public static final String TABLE_FILE_PATH = "conf/databaseTableNames.properties";
	
	private static PropertyFileReading instance;
	
	private PropertyFileReading() {
		
	}
	
	public static PropertyFileReading getInstance() {
		if (instance == null) {
			instance = new PropertyFileReading();
			try {
				init();
			} catch (Exception exception) {
				LOGGER.severe(exception.getMessage());
			}
		}
		return instance;		
	}

	private static void init() {
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream(new File(PropertyFileReading.TABLE_FILE_PATH)));
		} catch (FileNotFoundException fileNotFoundException) {
			LOGGER.severe(fileNotFoundException.getMessage());
		} catch (IOException ioException) {
			LOGGER.severe(ioException.getMessage());
		}		
	}
}	
