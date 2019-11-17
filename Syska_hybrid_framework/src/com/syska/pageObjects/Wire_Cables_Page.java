package com.syska.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Wire_Cables_Page {
	WebDriver ldriver;
	public Wire_Cables_Page(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}	
	@FindBy(how=How.XPATH, using="//span[contains(text(),'Wires & Cables')]") 
	WebElement wireBtn;
	
	public void Wire_cablesbtn()
	{
		wireBtn.click();
	}
	
}