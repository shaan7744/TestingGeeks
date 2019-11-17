package com.syska.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.syska.baseClass.BaseClass;
import com.syska.pageObjects.Home_Page;
import com.syska.pageObjects.Login_Page;
import com.syska.pageObjects.Support_Page;

public class Tc_Login_support_registration extends BaseClass{

	@Test
	public void supportRegTest() throws InterruptedException, IOException {
		driver.get(url);
		Thread.sleep(3000);
		logger.info("Url is opend");
		Login_Page lp=new Login_Page(driver);
		Home_Page hp=new Home_Page(driver);
		Support_Page sp=new Support_Page(driver);
		
		Thread.sleep(3000);
		lp.loginClick();
		Thread.sleep(3000);
		lp.setmail(emailId);
		Thread.sleep(1000);
		logger.info("Entered user name");
		lp.setpassword(password);
		Thread.sleep(1000);
		logger.info("Entered password");
		lp.clickbtn();
		Thread.sleep(8000);
		hp.clicksupportBtn();
		Thread.sleep(3000);
		sp.setNameInputBox();
		Thread.sleep(3000);
		sp.setemailInputBox();
		Thread.sleep(3000);
		sp.setphoneInputBox();
		Thread.sleep(3000);
		sp.setdobInputBox();
		Thread.sleep(2000);
		sp.clickRadioBtn();
		Thread.sleep(1000);
		sp.clickNextBtn();
		Thread.sleep(1000);
		
		sp.setPinInputBox();
		Thread.sleep(2000);
		sp.setaddresInputBox();
		Thread.sleep(2000);
		sp.setLandmarkInputBox();
		Thread.sleep(2000);
		sp.setCityInputBox();
		Thread.sleep(2000);
		sp.setRegionInputBox();
		Thread.sleep(2000);
		sp.clickaddressNextBtn();
		Thread.sleep(2000);
		sp.setPrsnCareField();
		Thread.sleep(2000);
		sp.setOnlineField();
		Thread.sleep(2000);
		sp.setSubCategField();
		Thread.sleep(2000);
		sp.setModelNumField();
		sp.setInvoiceNumField();
		Thread.sleep(2000);
		sp.setpurchasedateField();
		Thread.sleep(2000);
		sp.setstoreAddField();
		Thread.sleep(2000);
		sp.setconditionField();
		Thread.sleep(2000);
		//sp.setProofField();
		//Thread.sleep(2000);
		sp.clickSubmitBtn();
		Thread.sleep(2000);
		String purch_msg=sp.checkpurcherrorField();
		Thread.sleep(2000);
		if(purch_msg.equals("This is a required field."))
		{
			Assert.assertTrue(true);
			logger.info("Support test Passed");
		}
		else
		{
			capturesScreen(driver, "TC_support_registration");
			Assert.assertTrue(false);
			logger.info("Support test failed");
		}



		

	}
}
