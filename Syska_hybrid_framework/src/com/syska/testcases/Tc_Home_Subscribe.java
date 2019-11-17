package com.syska.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.syska.baseClass.BaseClass;
import com.syska.pageObjects.Home_Page;

public class Tc_Home_Subscribe extends BaseClass{
	@Test
	public void subscribeFieldTest() throws InterruptedException, IOException {
		driver.get(url);
		Thread.sleep(3000);
		logger.info("url is opened");
		Home_Page hp=new Home_Page(driver);
		Thread.sleep(3000);
		hp.setEmailEditBox(sub_email);
		Thread.sleep(3000);
		hp.clicksubscribeBtn();
		Thread.sleep(3000);
		String sub_msg=hp.checkSubscribeBtn();
		Thread.sleep(3000);
		if(sub_msg.equals("Thank you for your subscription.")) {
			Assert.assertTrue(true);
			logger.info("Subscribe test Passed");
		}
		else
		{
			capturesScreen(driver, "Tc_LoginTest");
			Assert.assertTrue(false);
			logger.info("Subscribe test failed");
		}
	}
}
