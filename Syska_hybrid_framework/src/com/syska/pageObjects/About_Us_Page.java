package com.syska.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class About_Us_Page {
	WebDriver ldriver;// Reference of the Object
	 

	 public   About_Us_Page(WebDriver rdriver) //Constructor for invoking the driver
 {
		 this.ldriver=rdriver;
		 PageFactory.initElements(rdriver, this);
	 }
	 @FindBy
		(how=How.XPATH,using="//a[contains(text(),'About Us')]")
		WebElement about;
	 @FindBy
		(how=How.XPATH,using="//li[contains(text(),'Design process')]")
		WebElement about_design;
	 @FindBy
		(how=How.XPATH,using="//li[@class='tab_last']")
		WebElement about_rel;
	 
	 @FindBy
		(how=How.XPATH,using="//a[contains(text(),'Contact us')]")
		WebElement about_con;
	 
	 public void abtClick() {
		 about.click();
	 }
	 public void abdesClick() {
		 about_design.click();
	 }
	 public void abrelClick() {
		 about_rel.click();
	 }
	 public void abconClick() {
		 about_con.click();
	 }
}
