package com.morningstar.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;


import com.morningstar.base.BaseClass;
import com.morningstar.pages.Homepage;

public class TC_Homepage_001 extends BaseClass
{
	Homepage hp;
	public TC_Homepage_001() {
		super();
	}
	
	@Test(priority=1)
	public void Initialization()
	{
		driver.get(URL);
		setup();
		hp = new Homepage();
		
		
	}
	
	@Test(priority=2)
	public void HomepagetitleTest() {
	String title=hp.validateHomePageTitle();
	Assert.assertEquals(title,"Children's Charities | Morning Star Foundation | United States");
	
	}
	
	@Test(priority=3)
	public void MorningStarLogo() {
		boolean flag= hp.validateMorningstarlogo();
		Assert.assertTrue(flag);
	}
	
	
}
