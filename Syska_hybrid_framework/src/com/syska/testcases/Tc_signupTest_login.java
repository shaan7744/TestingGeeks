package com.syska.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.syska.baseClass.BaseClass;
import com.syska.pageObjects.Accessories_Page;
import com.syska.pageObjects.Login_Page;
import com.syska.pageObjects.PowerBank;
import com.syska.pageObjects.Signup_Page;

public class Tc_signupTest_login extends BaseClass {
	
	@Test
	public void signup_Test() throws IOException, InterruptedException
	{
		driver.get(url);
		logger.info("Url is opend");
		Signup_Page lp2=new Signup_Page(driver);
		Login_Page lp=new Login_Page(driver);
		
		lp2.logon_buttonClick();
		lp2.create_account_buttonClick();
		lp2.setfullname(fullName);
		logger.info("Entered full name");
		lp2.setmail1(emailId);
		logger.info("Entered user name");
		lp2.setpassword(password);
		logger.info("Entered password");
		lp2.clicksignup_buttton();
		Thread.sleep(5000);
		lp.loginClick();
		Thread.sleep(5000);
		lp.setmail(emailId);
		logger.info("Entered user name");
		lp.setpassword(password);
		logger.info("Entered password");
		lp.clickbtn();
		Thread.sleep(5000);
		 

	}
}
