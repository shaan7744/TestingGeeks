package com.syska.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Led_Page {
	WebDriver ldriver;
	public Led_Page(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(how=How.XPATH, using="/html[1]/body[1]/div[1]/header[1]/div[2]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[1]/a[1]/span[2]") 
	WebElement ledBtn;
	
	@FindBy(how=How.XPATH,using="//div[@class='container-sm']//a[@class='btn'][contains(text(),'Learn More')]")
	WebElement LearnmoreBtn;
	
	@FindBy(how=How.XPATH,using="//a[@class='btn btn-o btn-l three sliding']")
	WebElement SwitchOnBtn;
	
	@FindBy(how=How.XPATH,using="//a[@id='open-lounge-store-popup']")
	WebElement StoreBtn;
	
	public void ledbtn()
	{
		ledBtn.click();
	}
	public void LearnmoreBtn()
	{
		LearnmoreBtn.click();
	}
	
	public void SwitchOnBtn()
	{
		SwitchOnBtn.click();                                                                                                                                                                                   
	}
	
	public void StoreBtn()
	{
		StoreBtn.click();                                                                                                                                                                                   
	}
	
	
}
