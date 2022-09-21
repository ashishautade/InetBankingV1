package com.InetBankingV1.testCases;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
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

import com.InetBankingV1.utilities.ReadConfig;


public class BaseClass 
{	ReadConfig readconfig=new ReadConfig();
	public String baseURL=readconfig.getApplicationURL();
	public String username=readconfig.getUsername();
	public String password=readconfig.getPassword();
	public static WebDriver driver;
	public static Logger loggers;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{
		loggers=Logger.getLogger("ebanking");
		PropertyConfigurator.configure("log4j.properties");
		
		
		
		if(br.equals("chrome"))
				{
					System.setProperty("webdriver.chrome.driver", readconfig.getchromepath());
					driver=new ChromeDriver();
				}
		
		if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", readconfig.getFireFoxPath());
			driver=new FirefoxDriver();
		}
		
		if(br.equals("ie"))
		{
			System.setProperty("Webdriver.ie.driver", readconfig.getIEPath());
			driver=new InternetExplorerDriver();
		}
		
		driver.get(baseURL);
		loggers.info("URL is opened");
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	
	public void captureScreen(WebDriver driver,String tname) throws IOException
	{
		TakesScreenshot ts=((TakesScreenshot)driver);
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+"/Screenshots/"+tname+".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	
	public String randomstring()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(8);
		return (generatedstring);
	}
	 
	public String randomNum()
	{
		String generatedstring2=RandomStringUtils.randomNumeric(4);
		return (generatedstring2);
	}
}
