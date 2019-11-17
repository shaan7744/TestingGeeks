package com.syska.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.syska.baseClass.BaseClass;
import com.syska.pageObjects.Accessories_Page;
import com.syska.pageObjects.Commercial_Page;
import com.syska.pageObjects.Login_Page;

public class Tc_login_commercial_cart extends BaseClass {
	
	@Test
public void Addtocart() throws IOException, InterruptedException
{
	
	driver.get(url);
	Thread.sleep(3000);
	logger.info("Url is opend");
	Login_Page lp=new Login_Page(driver);
	Accessories_Page a=new Accessories_Page(driver);
	Commercial_Page co=new Commercial_Page(driver);
	lp.loginClick();
	
	lp.setmail(emailId);
	logger.info("Entered user name");
	lp.setpassword(password);
	logger.info("Entered password");
	lp.clickbtn();
	Thread.sleep(3000);
	 co.commClick();
	 Thread.sleep(3000);
	 co.lightClick();
	 Thread.sleep(3000);
	 co.wattClick();
	 Thread.sleep(3000);
	 co.selectClick();
	 Thread.sleep(3000);
	 co.productClick();
	 Thread.sleep(3000);
	 co.cartClick();
	 
}
}