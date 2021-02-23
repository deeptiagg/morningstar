package com.morningstar.base;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;


import com.morningstar.TestUtil.Readconfig;
import com.morningstar.TestUtil.TestUtil;



public class BaseClass {
	
	
	Readconfig readconfig = new Readconfig();
	
	 public static  WebDriver driver;
		public static WebDriverWait wait= null;
	public String URL=readconfig.getApplicationURL();
				
@BeforeClass
	 public  void setup() {
	
		System.setProperty("webdriver.chrome.driver",readconfig.getChromepath());
		 driver = new ChromeDriver();
		
		 
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver,20);
		
		
		
}

@AfterClass
public void tearDown()
{
	driver.quit();
}

}

		
		


