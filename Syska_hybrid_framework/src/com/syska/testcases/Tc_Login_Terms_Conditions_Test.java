package com.syska.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.syska.baseClass.BaseClass;
import com.syska.pageObjects.Dryiron_Page;
import com.syska.pageObjects.Login_Page;
import com.syska.pageObjects.Terms_Conditions_Page;

public class Tc_Login_Terms_Conditions_Test extends BaseClass{
	@Test
	public void dryironsTest() throws IOException, InterruptedException
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
		Terms_Conditions_Page tc=new Terms_Conditions_Page(driver);
		Thread.sleep(5000);
    	tc.tcClick();
    	Thread.sleep(5000);
    	tc.tctexClick();
    	Thread.sleep(5000);
    	driver.navigate().back();
    	Thread.sleep(5000);
    	driver.navigate().forward();
    	Thread.sleep(5000);
	}


}
