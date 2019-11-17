package com.syska.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.syska.baseClass.BaseClass;

public class Shop_Page extends BaseClass{
	
	WebDriver ldriver;// Reference of the Object
	 

	 public Shop_Page (WebDriver rdriver) //Constructor for invoking the driver
    {
		 this.ldriver=rdriver;
		 PageFactory.initElements(rdriver, this);
	 }
	 @FindBy
		(how=How.XPATH,using="//a[contains(text(),'Shop')]")
		WebElement shop;
	 @FindBy
		(how=How.XPATH,using="//a[contains(text(),'Sharma Mobile Zone (Sanjauli, Shimla, HP)')]")
		WebElement shoploc;
	 public void shopClick() {
		 shop.click();
	 }
	 public void loc() {
		 shoploc.click();
	 }
	 
}
