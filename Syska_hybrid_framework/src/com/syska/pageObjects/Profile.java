package com.syska.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Profile {
	WebDriver ldriver;// Reference of the Object
	 
	 public Profile(WebDriver rdriver) //Constructor for invoking the driver

	 {

	 this.ldriver=rdriver;
	 PageFactory.initElements(rdriver, this);

	 }
	 @FindBy
		(how=How.XPATH,using="//div[@class='store-links-container']//i[@class='icon-userx']")
		WebElement profileclick;
	 @FindBy
		(how=How.XPATH,using="//div[@class='store-links-container']//ul[@class='header links']//li[@class='user-link']//ul[@class='customer-links']//li//a[contains(text(),'My Account')]")
		WebElement profile;
	 @FindBy
		(how=How.XPATH,using="//span[@class='edit-field edit edit-name']//i[@class='icon-edit']")
		WebElement edit;
	 @FindBy
		(how=How.XPATH,using="//input[@id='fullname']")
		WebElement write;
	 @FindBy
		(how=How.XPATH,using="//button[contains(@class,'action save primary btn btn-w')]")
		WebElement save;
	 public void profileClick1() {
		 profileclick.click();
	 }
	 public void profileClick() {
		 profile.click();
	 }
	 public void editClick() {
		 edit.click();
	 }
	 public void nameClick(String abc) {
		 write.sendKeys(abc);
	 }
	 public void saveClick() {
		 save.click();
	 }
	 
	 
}
