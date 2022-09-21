package com.InetBankingV1.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.InetBankingV1.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass
{
	
	@Test
	public void loginTest() throws InterruptedException, IOException
	{	 
		
		LoginPage lp=new LoginPage(driver);
		lp.setusername(username);
		loggers.info("entered username");
		lp.setpassword(password);
		loggers.info("entered password");
		lp.clicksubmit();
		loggers.info("clicked on submit");
		Thread.sleep(5000);
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			loggers.info("login paseed");
		}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			loggers.info("login failed");
		}
		
		
		
		
	}
}
