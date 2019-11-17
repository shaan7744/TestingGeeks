package com.syska.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class WishList {
	WebDriver ldriver;
	public WishList(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(how=How.XPATH, using="/html[1]/body[1]/div[1]/header[1]/div[2]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[1]/a[1]/span[2]") 
	WebElement ledBtn;
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Single Power Meter Wi-Fi Enabled Smart Plug')]")
	WebElement wishlistBtn;
	
	@FindBy(how=How.XPATH,using="//i[@class='icon-like']")
	WebElement saveBtn;
	
	@FindBy(how=How.XPATH,using="//div[@class='group']//input[@id='email']")
	WebElement emailBtn;
	
	@FindBy(how=How.XPATH,using="//div[@class='group']//input[@id='pass']")
	WebElement passBtn;
	
	@FindBy(how=How.XPATH,using="//button[@id='send2']//span[contains(text(),'Log In')]")
	WebElement loginBtn;
	
	public void ledbtn()
	{
		ledBtn.click();
	}
	public void wishlistClick()
	{
		wishlistBtn.click();                                                                                                                                                                                   
	}
	public void saveClick()
	{
		saveBtn.click();                                                                                                                                                                                   
	}
	public void emailClick(String email)
	{
		emailBtn.sendKeys(email);                                                                                                                                                                                   
	}
	public void passwordClick(String password)
	{
		passBtn.sendKeys(password);                                                                                                                                                                                   
	}
	public void loginClick()
	{
		loginBtn.click();                                                                                                                                                                                   
	}
}
