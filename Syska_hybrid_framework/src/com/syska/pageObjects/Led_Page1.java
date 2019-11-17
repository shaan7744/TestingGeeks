package com.syska.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Led_Page1 {
	WebDriver ldriver;
	public Led_Page1(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	@FindBy(how=How.XPATH, using="//div[@class='container-xs box-style']//a[@class='btn'][contains(text(),'Learn More')]")
	WebElement learnMoreBtn;
	
	public void clickLearnmoreBtn2() {
		learnMoreBtn.click();

	}
	
}
