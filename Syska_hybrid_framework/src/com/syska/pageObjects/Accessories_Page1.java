package com.syska.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.MoveMouseAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Accessories_Page1 {
	WebDriver ldriver;
	 public Accessories_Page1(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	 @FindBy(how=How.XPATH, using="//span[contains(text(),'Accessories')]") 
		WebElement access;
	 
	 @FindBy(how=How.XPATH, using="//a[@id='ui-id-32']") 
		WebElement powerbank;
	 
	 @FindBy(how=How.XPATH, using="//a[@class='btn']") 
		WebElement viewProductBtn;
	 
	 @FindBy(how=How.XPATH, using="//li[2]//div[1]//div[1]//a[1]//img[1]") 
		WebElement productImage;
	
	 @FindBy(how=How.XPATH, using="//a[contains(text(),'Return and Shipping Policy')]") 
		WebElement returnpolicyBtn;
	 
	 @FindBy(how=How.XPATH, using="//a[contains(text(),'Earphones')]") 
		WebElement earphoneBtn;
		
	 public void clickonearphoneField()
		{
			earphoneBtn.click();
		} 
	 
	 
	 public void clickonreturnPolicyField()
		{
			returnpolicyBtn.click();
		} 
	 
		public void clickViewMoreBtn()
		{
			viewProductBtn.click();
		} 
	 
	public void AccessClick()
	{
		access.click();
	 
	}
	public void powerBankClick()
	{
		powerbank.click();
	 
	}
	public void clickOnProductimage()
	{
		productImage.click();
	 
	}


}
