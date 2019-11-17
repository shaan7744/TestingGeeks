package com.syska.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.syska.baseClass.BaseClass;
import com.syska.pageObjects.Login_Page;
import com.syska.pageObjects.Shop_Page;

public class Tc_Login_ShopTest extends BaseClass {
	@Test
	public void shopTest() throws IOException, InterruptedException
	{
		driver.get(url);
		Thread.sleep(3000);
		logger.info("Url is opend");
		Login_Page lp=new Login_Page(driver);
		Shop_Page sh=new Shop_Page(driver);
		lp.loginClick();
		Thread.sleep(5000);
		lp.setmail(emailId);
		logger.info("Entered user name");
		lp.setpassword(password);
		logger.info("Entered password");
		lp.clickbtn();
		Thread.sleep(5000);
		sh.shopClick();
		Thread.sleep(5000);
		sh.loc();
		Thread.sleep(5000);

}
}
