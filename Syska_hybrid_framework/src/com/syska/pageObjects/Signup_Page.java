package com.syska.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Signup_Page {
	
	WebDriver ldriver;
	 public Signup_Page(WebDriver rdriver) 

	 {
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
	 
	 @FindBy(how=How.XPATH,using="//div[@class='store-links-container']//i[@class='icon-userx']")
     WebElement logon_button;
	 @FindBy(how=How.XPATH,using="//span[contains(text(),'Create Account')]")
     WebElement create_account_button;
	 @FindBy(how=How.XPATH,using="//input[@id='email_address']")
     WebElement email;
	 @FindBy(how=How.CSS,using="#fullname")
     WebElement fullname;
     @FindBy(how=How.XPATH,using="//input[@id='password']") 
     WebElement password; 
     @FindBy(how=How.XPATH,using="//button[@class='action submit primary btn btn-submit']//span[contains(text(),'Sign Up')] ")
	 WebElement signup_button;

 public void logon_buttonClick()
 	{
 		logon_button.click();
 	}
 public void create_account_buttonClick()
  	{
    	 create_account_button.click();
  	}
 public void setmail1(String email1)
 {
 	email.sendKeys(email1);
	 }
 public void setfullname(String fullName)
 {
 	fullname.sendKeys(fullName);
 }
 public void setpassword(String password1)
 {
 	password.sendKeys(password1);
 }
 public void clicksignup_buttton()
 {
 	signup_button.click();
 }

}


