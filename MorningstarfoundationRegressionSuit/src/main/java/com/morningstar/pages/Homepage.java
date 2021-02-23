package com.morningstar.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.morningstar.base.BaseClass;

public class Homepage extends BaseClass {
	
	@FindBy(xpath=" //div[@id='wc3fb']")
	WebElement MorningStarLogo;
	

	
	public Homepage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateHomePageTitle()
	{
	return driver.getTitle();
	}
	
	public boolean validateMorningstarlogo()
	{
		return MorningStarLogo.isDisplayed();
		
	}
	
}
