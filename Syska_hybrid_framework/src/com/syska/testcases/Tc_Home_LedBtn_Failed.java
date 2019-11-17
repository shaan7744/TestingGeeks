package com.syska.testcases;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.syska.baseClass.BaseClass;
import com.syska.pageObjects.Home_Page;
import com.syska.pageObjects.Led_Page1;
import com.syska.pageObjects.Login_Page;

public class Tc_Home_LedBtn_Failed extends BaseClass{
	
	@Test
	public void ledbtnTest() throws InterruptedException, IOException {
		driver.get(url);
		Thread.sleep(3000);
		logger.info("url is opened");
		Login_Page lp=new Login_Page(driver);
/*
		lp.loginClick();
		lp.setmail(emailId);
		logger.info("Entered user name");
		lp.setpassword(password);
		logger.info("Entered password");
		lp.clickbtn();
		Thread.sleep(3000);
		
		*/
		Home_Page hp=new Home_Page(driver);
		Led_Page1 lep=new Led_Page1(driver);
		hp.clickLedBtn();
		Thread.sleep(3000);
		lep.clickLearnmoreBtn2();
		if(driver.getTitle().equals("Project Intro345")) {
			Assert.assertTrue(true);
			logger.info("Led Btn Test passed");
		}else {
			capturesScreen(driver, "Tc_Home_LedBtn");
			Assert.assertTrue(false);
			logger.info("Led Btn Test Failed");
		}
		
	}
	
}
