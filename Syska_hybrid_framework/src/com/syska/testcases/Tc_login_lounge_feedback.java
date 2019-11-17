package com.syska.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.syska.baseClass.BaseClass;
import com.syska.pageObjects.ExtensionCords_Page;
import com.syska.pageObjects.Login_Page;
import com.syska.pageObjects.Lounge_Page;

public class Tc_login_lounge_feedback extends BaseClass {
	@Test
	public void ExtensionTest() throws IOException, InterruptedException
	{
		driver.get(url);
		Thread.sleep(3000);
		logger.info("Url is opend");
		Login_Page lp=new Login_Page(driver);
		ExtensionCords_Page ex=new ExtensionCords_Page(driver);
		Lounge_Page l3=new Lounge_Page(driver);
		 
		lp.loginClick();
		
		lp.setmail(emailId);
		logger.info("Entered user name");
		lp.setpassword(password);
		logger.info("Entered password");
		lp.clickbtn();
		Thread.sleep(5000);
		l3.loungClick();
		Thread.sleep(3000);
		l3.nameClick("test");
		Thread.sleep(3000);
		l3.mailClick("xyz@gmail.com");
		Thread.sleep(3000);
		l3.subjectClick("Led Bulb");
		Thread.sleep(3000);
		l3.cityClick("BLR");
		Thread.sleep(3000);
		l3.telephoneClick("9188567823");
		Thread.sleep(3000);
		l3.messageClick("Led bulb is not working and it is in warranty");
		Thread.sleep(3000);
		l3.submitClick();
		Thread.sleep(3000);
		 

}}
