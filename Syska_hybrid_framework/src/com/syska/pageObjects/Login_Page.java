package com.syska.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	WebDriver ldriver;
	public Login_Page(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(how=How.XPATH, using="//div[@class='store-links-container']//i[@class='icon-userx']") 
	WebElement login;
	@FindBy(how=How.XPATH, using="//div[@class='store-links-container']//ul[@class='header links']//li[@class='user-link']//ul[@class='customer-links']//li//a[contains(text(),'Log Out')]") 
	WebElement logout;
	@FindBy(how=How.XPATH, using="//input[@id='popup-email']")
	WebElement emailid;
	@FindBy(how=How.XPATH, using="//input[@id='popup-pass']")
	WebElement password;
	@FindBy(name="send")
	WebElement loginBtn;
	public void logoutClick()
	{
		logout.click();
	}

	public void loginClick()
	{
		login.click();
	}
public void setmail(String email1)
{
	emailid.sendKeys(email1);
}
public void setpassword(String password1)
{
	password.sendKeys(password1);
}
public void clickbtn()
{
	loginBtn.click();
}
}