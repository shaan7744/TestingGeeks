package com.syska.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SmartLights {
	WebDriver ldriver;
	public SmartLights(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how=How.XPATH, using="//a[contains(text(),'Smart Lights')]") 
	WebElement smartlight;
	@FindBy(how=How.XPATH, using="//body[@class='cms-led cms-page-view page-layout-ledlayout']/div[@class='page-wrapper']/div[@id='maincontent']/div[@class='columns']/div[@class='column main']/div[@class='led-cms-page']/div[@class='full-width-container']/section[@class='banner banner-bg-text']/div[1]/div[1]/a[1]") 
	WebElement viewmore;
	 
	public void smartlightClick()
	{
		smartlight.click();
	}

	public void viewmoreClick()
	{
		 viewmore.click();
		 
	}
}
