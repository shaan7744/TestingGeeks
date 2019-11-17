package com.syska.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.syska.baseClass.BaseClass;
import com.syska.pageObjects.Accessories_Page;
import com.syska.pageObjects.Dryiron_Page;
import com.syska.pageObjects.Login_Page;


public class Tc_Login_DryironTest extends BaseClass {
	
	@Test
	public void dryironsTest() throws IOException, InterruptedException
	{
		driver.get(url);
		Thread.sleep(3000);
		logger.info("Url is opend");
		Login_Page lp=new Login_Page(driver);
		Dryiron_Page d=new Dryiron_Page(driver);
		 
		lp.loginClick();
		
		lp.setmail(emailId);
		logger.info("Entered user name");
		lp.setpassword(password);
		logger.info("Entered password");
		lp.clickbtn();
		Thread.sleep(5000);
		
	 
    	d.appliancesClick();
		Thread.sleep(5000);
		d.ironsClick();
		Thread.sleep(5000);
		d.dryIronsClick();
		Thread.sleep(5000);		
		d.imgClick();
		Thread.sleep(5000);
		d.price();
		Thread.sleep(3000);
		

	}

}
