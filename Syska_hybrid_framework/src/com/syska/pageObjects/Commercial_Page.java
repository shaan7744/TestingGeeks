package com.syska.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Commercial_Page {
	WebDriver ldriver;// Reference of the Object
	 
	 public Commercial_Page(WebDriver rdriver) //Constructor for invoking the driver
	 {
	 this.ldriver=rdriver;
	 PageFactory.initElements(rdriver, this);
	 }
	 @FindBy
		(how=How.XPATH,using="//div[@class='footer-quick-links']//a[contains(text(),'Commercial')]")
		WebElement comm;
	 @FindBy
		(how=How.XPATH,using="//a[contains(text(),'Industrial Lights')]")
		WebElement light;
	 @FindBy
		(how=How.XPATH,using="//div[contains(text(),'Wattage')]")
		WebElement watt;
	 @FindBy
		(how=How.XPATH,using="//a[contains(text(),'120W')]")
		WebElement selec;
	 @FindBy
		(how=How.XPATH,using="//a[@class='product-item-link']")
		WebElement produc;
	 @FindBy
		(how=How.XPATH,using="//span[contains(text(),'Add to Cart')]")
		WebElement cart;
	 
	 public void commClick()
	 {
		 comm.click();
	 }
	 public void lightClick()
	 {
		 light.click();
	 }
	 public void  wattClick()
     {
		   watt.click();
	 }
	 public void selectClick()
	 {
		 selec.click();
	 }
	 public void  productClick()
     {
		   produc.click();
	 }
	 public void cartClick()
	 {
		 cart.click();
	 }
}
