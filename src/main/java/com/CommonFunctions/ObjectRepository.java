package com.CommonFunctions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;

public class ObjectRepository {

/*	private FileInputStream stream;
	private String RepositoryFile;
	private static Properties propertyFile = new Properties();
	public ObjectRepository(String filepath){
		this.RepositoryFile = filepath;
		
		try {
			stream = new FileInputStream(RepositoryFile);
			propertyFile.load(stream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Set<Object> getAllKeys(){
		 Set<Object>  keys = propertyFile.keySet();
	     return keys;
	}
    public HashMap<String, By> getMap(){
		 HashMap<String, By> propertyMap = new HashMap<String, By>();
		 Set<Object>  keys = getAllKeys();
		 for(Object k:keys){
			 String key = (String)k;
		     By locator = getbjectLocator(key);
			 propertyMap.put(key, locator);
		}
	    return propertyMap;
	}
	
	public static By getbjectLocator(String locatorName)
	{
		String locatorProperty = propertyFile.getProperty(locatorName);
		String locatorType = locatorProperty.split(":")[0];
		String locatorValue = locatorProperty.split(":")[1];

		By locator = null;
		switch(locatorType)
		{
		case "Id":
			locator = By.id(locatorValue);
			break;
		case "Name":
			locator = By.name(locatorValue);
			break;
		case "CssSelector":
			locator = By.cssSelector(locatorValue);
			break;
		case "LinkText":
			locator = By.linkText(locatorValue);
			break;
		case "PartialLinkText":
			locator = By.partialLinkText(locatorValue);
			break;
		case "TagName":
			locator = By.tagName(locatorValue);
			break;
		case "Xpath":
			locator = By.xpath(locatorValue);
			break;
		}
		return locator;
	}*/
}