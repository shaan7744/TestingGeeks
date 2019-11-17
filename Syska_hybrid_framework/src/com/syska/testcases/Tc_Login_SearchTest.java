package com.syska.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.syska.baseClass.BaseClass;
import com.syska.pageObjects.Login_Page;
import com.syska.pageObjects.Search_Option;

public class Tc_Login_SearchTest extends BaseClass {

	@Test
	public void searchTest() throws IOException, InterruptedException
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
		Thread.sleep(7000);
		Search_Option lp2=new Search_Option(driver);
		lp2.search6Click();
		
		lp2.senddata2("0.5W UltraFlare Torch T053AAA");
		logger.info("Entered search data");
		lp2.clickbtn4();
		logger.info("button is clicked");
		


	}
}
