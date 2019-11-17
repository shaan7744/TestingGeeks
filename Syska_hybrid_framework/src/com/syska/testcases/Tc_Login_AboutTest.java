package com.syska.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.syska.baseClass.BaseClass;
import com.syska.pageObjects.About_Us_Page;
import com.syska.pageObjects.Login_Page;


public class Tc_Login_AboutTest extends BaseClass{

	@Test
	public void aboutTest() throws IOException, InterruptedException
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
		About_Us_Page ab=new About_Us_Page(driver);
		Thread.sleep(5000);
		ab.abtClick();
		Thread.sleep(3000);
		ab.abdesClick();
		Thread.sleep(3000);
		ab.abrelClick();
		Thread.sleep(3000);
		ab.abconClick();
		Thread.sleep(3000);
    	

}
}
