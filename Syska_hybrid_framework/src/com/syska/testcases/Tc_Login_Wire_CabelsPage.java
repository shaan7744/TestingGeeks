package com.syska.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.syska.baseClass.BaseClass;
import com.syska.pageObjects.Login_Page;
import com.syska.pageObjects.Wire_Cables_Page;

public class Tc_Login_Wire_CabelsPage extends BaseClass {	
	
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
		Wire_Cables_Page cp=new Wire_Cables_Page(driver);
		cp.Wire_cablesbtn();
		Thread.sleep(5000);
		String str = driver.findElement(By.xpath("//h2[contains(text(),'Flame Retardant')]")).getText();
		System.out.println(str);
		
			
	}
		
}
	
	
