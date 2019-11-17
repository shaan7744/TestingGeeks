package com.syska.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.syska.baseClass.BaseClass;
import com.syska.pageObjects.Accessories_Page;
import com.syska.pageObjects.Login_Page;
import com.syska.pageObjects.Steamiron_Page;

public class Tc_Login_SteamironTest extends BaseClass {
	@Test
	public void steamironsTest() throws IOException, InterruptedException
	{
		driver.get(url);
		Thread.sleep(3000);
		logger.info("Url is opend");
		Login_Page lp=new Login_Page(driver);
		Steamiron_Page s=new Steamiron_Page(driver);
		lp.loginClick();
		
		lp.setmail(emailId);
		logger.info("Entered user name");
		lp.setpassword(password);
		logger.info("Entered password");
		lp.clickbtn();
		Thread.sleep(5000);
		s.appClick();
	    Thread.sleep(5000);
	    s.ironsClick();
		Thread.sleep(5000);
		s.steamIronsClick();
		Thread.sleep(5000);
		s.steam_imgClick();
		Thread.sleep(5000);
		s.stext();
		Thread.sleep(5000);
		

	}

}
