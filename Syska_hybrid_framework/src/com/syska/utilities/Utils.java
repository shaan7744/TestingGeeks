package com.syska.utilities;

import java.io.IOException;

import com.syska.baseClass.BaseClass;
import com.syska.pageObjects.Accessories_Page;
import com.syska.pageObjects.Login_Page;
import com.syska.utilities.xlsreader;
 

 

public class Utils  extends BaseClass{

	public String[][] getData(String testname) throws IOException
	{
		String path = System.getProperty("user.dir")+"/src/com/syska/testData/LoginData.xlsx";
		int rownum=XLUtils.getRowCount(path, testname);
		int colnum=XLUtils.getCellCount(path, testname, 1);
		String data[][]=new String[rownum][colnum];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colnum;j++)
			{
				data[i-1][j]=XLUtils.getCellData(path, testname, i, j);
			}
		}
		
		return data;
	}
	
	public  void doLogin(String username,String password) throws InterruptedException
	{	
		driver.get(url);
		Thread.sleep(3000);
		logger.info("Url is opend");
		Login_Page lp3=new Login_Page(driver);
		lp3.loginClick();
		lp3.setmail(username);
		logger.info("user name provided");
		lp3.setpassword(password);
		logger.info("password provided");
		lp3.clickbtn();
		Thread.sleep(9000);
		Accessories_Page a=new Accessories_Page(driver);
		Thread.sleep(4000);
		a.AccessClick();
		Thread.sleep(4000);	
	}
	public static void setData(String testname,String colname, String  existerowVal, String Status, String existcolName)
	{
		xlsreader setdata = new xlsreader(System.getProperty("user.dir")+"/src/com/syska/testData/LoginData.xlsx");
		int num = setdata.getCellRowNum(testname, existcolName, existerowVal);
		System.out.println(num);
		System.out.println(Status);
		setdata.setCellData(testname, colname, num, Status);
	}
	
	
}
