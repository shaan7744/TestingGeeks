package com.syska.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.syska.baseClass.BaseClass;
import com.syska.pageObjects.Accessories_Page;
import com.syska.pageObjects.Accessories_Page1;
import com.syska.pageObjects.Addtocart_Page;
import com.syska.pageObjects.Addtocart_Page1;
import com.syska.pageObjects.Home_Page;
import com.syska.pageObjects.Login_Page;

public class Tc_Login_delete_Cart extends BaseClass{
	@Test
	public void deleteCartTest() throws IOException, InterruptedException
	{
		driver.get(url);
		Thread.sleep(3000);
		logger.info("Url is opend");
		Login_Page lp=new Login_Page(driver);
		Home_Page hp=new Home_Page(driver);
		Accessories_Page1 acsp=new Accessories_Page1(driver);
		Addtocart_Page1 cart=new Addtocart_Page1(driver);
		
		lp.loginClick();
		
		lp.setmail(emailId);
		logger.info("Entered user name");
		lp.setpassword(password);
		logger.info("Entered password");
		lp.clickbtn();
		Thread.sleep(2000);
		
		hp.clickhomeapplianceBtn();
		Thread.sleep(2000);
		acsp.clickViewMoreBtn();
		Thread.sleep(2000);
		acsp.clickOnProductimage();
		Thread.sleep(2000);
		cart.atocartClick();
		Thread.sleep(2000);
		cart.atotalClick();
		Thread.sleep(2000);
		cart.ClickOnDeleteCart();
		Thread.sleep(2000);
		cart.ClickOnPopupOkBtn();
		Thread.sleep(2000);
		
		String emptycart_msg=cart.CheckEmptyCart();
		
		if(emptycart_msg.equals("You have no items in your shopping cart.")) {
			Assert.assertTrue(true);
			logger.info("Empty cart test Passed");
		}
		else
		{
			capturesScreen(driver, "Tc_LoginTest");
			Assert.assertTrue(false);
			logger.info("Empty Cart test failed");
		}
		

	}
}
