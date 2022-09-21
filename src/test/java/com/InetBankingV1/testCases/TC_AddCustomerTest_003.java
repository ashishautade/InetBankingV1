package com.InetBankingV1.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.InetBankingV1.pageObjects.AddCustomerPage;
import com.InetBankingV1.pageObjects.LoginPage;

public class TC_AddCustomerTest_003 extends BaseClass
{	
	@Test
	public void addNewCustmer() throws InterruptedException, IOException
	{
		LoginPage lp=new LoginPage(driver);

		lp.setusername(username);
		loggers.info("username provided");
		lp.setpassword(password);
		loggers.info("password provided");
		lp.clicksubmit();
		loggers.info("login success");
		
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		AddCustomerPage addcust=new AddCustomerPage(driver);
		addcust.clickAddNewCustomer();
		addcust.custName("ashish");
		addcust.custgender();
		Thread.sleep(2000);
		addcust.custdob("10", "26", "1997");
		addcust.custaddress("pune");
		addcust.custcity("pune");
		addcust.custstate("MH");
		addcust.custpinno("411044");
		Thread.sleep(2000);
		addcust.custtelephoneno("7709045371");
		Thread.sleep(2000);
		String email=randomstring()+"@gmail.com";
		addcust.cemailid(email);
		
		Thread.sleep(2000);
		addcust.custpassword("Ashish@24");
		Thread.sleep(2000);
		addcust.custsubmit();
			
		Thread.sleep(3000);
		loggers.info("validation started");
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		if(res==true)
		{
			Assert.assertTrue(true);
			loggers.info("test case passed...");
		}
		
		else
		{	loggers.info("test case failed...");
			captureScreen(driver,"addNewCustmer");
			Assert.assertTrue(false);
		}
	}
	
	
	
}
