package com.syska.baseClass;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.syska.utilities.ReadConfig;
public class BaseClass {
	ReadConfig readConfig=new ReadConfig();
	public String url=readConfig.getApplicatioUrl();
	public String emailId=readConfig.getemailId();
	public String sub_email=readConfig.getSub_Email();
	public String fullName=readConfig.getfullName();
	public String password=readConfig.getpassword();
	public static WebDriver driver;
	public static Logger logger;
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{
		
	logger=Logger.getLogger("Syska");
		PropertyConfigurator.configure("Log4j.properties");
		if(br.equals("firefox"))
		{
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/Drivers/geckodriver.exe");
		driver =new FirefoxDriver();
		}
	else if(br.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
		driver =new ChromeDriver();
	}
	else if(br.equals("IE"))
	{
		System.setProperty("webdriver.IE.driver",System.getProperty("user.dir")+"/Drivers/IEDriverServer.exe");
		driver =new InternetExplorerDriver();
	}
		}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	public void capturesScreen(WebDriver driver,String tname) throws IOException
	{
		 
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+"/Screenshots/"+tname+".png");
		FileUtils.copyFile(source, target);
		System.out.println("ScreenShot taken");
	}
}                                      
