package com.syska.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.syska.baseClass.BaseClass;
import com.syska.pageObjects.Dryiron_Page;
import com.syska.pageObjects.Login_Page;
import com.syska.pageObjects.Media_Page;

public class Tc_Login_MediaTest extends BaseClass {
	@Test
	public void mediaTest() throws IOException, InterruptedException
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
		Media_Page mp=new Media_Page(driver);
		Thread.sleep(3000);
		mp.medClick();
		Thread.sleep(3000);
		mp.msyskaClick();
		Thread.sleep(3000);
		
		
	
		
}
}