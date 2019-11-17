package com.syska.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.syska.baseClass.BaseClass;
import com.syska.pageObjects.Login_Page;

public class Tc_LoginTest extends BaseClass {

	@Test
	public void loginTest() throws IOException, InterruptedException
	{
		driver.get(url);
		Thread.sleep(3000);
		logger.info("Url is opend");
		Login_Page lp=new Login_Page(driver);
		lp.loginClick();
		
		lp.setmail(emailId);
		logger.info("Entered user name");
		lp.setpassword(password);
		logger.info("Entered password");
		lp.clickbtn();
		if(driver.getTitle().equals("Syska"))
		{
			Assert.assertTrue(true);
			logger.info("Login test Passed");
		}
		else
		{
			capturesScreen(driver, "Tc_LoginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}

	}
}
