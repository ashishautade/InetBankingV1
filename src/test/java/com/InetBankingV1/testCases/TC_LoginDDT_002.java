package com.InetBankingV1.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.InetBankingV1.pageObjects.LoginPage;
import com.InetBankingV1.utilities.XLUtils;

public class TC_LoginDDT_002 extends BaseClass
{
	@Test(dataProvider="logindata")
	public void loginDDT(String user,String pwd)
	{
		LoginPage lp=new LoginPage(driver);
		lp.setusername(user);
		loggers.info("username provided");
		lp.setpassword(pwd);
		loggers.info("password provided");
		lp.clicksubmit();
		
		if(isAlertPresent()==true)
		{
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			loggers.warn("login failed");
		}
		else
		{
			Assert.assertTrue(true);
			loggers.info("login passed");
			lp.clickLogout();
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			
		}
		
		
		
	}
	
	
	public boolean isAlertPresent()
	{	try
		{
			driver.switchTo().alert();
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	
	
	
	
	
	
	
	
	
	@DataProvider(name="logindata")
	String [][]getData() throws IOException
	{
		
		String path=System.getProperty("user.dir")+"/src/test/java/com/InetBankingV1/testData/logintestdata.xlsx";
		
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path, "Sheet1", 1);
		
		String logindata[][]=new String [rownum][colcount];
		
		for(int i=1;i<=colcount;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j);
			}
		}
	return logindata;
	}
}
