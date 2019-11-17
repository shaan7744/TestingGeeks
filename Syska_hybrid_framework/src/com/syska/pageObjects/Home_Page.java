package com.syska.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {

	WebDriver ldriver;
	public Home_Page(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how=How.XPATH, using="//a[@id='ui-id-2']//span[contains(text(),'Led')]")
	WebElement ledBtnNav;
	
	@FindBy(how=How.XPATH, using="//a[@id='ui-id-3']")
	WebElement acessoriesBtnNav;
	
	@FindBy(how=How.XPATH, using="//input[@id='newsletter']")
	WebElement emailEditBox;
	
	@FindBy(how=How.XPATH, using="//span[contains(text(),'Subscribe')]")
	WebElement subscribeBtn;
	
	@FindBy(how=How.XPATH, using="//div[@id='loading-message']")
	WebElement subscribeMessage;

	@FindBy(how=How.XPATH, using="//span[contains(text(),'Home Appliances')]")
	WebElement homeApplianceBtn;
	
	@FindBy(how=How.XPATH, using="/html[1]/body[1]/div[1]/header[1]/div[2]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[6]/a[1]")
	WebElement supportBtnNav;
	
	public void clickLedBtn() {
		// TODO Auto-generated method stub
		ledBtnNav.click();

	}
	public void clickAcessoriesBtn() {
		// TODO Auto-generated method stub
		acessoriesBtnNav.click();

	}
	public void setEmailEditBox(String sub_email) {
		// TODO Auto-generated method stub
		emailEditBox.sendKeys(sub_email);

	}
	public void clicksubscribeBtn() {
		// TODO Auto-generated method stub
		subscribeBtn.click();

	}
	public String checkSubscribeBtn() {
		// TODO Auto-generated method stub
		String sub_msg=subscribeMessage.getText();
		return sub_msg;

	}
	public void clickhomeapplianceBtn() {
		// TODO Auto-generated method stub
		homeApplianceBtn.click();

	}
	public void clicksupportBtn() {
		// TODO Auto-generated method stub
		supportBtnNav.click();

	}
	
}
