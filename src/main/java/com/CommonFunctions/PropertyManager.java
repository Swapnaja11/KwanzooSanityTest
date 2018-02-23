package com.CommonFunctions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyManager {
	
	private static Properties prop =  new Properties();
	static{
		FileInputStream fin =  null;
		File file= new File("C:\\Users\\GS-1455\\Kwanzoo\\Kwanzoo_Automation_Workspace\\Kwanzoo_ImpressionTest\\src\\test\\resources\\Config.properties");
		
		try {
			fin = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
		  prop.load(fin);
		} catch (IOException e){
			e.printStackTrace();
		}
	}
	
	public static String getProp(String property){
		if(property != null){
			return prop.getProperty(property.trim());
		}
		return null;
	}
}
