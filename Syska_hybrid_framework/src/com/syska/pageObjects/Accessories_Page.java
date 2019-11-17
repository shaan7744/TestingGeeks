package com.syska.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Accessories_Page {
	WebDriver ldriver;
	 public Accessories_Page(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	 @FindBy(how=How.XPATH, using="//span[contains(text(),'Accessories')]") 
		WebElement access;
	 
	 @FindBy(how=How.XPATH,using="//a[@class='btn']") 
		WebElement powerbank;
	 
	  
	public void AccessClick()
	{
		access.click();
	 
	}
	public void powerBankClick()
	{
		powerbank.click();
	 
	}


}
