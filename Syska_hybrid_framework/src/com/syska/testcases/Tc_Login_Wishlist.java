package com.syska.testcases;

import java.io.IOException;
import org.testng.annotations.Test;
import com.syska.baseClass.BaseClass;
import com.syska.pageObjects.Login_Page;
import com.syska.pageObjects.WishList;

public class Tc_Login_Wishlist extends BaseClass {
	
	@Test
	public void wishListTest() throws IOException, InterruptedException
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
		Thread.sleep(5000);	
		WishList wp=new WishList(driver);
		Thread.sleep(5000);
		wp.ledbtn();
		Thread.sleep(5000);		
		wp.wishlistClick();
		Thread.sleep(5000);
		wp.saveClick();
		Thread.sleep(5000);		
		wp.emailClick("testinggeeks2372@gmail.com");
		logger.info("enter email id");
		Thread.sleep(3000);
		wp.passwordClick("Testinggeeks2372");
		logger.info("Enter password");
		Thread.sleep(3000);
		wp.loginClick();
		Thread.sleep(5000);
		 		
	}
}