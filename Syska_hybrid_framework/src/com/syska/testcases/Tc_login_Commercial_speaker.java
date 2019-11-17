package com.syska.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.syska.baseClass.BaseClass;
import com.syska.pageObjects.Accessories_Page;
import com.syska.pageObjects.Commercial_Page;
import com.syska.pageObjects.Login_Page;
import com.syska.pageObjects.Speaker_page;

public class Tc_login_Commercial_speaker extends BaseClass {
	@Test
	public void Addtocart() throws IOException, InterruptedException
	{
		
		driver.get(url);
		Thread.sleep(3000);
		logger.info("Url is opend");
		Login_Page lp=new Login_Page(driver);
		Accessories_Page a=new Accessories_Page(driver);
		Speaker_page sp=new Speaker_page(driver);
		lp.loginClick();
		
		lp.setmail(emailId);
		logger.info("Entered user name");
		lp.setpassword(password);
		logger.info("Entered password");
		lp.clickbtn();
		Thread.sleep(3000);
		sp.comm12Click();
		Thread.sleep(3000);
		sp.sortClick();
		Thread.sleep(3000);
		sp.appClick();
		Thread.sleep(3000);
		sp.speakerClick();
		Thread.sleep(3000);
		sp.selectspClick();
		Thread.sleep(3000);
}}
