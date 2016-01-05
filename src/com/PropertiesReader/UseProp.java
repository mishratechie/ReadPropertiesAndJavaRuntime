package com.PropertiesReader;

import java.io.FileInputStream;
import java.util.Properties;

public class UseProp {

	
	public static void main(String[] args) {
		
		try {
			Properties prop = new Properties();
			prop.load(new FileInputStream("config.properties"));
			
			String batchFile = prop.getProperty("BatchFileLocation");
			String ANT_HOME = prop.getProperty("ANT_HOME");
			String JAVA_HOME= prop.getProperty("JAVA_HOME");
			String ROBOTAN_HOME= prop.getProperty("ROBOTAN_HOME");
			
			System.out.println("ANT_HOME "+ ANT_HOME+ "\n JAVA_HOME "+JAVA_HOME+ "\n ROBOTAN_HOME "+ROBOTAN_HOME);
			
			
			String s=System.getProperty("os.name");
			
			System.out.println(s);
			
			//Using runtime to pass the properties as a argument to batch file
			String[] command = {"cmd.exe", "/C", "Start",batchFile, ANT_HOME,JAVA_HOME,ROBOTAN_HOME};
			Runtime.getRuntime().exec(command); 
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
