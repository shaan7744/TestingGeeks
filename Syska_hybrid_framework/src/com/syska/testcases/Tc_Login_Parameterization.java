package com.syska.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
 
import org.testng.xml.XmlUtils;

import com.syska.baseClass.BaseClass;
import com.syska.pageObjects.Accessories_Page;
import com.syska.pageObjects.Login_Page;
import com.syska.utilities.Utils;
import com.syska.utilities.XLUtils;
import com.syska.utilities.xlsreader;
 

public class Tc_Login_Parameterization extends BaseClass{
	@Test(dataProvider="LoginData")
	 
	public void loginDDT(String user,String pwd,String Status,String Message) throws InterruptedException, IOException
	{	
		Accessories_Page a=new Accessories_Page(driver);
		driver.get(url);
		Thread.sleep(3000);
		logger.info("Url is opend");
		Login_Page lp3=new Login_Page(driver);
		lp3.loginClick();
		lp3.setmail(user);
		logger.info("user name provided");
		lp3.setpassword(pwd);
		logger.info("password provided");
		lp3.clickbtn();
		Thread.sleep(4000);
		a.AccessClick();
		Thread.sleep(6000);
		if(driver.getTitle().equals("Accessories"))
		{
			capturesScreen(driver, "parameterization");
			Utils.setData("Sheet1", "status", user, "pass", "emailId");
			Utils.setData("Sheet1", "message", user, "login(Failure) testcase is successful", "emailID");
		 
		}
		else
		{
			Utils.setData("Sheet1", "status", user, "fail", "emailID");
			Utils.setData("Sheet1", "message", user, "login(Passed) testcase is successful", "emailId");
		}
 	 
	}
	@DataProvider(name="LoginData")
	String [][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"/src/com/syska/testData/LoginData.xlsx";
		
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path,"Sheet1",1);
		
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1", i,j); 
			}
				
		}
	return logindata;
	}
	
}