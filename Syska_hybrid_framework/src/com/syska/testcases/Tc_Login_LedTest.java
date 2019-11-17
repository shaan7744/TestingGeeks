package com.syska.testcases;

import java.io.IOException;
import org.testng.annotations.Test;
import com.syska.baseClass.BaseClass;
import com.syska.pageObjects.Led_Page;
import com.syska.pageObjects.Login_Page;

public class Tc_Login_LedTest extends BaseClass {
	@Test
	public void ledTest() throws IOException, InterruptedException
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
		Led_Page lp4=new Led_Page(driver);
		Thread.sleep(5000);
		lp4.ledbtn();
		Thread.sleep(5000);
		lp4.LearnmoreBtn();
		Thread.sleep(5000);
		lp4.SwitchOnBtn();
		Thread.sleep(5000);
		lp4.StoreBtn();
		Thread.sleep(5000);
		
		
	}
	
}
