package com.Project_Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;



public class PropertyReader {
	
	static  Properties prop;
	private static File file;
	
	
	public PropertyReader() {
		
		
		
		
		try {
			file = new File("./App_Files/login.properties");
			FileInputStream fis = new FileInputStream(file);
			
			prop = new Properties();
			prop.load(fis);
			
			
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {
			if(file.exists()) {
				System.out.println("File loaded successfully");
			}else
			{
				System.out.println("Does not loaded");
			}
		}
		
		
	}
	

	
	public String getappname() {
		return prop.getProperty("appname");
	}
	
	public String getappurl() {
		return prop.getProperty("appurl");
	}
	
	
}
