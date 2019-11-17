package com.syska.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.syska.baseClass.BaseClass;
import com.syska.pageObjects.Dryiron_Page;
import com.syska.pageObjects.ExtensionCords_Page;
import com.syska.pageObjects.Login_Page;


public class Tc_Login_ExtensionTest extends BaseClass {
@Test
public void ExtensionTest() throws IOException, InterruptedException
{
	driver.get(url);
	Thread.sleep(3000);
	logger.info("Url is opend");
	Login_Page lp=new Login_Page(driver);
	ExtensionCords_Page ex=new ExtensionCords_Page(driver);
	 
	lp.loginClick();
	
	lp.setmail(emailId);
	logger.info("Entered user name");
	lp.setpassword(password);
	logger.info("Entered password");
	lp.clickbtn();
	Thread.sleep(5000);
	
	
	Thread.sleep(5000);
	ex.happClick();
	Thread.sleep(5000);
	ex.prodClick();
	Thread.sleep(5000);
	ex.extensClick();
	Thread.sleep(5000);
	ex.extimgClick();
	Thread.sleep(5000);

}
}