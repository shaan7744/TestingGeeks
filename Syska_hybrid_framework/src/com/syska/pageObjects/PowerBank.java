package com.syska.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PowerBank {
	WebDriver ldriver;
	public PowerBank(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(how=How.XPATH, using="//span[@class='moreLink']") 
	WebElement readmore;
	@FindBy(how=How.XPATH, using="//span[@class='base']") 
	WebElement text;
	 
	public void readMoreClick()
	{
		readmore.click();
	}

	public void TextClick()
	{
		String a=text.getText();
		System.out.println("The text is="+a);
	}
 
	
}
