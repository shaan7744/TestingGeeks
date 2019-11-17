package com.syska.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.syska.baseClass.BaseClass;

public class ExtensionCords_Page extends BaseClass {
	WebDriver ldriver;// Reference of the Object
	 

	 public ExtensionCords_Page (WebDriver rdriver) //Constructor for invoking the driver
     {
		 this.ldriver=rdriver;
		 PageFactory.initElements(rdriver, this);
	 }
	 
	 @FindBy
		(how=How.XPATH,using="//span[contains(text(),'Home Appliances')]")
		WebElement home_appliances;
	 @FindBy
		(how=How.XPATH,using="//a[@class='btn']")
		WebElement products;
	 @FindBy
		(how=How.XPATH,using="//a[contains(text(),'Extension Cords')]")
		WebElement extension;
	 @FindBy
		(how=How.XPATH,using="//a[contains(text(),'4 Socket Individual Switch Power Strip/ Spike Bust')]")
		WebElement extensionimg;
	 
	 
	 
	 public void happClick() {
		 home_appliances.click();
	 }
	 public void prodClick() {
		 products.click();
	 }
	 public void extensClick() {
		 extension.click();
	 }
	 
	 public void extimgClick() {
		 extensionimg.click();
	 }
	 

}
