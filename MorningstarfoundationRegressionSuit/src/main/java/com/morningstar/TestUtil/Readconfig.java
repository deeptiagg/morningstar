package com.morningstar.TestUtil;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {
Properties prop;
	
	public Readconfig()
	{
		
		File src = new File("./configuration/config.properties");
		try {
		FileInputStream fis =  new FileInputStream(src);
		prop = new Properties();
			prop.load(fis);
		} 
		catch (Exception e) {
			System.out.println("Exception is "+e.getMessage());
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getApplicationURL()
	{
		String URL=prop.getProperty("baseURL");
		return URL;
	}
	
	public String getChromepath()
	{
		String chromePath = prop.getProperty("chromepath");
		return chromePath;
				
	}

}
