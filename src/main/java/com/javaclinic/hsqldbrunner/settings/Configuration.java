package com.javaclinic.hsqldbrunner.settings;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Configuration {

    private static Properties properties = new Properties();
    
    static {
    	try {
    		InputStream input = Configuration.class.getClassLoader().getResourceAsStream("database.properties");
    		properties.load(input);
    	} catch (IOException e) {
    		e.printStackTrace();
    		throw new RuntimeException("Could not load database.properties file.");
    	}
    }
    
    public static String getProperty(String key) {
    	return properties.getProperty(key);
    }
    
}
