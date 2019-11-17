package com.syska.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.syska.baseClass.BaseClass;

public class Steamiron_Page extends BaseClass {
	
		
		 WebDriver ldriver;// Reference of the Object
		 

		 public Steamiron_Page(WebDriver rdriver) //Constructor for invoking the driver

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
			(how=How.XPATH,using="//a[contains(text(),'Steam Irons')]")
			WebElement SteamIrons;

		 @FindBy
			(how=How.XPATH,using="//li[3]//div[1]//div[1]//a[1]//img[1]")
			WebElement img_steamiron;
		 @FindBy
			(how=How.XPATH,using="//span[@class='base']")
			WebElement text;
		 
		 public void appClick() {
			 home_appliances.click();
		 }
		 public void ironsClick()
		 {
			 Irons.click();
		 }
		 public void steamIronsClick() {
			 SteamIrons.click();
		 }
		 public void steam_imgClick()
		 {
			 img_steamiron.click();
		 }
		 public void stext() {
			 String text1= text.getText();

			 System.out.println("The product details of the selected item:" +text1);
		 }

}
