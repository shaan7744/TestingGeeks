package com.syska.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Media_Page {
	WebDriver ldriver;// Reference of the Object
	 

	 public  Media_Page(WebDriver rdriver) //Constructor for invoking the driver
 {
		 this.ldriver=rdriver;
		 PageFactory.initElements(rdriver, this);
	 }
	 @FindBy
		(how=How.XPATH,using="//a[contains(text(),'Media')]")
		WebElement media;
	 @FindBy
		(how=How.XPATH,using="//a[contains(text(),'Syska to partner with French lighting giant to mak')]")
		WebElement media_syska;
	 
	
	
	 public void medClick() {
		 media.click();
	 }
	 public void msyskaClick() {
		 media_syska.click();
	 }
	 
	 
}
