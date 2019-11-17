package com.syska.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.syska.baseClass.BaseClass;



public class Dryiron_Page extends BaseClass {
	WebDriver ldriver;// Reference of the Object
	 
	 public Dryiron_Page(WebDriver rdriver) //Constructor for invoking the driver

	 {

	 this.ldriver=rdriver;
	 PageFactory.initElements(rdriver, this);

	 }
	 @FindBy
		(how=How.XPATH,using="//span[contains(text(),'Home Appliances')]")
		WebElement home_appliances;
	 @FindBy
		(how=How.XPATH,using="//a[@class='btn']")
		WebElement Irons;
	 @FindBy
		(how=How.XPATH,using="//a[contains(text(),'Dry Irons')]")
		WebElement DryIrons;

	 @FindBy
		(how=How.XPATH,using="//li[4]//div[1]//div[1]//a[1]//img[1]")
		WebElement img_iron;
	 @FindBy
		(how=How.XPATH,using="//span[@class='price']")
		WebElement price;
	 
	
	 public void appliancesClick()
	 {
		 home_appliances.click();
	 }
	 public void ironsClick()
	 {
		 Irons.click();
	 }
	 public void dryIronsClick()
     {
		   DryIrons.click();
	 }
	 public void imgClick()
	 {
		 img_iron.click();
	 }
	 public void price() {
		 String str= price.getText();

		 System.out.println("The Actual price of the item is:" +str);
		
	 }
}
