package com.InetBankingV1.testCases;

import org.testng.annotations.Test;

import com.InetBankingV1.pageObjects.DepositPage;
import com.InetBankingV1.pageObjects.LoginPage;

public class TC_DepositTest_004 extends BaseClass
{
	@Test
	public void addDeposit()
	{
		LoginPage lp=new LoginPage(driver);
		lp.setusername(username);
		lp.setpassword(password);
		lp.clicksubmit();
		
		
		DepositPage dp=new DepositPage(driver);
		dp.clickondeposit();
		dp.enteraccountno("1234567890");
		dp.enteramount("78247");
		dp.enterdescription("amount for party");
		dp.clickonsubmit();
	}
	
	
	
}
