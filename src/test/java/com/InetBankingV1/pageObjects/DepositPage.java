package com.InetBankingV1.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DepositPage 
{
	 WebDriver driver;
	
	public DepositPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[@href='DepositInput.php']")
	@CacheLookup
	WebElement lnkDeposit;
	
	@FindBy(name="accountno")
	@CacheLookup
	WebElement txtaccountno;
	
	@FindBy(name="ammount")
	@CacheLookup
	WebElement txtamount;
	
	@FindBy(name="desc")
	@CacheLookup
	WebElement txtdescription;
	
	@FindBy(name="AccSubmit")
	@CacheLookup
	WebElement btnaccsubmit;
	
	
	public void clickondeposit()
	{
		lnkDeposit.click();
	}
	
	public void enteraccountno(String accno)
	{
		txtaccountno.sendKeys(accno);
	}
	
	public void enteramount(String amount)
	{
		txtamount.sendKeys(amount);
	}
	
	public void enterdescription(String desc)
	{
		txtdescription.sendKeys(desc);
	}
	
	public void clickonsubmit()
	{
		btnaccsubmit.click();
	}
	
}
