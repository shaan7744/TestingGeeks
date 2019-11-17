package com.syska.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.syska.baseClass.BaseClass;
import com.syska.pageObjects.Accessories_Page;
import com.syska.pageObjects.Login_Page;
import com.syska.pageObjects.SmartLights;

public class Tc_login_smartLights extends BaseClass{
	@Test
	public void Accessories() throws IOException, InterruptedException
	{
		driver.get(url);
		Thread.sleep(3000);
		logger.info("Url is opend");
		Login_Page lp=new Login_Page(driver);
		SmartLights s=new SmartLights(driver);
		lp.loginClick();
		
		lp.setmail(emailId);
		logger.info("Entered user name");
		lp.setpassword(password);
		logger.info("Entered password");
		lp.clickbtn();
		Thread.sleep(5000);
	s.smartlightClick();
	Thread.sleep(5000);
	s.viewmoreClick();
	Thread.sleep(5000);

}}
