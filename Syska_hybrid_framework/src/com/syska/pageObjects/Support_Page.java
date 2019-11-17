package com.syska.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Support_Page {
	WebDriver ldriver;
	public Support_Page(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how=How.XPATH, using="//input[@id='cust_name']")
	WebElement nameInputBox;
	
	@FindBy(how=How.XPATH, using="//input[@id='email']")
	WebElement emailInputBox;
	
	@FindBy(how=How.XPATH, using="//input[@id='mobile']")
	WebElement phoneInputBox;
	
	@FindBy(how=How.XPATH, using="//input[@id='datepicker-dob']")
	WebElement dobInputBox;
	
	@FindBy(how=How.XPATH, using="//tr[3]//td[3]")
	WebElement dobDateBtn;
	
	@FindBy(how=How.XPATH, using="//label[contains(text(),'Female')]")
	WebElement femaleRadioBtn;
	
	@FindBy(how=How.XPATH, using="//button[@id='personalBtn']")
	WebElement nextBtn;
	
	@FindBy(how=How.XPATH, using="//input[@id='pincode']")
	WebElement pincodeInputBox;

	@FindBy(how=How.XPATH, using="//input[@id='residence_address']")
	WebElement addresInputBox;
	
	@FindBy(how=How.XPATH, using="//input[@id='landmark']")
	WebElement landmarkInputBox;
	
	@FindBy(how=How.XPATH, using="//input[@id='city']")
	WebElement cityInputBox;
	
	@FindBy(how=How.XPATH, using="//select[@id='state']")
	WebElement regionInputBox;
	
	@FindBy(how=How.XPATH, using="//option[contains(text(),'Karnataka')]")
	WebElement karnatakaBtn;
	
	@FindBy(how=How.XPATH, using="//button[@id='nextProductInfoBtn']")
	WebElement addresNextBtn;
	
	@FindBy(how=How.XPATH, using="//select[@id='product_category']")
	WebElement prsnlCareDropdown;
	
	@FindBy(how=How.XPATH, using="//option[contains(text(),'Led')]")
	WebElement ledDropdown;
	
	@FindBy(how=How.XPATH, using="//select[@id='purchase_from']")
	WebElement onlineDropdown;
	
	@FindBy(how=How.XPATH, using="//select[@id='sub_product_category']")
	WebElement subCategDropdown;
	
	@FindBy(how=How.XPATH, using="//option[contains(text(),'LED Tubelight')]")
	WebElement subCatTubeLghtDrpdwn;
	
	@FindBy(how=How.XPATH, using="//option[contains(text(),'Online')]")
	WebElement selectOnlineDropdown;
	
	@FindBy(how=How.XPATH, using="//select[@id='model_number']")
	WebElement modelNumDrpdwn;
	
	@FindBy(how=How.XPATH, using="//option[contains(text(),'SSK-SQ-2201 (6500K)')]")
	WebElement selectModelDropdown;
	
	@FindBy(how=How.XPATH, using="//input[@id='invoice_number']")
	WebElement invoiceNumInputBox;
	
	@FindBy(how=How.XPATH, using="//input[@id='datepicker-purchase_date']")
	WebElement purchdateBtn;
	
	@FindBy(how=How.XPATH, using="//tr[3]//td[5]")
	WebElement selctPurchdate;
	
	@FindBy(how=How.XPATH, using="//input[@id='store_addres']")
	WebElement storeadressInputBox;
	
	@FindBy(how=How.XPATH, using="//input[@id='termsandcondition']")
	WebElement conditionCheckBox;
	
	@FindBy(how=How.XPATH, using="//label[contains(@class,'btn btn-o')]")
	WebElement proofBtn;
	
	@FindBy(how=How.XPATH, using="//button[@id='submitBtn']")
	WebElement submitBtn;
	
	@FindBy(how=How.XPATH, using="//div[@id='proof_of_purchase-error']")
	WebElement purcherrorField;
	
	public String checkpurcherrorField() {
		String purch_msg=purcherrorField.getText();
		return purch_msg;

	}

	public void clickSubmitBtn() {
		submitBtn.click();

	}
	
	public void setProofField() {
		proofBtn.click();

	}
	
	public void setconditionField() {
		conditionCheckBox.click();

	}
	
	public void setpurchasedateField() {
		purchdateBtn.click();
		selctPurchdate.click();

	}
	
	public void setstoreAddField() {
		storeadressInputBox.sendKeys("bangalore");

	}

	
	public void setInvoiceNumField() {
		invoiceNumInputBox.sendKeys("56655658");
	}
	
	public void setModelNumField() {
		modelNumDrpdwn.click();
		selectModelDropdown.click();
		
	}
	
	public void setSubCategField() {
		subCategDropdown.click();
		subCatTubeLghtDrpdwn.click();
		
	}
	
	public void setOnlineField() {
		onlineDropdown.click();
		selectOnlineDropdown.click();
		
	}
	
	public void setPrsnCareField() {
		prsnlCareDropdown.click();
		ledDropdown.click();
		
	}


	public void setNameInputBox() {
		nameInputBox.sendKeys("testing geeks");
	}
	public void setemailInputBox() {
		emailInputBox.sendKeys("testinggeeks@gmail.com");
	}
	
	public void setphoneInputBox() {
		phoneInputBox.sendKeys("9867156352");
	}
	
	public void setdobInputBox() {
		dobInputBox.click();
		dobDateBtn.click();
		
	}
	
	public void clickRadioBtn() {
		femaleRadioBtn.click();
	}
	
	public void clickNextBtn() {
		nextBtn.click();
	}
	public void setPinInputBox() {
		pincodeInputBox.sendKeys("560076");
	}
	public void setaddresInputBox() {
		addresInputBox.sendKeys("Shailendra tech park");
	}
	
	public void setLandmarkInputBox() {
		landmarkInputBox.sendKeys("Whitefield");
	}
	
	public void setCityInputBox() {
		cityInputBox.sendKeys("Bangalore");
	}

	public void setRegionInputBox() {
		regionInputBox.sendKeys("Bangalore");
		karnatakaBtn.click();
	}
	public void clickaddressNextBtn() {
		addresNextBtn.click();
	}


}
