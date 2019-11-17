package com.syska.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Terms_Conditions_Page {
	WebDriver ldriver;// Reference of the Object
	 

	 public  Terms_Conditions_Page(WebDriver rdriver) //Constructor for invoking the driver
  {
		 this.ldriver=rdriver;
		 PageFactory.initElements(rdriver, this);
	 }
	 @FindBy
		(how=How.XPATH,using="//a[contains(text(),'Terms and condition')]")
		WebElement tc;
	 @FindBy
		(how=How.XPATH,using="//li[contains(text(),'SCOPE & APPLICATION')]")
		WebElement tctext;
	 public void tcClick() {
		 tc.click();
	 }
	 public void tctexClick() {
		 String str= tctext.getText();

		 System.out.println("The scope is:" +str);
	 }
	
	

}
