package com.syska.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Lounge_Page {
	WebDriver ldriver;
	public Lounge_Page(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(how=How.XPATH, using="//a[contains(text(),'Lounge')]") 
	WebElement loung;
	@FindBy(how=How.XPATH, using="//input[@id='name']") 
	WebElement name;
	@FindBy(how=How.XPATH, using="//div[@class='group']//input[@id='email']") 
	WebElement mail;
	@FindBy(how=How.XPATH, using="//input[@id='subject']") 
	WebElement sub;
	@FindBy(how=How.XPATH, using="//input[@id='city']") 
	WebElement city;
	@FindBy(how=How.XPATH, using="//input[@id='telephone']") 
	WebElement phone;
	@FindBy(how=How.XPATH, using="//textarea[@id='message']") 
	WebElement message;
	@FindBy(how=How.XPATH, using="//input[@id='submitBtn']") 
	WebElement sbbtn;
	public void loungClick()
	{
		loung.click();
	}
	public void nameClick(String name1)
	{
		name.sendKeys(name1);
	}

	public void mailClick(String mail1)
	{
		mail.sendKeys(mail1);;
	}

	public void subjectClick(String sub1)
	{
		sub.sendKeys(sub1); 
	}

	public void cityClick(String cit)
	{
		city.sendKeys(cit);
	}
	public void telephoneClick(String tel)
	{
		phone.sendKeys(tel);
	}
	public void messageClick(String mes)
	{
		message.sendKeys(mes);
	}
	public void submitClick()
	{
		sbbtn.click();
	}

	

	 
 
}
