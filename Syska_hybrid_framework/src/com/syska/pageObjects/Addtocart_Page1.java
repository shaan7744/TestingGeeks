package com.syska.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.syska.baseClass.BaseClass;

public class Addtocart_Page1 extends BaseClass{
	WebDriver ldriver;// Reference of the Object
	 
	 public Addtocart_Page1 (WebDriver rdriver) //Constructor for invoking the driver
  {
		 this.ldriver=rdriver;
		 PageFactory.initElements(rdriver, this);
	 }
	 @FindBy
		(how=How.XPATH,using="//a[@id='ui-id-4']//span[contains(text(),'Personal Care')]")
		WebElement pcare;
	 @FindBy
		(how=How.XPATH,using="//a[@class='btn']")
		WebElement pcareprod;
	 @FindBy
		(how=How.XPATH,using="//button[@id='product-addtocart-button']//span[contains(text(),'Add to Cart')]")
		WebElement atcart;
	 @FindBy
		(how=How.XPATH,using="//a[@class='action showcart']//span[@class='counter qty']")
		WebElement atcartig;
	 
	 @FindBy
		(how=How.XPATH,using="//a[@class='action delete']")
		WebElement deleteCartitemBtn;
	 @FindBy
		(how=How.XPATH,using="//button[@class='action-primary action-accept']")
		WebElement popupOkBtn;
	 
	 @FindBy
		(how=How.XPATH,using="//strong[@class='subtitle empty']")
		WebElement emptyCartMsg;
	 
	 public void pcareClick() {
		 pcare.click();
	 }
	 public void pprodClick() {
		 pcareprod.click();
	 }
	 public void atocartClick() {
		 atcart.click();
	 }
	 public void atotalClick() {
		 atcartig.click();
	 }


	 public void ClickOnDeleteCart() {
		 deleteCartitemBtn.click();
	 }
	 
	 public void ClickOnPopupOkBtn() {
		 popupOkBtn.click();
	 }
	 
	 public String CheckEmptyCart() {
		String emptyCarttxt=emptyCartMsg.getText();
		return emptyCarttxt;
				
	 }

}
