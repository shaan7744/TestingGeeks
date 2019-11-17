package com.syska.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.syska.baseClass.BaseClass;
import com.syska.pageObjects.Dryiron_Page;
import com.syska.pageObjects.Login_Page;
import com.syska.pageObjects.Profile;
import com.syska.pageObjects.Shop_Page;

public class Tc_Login_Profile_Edit extends BaseClass {
	@Test
	public void dryironsTest() throws IOException, InterruptedException
	{
		driver.get(url);
		Thread.sleep(3000);
		logger.info("Url is opend");
		Login_Page lp=new Login_Page(driver);
		Profile p=new  Profile(driver);
		lp.loginClick();
		Thread.sleep(5000);
		lp.setmail(emailId);
		logger.info("Entered user name");
		lp.setpassword(password);
		logger.info("Entered password");
		lp.clickbtn();
		Thread.sleep(5000);
		p.profileClick1();
		Thread.sleep(5000);
		capturesScreen(driver, "Profile_LoginTest");
		p.profileClick();
		Thread.sleep(5000);
		p.editClick();
		Thread.sleep(5000);
		p.nameClick("Test Name");
		Thread.sleep(5000);
		p.saveClick();
		Thread.sleep(5000);
		 
			 
		 
		 
		 
}
	}
