package com.syska.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Search_Option {
	WebDriver ldriver;
	public Search_Option(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(how=How.XPATH, using="//label[@class='label search-label']") 
	WebElement search;
	@FindBy(how=How.XPATH, using="//input[@id='search']")
	WebElement text;
	@FindBy(how=How.XPATH, using="//div[@class='custome-home-page']")
	WebElement search_button;
	
	public void search6Click()
	{
		search.click();
	}

	public void senddata2(String abc)
	{
		text.sendKeys(abc);
	}
public void clickbtn4()
{
	search_button.click();
}

}
