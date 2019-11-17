package com.syska.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Speaker_page {
	WebDriver ldriver;
	public Speaker_page(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy
	(how=How.XPATH,using="//div[@class='footer-quick-links']//a[contains(text(),'Commercial')]")
	WebElement comm;
 @FindBy
	(how=How.XPATH,using="//body[@class='page-with-filter page-products categorypath-led-cms-commercial category-commercial catalog-category-view page-layout-2columns-left active']/div[@class='page-wrapper active']/main[@id='maincontent']/div[@class='columns active']/div[@class='sidebar sidebar-additional active']/ul[@class='o-list active']/li[2]/span[1]/i[1]")
	WebElement sort;
 @FindBy
	(how=How.XPATH,using="//li[@class='level0 active']//li[2]//span[1]//i[1]")
	WebElement apps;
 @FindBy
	(how=How.XPATH,using="//a[contains(text(),'Speakers')]")
	WebElement speaker;
 @FindBy
	(how=How.XPATH,using="//a[contains(text(),'Beat Metallic 3W Wireless Speaker')]")
	WebElement selectsp;
 public void comm12Click()
	{
		comm.click();
	}

	public void sortClick()
	{
		 sort.click();
		 
	}
	public void appClick()
	{
		apps.click();
	}

	public void speakerClick()
	{
		 speaker.click();
		 
	}
	public void selectspClick()
	{
		selectsp.click();
		 
	}
	
	
}
