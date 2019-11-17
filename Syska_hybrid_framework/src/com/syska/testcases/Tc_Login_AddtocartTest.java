package com.syska.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.syska.baseClass.BaseClass;
import com.syska.pageObjects.Addtocart_Page;
import com.syska.pageObjects.Login_Page;

public class Tc_Login_AddtocartTest extends BaseClass {
			@Test
	public void Addtocart() throws IOException, InterruptedException
	{

	
		driver.get(url);
		Thread.sleep(3000);
		logger.info("Url is opend");
		Login_Page lp=new Login_Page(driver);
		Addtocart_Page ap=new Addtocart_Page (driver);
		lp.loginClick();
		
		lp.setmail(emailId);
		logger.info("Entered user name");
		lp.setpassword(password);
		logger.info("Entered password");
		lp.clickbtn();		
		
		Thread.sleep(3000);
		ap.pcareClick();
		Thread.sleep(3000);
		ap.pprodClick();
		Thread.sleep(3000);
		ap.atocartClick();
		Thread.sleep(3000);
		ap.atotalClick();
		Thread.sleep(3000);

}
}