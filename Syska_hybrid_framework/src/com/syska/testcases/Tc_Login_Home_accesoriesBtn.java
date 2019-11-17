package com.syska.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.syska.baseClass.BaseClass;
import com.syska.pageObjects.Accessories_Page;
import com.syska.pageObjects.Accessories_Page1;
import com.syska.pageObjects.Home_Page;
import com.syska.pageObjects.Login_Page;

public class Tc_Login_Home_accesoriesBtn extends BaseClass {

	@Test
	public void accesoriesBtntest() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
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
		Thread.sleep(5000);
		Home_Page hp=new Home_Page(driver);
		
		Accessories_Page1 acsp=new Accessories_Page1(driver);
		
 
		hp.clickAcessoriesBtn();
		Thread.sleep(2000);
		acsp.clickonreturnPolicyField();
		Thread.sleep(2000);
		//acsp.clickonearphoneField();
		
		if(driver.getTitle().equals("Return Policy")) {
			Assert.assertTrue(true);
			logger.info("Accesories Btn Test passed");
		}else {
			capturesScreen(driver, "Tc_Home_accesoriesBtn");
			Assert.assertTrue(false);
			logger.info("Accesories Btn Test Failed");
		}


	}
	
}
